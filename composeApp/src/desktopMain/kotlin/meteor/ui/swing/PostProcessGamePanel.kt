package meteor.ui.swing

import jagex2.client.Client
import meteor.Configuration.FILTER
import meteor.Configuration.FILTER_GPU
import meteor.Configuration.GPU
import meteor.Configuration.STRETCH_TO_FILL
import meteor.Main
import meteor.impl.BufferedDrawFinished
import meteor.impl.DrawFinished
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
        var stretchedWidth = -1
        var stretchedHeight = -1
        var padding = 0
        var lastScale = 0f
        var filter = CV_INTER_CUBIC
    }
    init {
        //Loading
        Thread(kotlinx.coroutines.Runnable {
            while (loading) {
                //Must sleep 1ms to draw correctly on fast cpus
                Thread.sleep(1)
                RS2GamePanel.image?.let { draw() }
            }
        }).start()

        //Login/In-game
        KEVENT.subscribe<DrawFinished> {
            //Kill the loading drawing thread
            loading = false
            checkFocus()
            draw()
        }
    }

    fun draw() {
        val image = RS2GamePanel.image
        val scale = getScale()
        stretchedWidth = (789 * scale).toInt()
        stretchedHeight = (531 * scale).toInt()
        lastScale = scale
        if (!STRETCH_TO_FILL)
            padding = (width - stretchedWidth) / 2

        super.getGraphics()?.let {
            graphics2D = it as Graphics2D
        }

        graphics2D?.let {
            var outputImage = image
            if (GPU) {
                Main.text.value = "Meteor 2.0.0 (GPU)"
                try {
                    val inputMat: Mat = Java2DFrameUtils.toMat(image)
                    var outputMat = Mat()

                    //Color filtering
                    //opencv_imgproc.cvtColor(inputMat, inputMat, opencv_imgproc.COLOR_RGBA2BGR);

                    //Color mapping
                    //opencv_imgproc.applyColorMap(inputMat, inputMat, opencv_imgproc.COLORMAP_RAINBOW);

                    if (FILTER_GPU) {
                        opencv_imgproc.resize(
                            inputMat,
                            outputMat,
                            Size(width - (padding * 2), height),
                            0.toDouble(),
                            0.toDouble(),
                            filter
                        )
                    } else {
                        outputMat = inputMat
                    }

                    outputImage = Java2DFrameUtils.toBufferedImage(outputMat)
                } catch (e: Exception) {
                    e.printStackTrace()
                    println("Error occurred during GPU upscaling, disabling...")
                    GPU = false
                }
            } else {
                Main.text.value = "Meteor 2.0.0"
                if (FILTER) {
                    it.setRenderingHints(hints)
                }
            }



            if (STRETCH_TO_FILL) {
                padding = 0
                it.drawImage(outputImage, padding, 0,
                    width, height,this)
            } else { //FIT_TO_SCREEN
                it.drawImage(outputImage, padding, 0,
                    stretchedWidth, stretchedHeight,this)
            }
        }

    }

    private fun getScale(): Float {
        val windowSize: Int = height
        val canvasSize: Int = Client.gamePanel.height
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