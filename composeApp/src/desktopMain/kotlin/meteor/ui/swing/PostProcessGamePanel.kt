package meteor.ui.swing

import jagex2.client.Client
import meteor.Configuration.FILTER
import meteor.Configuration.FILTER_GPU
import meteor.Configuration.GPU
import meteor.Configuration.STRETCH_TO_FILL
import meteor.Main
import meteor.impl.BufferedDrawFinished
import org.bytedeco.javacv.Java2DFrameUtils
import org.bytedeco.opencv.global.opencv_imgproc
import org.bytedeco.opencv.global.opencv_imgproc.CV_INTER_CUBIC
import org.bytedeco.opencv.opencv_core.Mat
import org.bytedeco.opencv.opencv_core.Size
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Graphics2D
import java.awt.RenderingHints
import javax.swing.JPanel


/**
 *  Handle scaling / stretching / post-processing
 */
class PostProcessGamePanel : JPanel() {
    private var graphics2D: Graphics2D? = null
    val hints = RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR)
    private var printedGPUInfo = false
    companion object {
        var stretchedWidth = -1
        var stretchedHeight = -1
        var padding = 0
        var lastScale = 0f
        var filter = CV_INTER_CUBIC
    }
    init {
        KEVENT.subscribe<BufferedDrawFinished> { event ->
            val scale = getScale()
            stretchedWidth = (789 * scale).toInt()
            stretchedHeight = (531 * scale).toInt()
            lastScale = scale
            padding = (width - stretchedWidth) / 2

            super.getGraphics()?.let {
                graphics2D = it as Graphics2D
            }

            graphics2D?.let {
                var outputImage = event.data.image
                if (GPU) {
                    Main.text.value = "Meteor 2.0.0 (GPU)"
                    try {
                        if (!printedGPUInfo) {
                            //printCudaDeviceInfo(org.bytedeco.opencv.global.opencv_core.getDevice())
                            printedGPUInfo = true
                        }
                        val inputMat: Mat = Java2DFrameUtils.toMat(event.data.image)
                        var outputMat = Mat()

                        //Color filtering
                        //opencv_imgproc.cvtColor(inputMat, inputMat, opencv_imgproc.COLOR_RGBA2GRAY);

                        if (FILTER_GPU) {
                            opencv_imgproc.resize(
                                inputMat,
                                outputMat,
                                Size(width, height),
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
    }

    private fun getScale(): Float {
        val windowSize: Int = height
        val canvasSize: Int = Client.gamePanel.height
        val scale = windowSize.toFloat() / canvasSize

        val s = (scale)
        return s
    }
}