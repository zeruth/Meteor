package meteor.ui.swing

import jagex2.client.Client
import meteor.Configuration.CPU_LINEAR
import meteor.Main
import meteor.events.DrawFinished
import meteor.ui.config.FillMode
import meteor.ui.config.GPUFilter
import meteor.ui.config.RenderMode
import org.bytedeco.javacv.Java2DFrameUtils
import org.bytedeco.opencv.global.opencv_imgproc
import org.bytedeco.opencv.global.opencv_imgproc.CV_INTER_CUBIC
import org.bytedeco.opencv.opencv_core.Mat
import org.bytedeco.opencv.opencv_core.Size
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Graphics2D
import java.awt.KeyboardFocusManager
import java.awt.RenderingHints
import javax.swing.JPanel


/**
 *  Handle scaling / stretching / post-processing
 */
class PostProcessGamePanel : JPanel() {
    private var graphics2D: Graphics2D? = null
    private val hints = RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR)
    private var loading = true
    companion object {
        var stretchedWidth = -1f
        var stretchedHeight = -1f
        var lastScale = 0f
        var filter = CV_INTER_CUBIC
    }
    init {
        //Loading
        Thread(kotlinx.coroutines.Runnable {
            while (loading) {
                //Must sleep 1ms to draw correctly on fast cpus
                Thread.sleep(1)

                if (Main.loaded && Main.windowWidth.value != Main.window.width)
                    Main.windowWidth.value = Main.window.width
                RS2GamePanel.image?.let { draw() }
            }
        }).start()

        //Login/In-game
        KEVENT.subscribe<DrawFinished> {
            //Kill the loading drawing thread
            loading = false
            if (Main.windowWidth.value != Main.window.width)
                Main.windowWidth.value = Main.window.width
            checkFocus()
            draw()
        }
    }

    fun draw() {
        val image = RS2GamePanel.image
        val scale = getScale()
        stretchedWidth = (789 * scale)
        stretchedHeight = (531 * scale)
        lastScale = scale
        if (Main.fillMode == FillMode.FIT)
            Main.xPadding.value = ((width - stretchedWidth) / 2)

        super.getGraphics()?.let {
            graphics2D = it as Graphics2D
        }

        graphics2D?.let {
            var outputImage = image
            when (Main.renderMode) {
                RenderMode.GPU -> {
                    Main.text.value = "Meteor 2.0.0 (GPU)"
                    try {
                        val inputMat: Mat = Java2DFrameUtils.toMat(image)
                        val outputMat = Mat()
                        if (stretchedWidth > 0 && stretchedHeight > 0) {
                            gpuResizeAndFilter(inputMat, outputMat)
                            outputImage = Java2DFrameUtils.toBufferedImage(outputMat)
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                        println("Error occurred during GPU upscaling, disabling...")
                        Main.renderMode = RenderMode.CPU
                    }
                }
                RenderMode.CPU -> {
                    Main.text.value = "Meteor 2.0.0"
                    if (CPU_LINEAR) {
                        it.setRenderingHints(hints)
                    }
                }
            }

            when (Main.fillMode) {
                FillMode.FIT -> {
                    it.drawImage(outputImage, Main.xPadding.value.toInt(), 0,
                        stretchedWidth.toInt(), stretchedHeight.toInt(),this)
                }
                FillMode.FILL -> {
                    Main.xPadding.value = 0f
                    it.drawImage(outputImage, Main.xPadding.value.toInt(), 0,
                        width, height,this)
                }
            }
        }
    }

    private fun gpuColorOperations() {
        //Color filtering
        //opencv_imgproc.cvtColor(inputMat, inputMat, opencv_imgproc.COLOR_RGBA2BGR);

        //Color mapping
        //opencv_imgproc.applyColorMap(inputMat, inputMat, opencv_imgproc.COLORMAP_RAINBOW);
    }

    private fun gpuResizeAndFilter(inputMat: Mat, outputMat: Mat) {
        opencv_imgproc.resize(
            inputMat,
            outputMat,
            Size(stretchedWidth.toInt() + 12, stretchedHeight.toInt()),
            0.toDouble(),
            0.toDouble(),
            Main.gpuFilter.filter
        )
    }

    private fun getScale(): Float {
        val windowSize: Int = height
        val canvasSize: Int = Client.gamePanel?.height ?: Main.initialSize.height
        val scale = windowSize.toFloat() / canvasSize

        val s = (scale)
        return s
    }

    /**
     * This fixes a compose bug where focus would be lost every click causing subsequent keystrokes to be ignored.
     */
    private fun checkFocus() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().focusOwner?.let {
            if (it::class.java.toString().contains("org.jetbrains.skiko.SkiaLayer")) {
                it.isFocusable = false
                Main.gamePanel.grabFocus()
            }
        }
    }
}