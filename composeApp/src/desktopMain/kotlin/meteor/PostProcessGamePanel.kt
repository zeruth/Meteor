package meteor

import jagex2.client.Client
import meteor.Configuration.STRETCH_TO_FILL
import meteor.impl.BufferedDrawFinished
import org.rationalityfrontline.kevent.KEVENT
import javax.swing.JPanel

/**
 *  Handle scaling / stretching / post-processing
 */
class PostProcessGamePanel : JPanel() {
    companion object {
        var stretchedWidth = -1
        var stretchedHeight = -1
        var padding = 0
        var lastScale = 0f
    }
    init {
        KEVENT.subscribe<BufferedDrawFinished> {
            val scale = getScale()
            stretchedWidth = (789 * scale).toInt()
            stretchedHeight = (531 * scale).toInt()
            lastScale = scale
            padding = (width - stretchedWidth) / 2

            if (STRETCH_TO_FILL) {
                padding = 0
                super.getGraphics()?.drawImage(it.data.image, padding, 0,
                    width, height,this)
            } else { //FIT_TO_SCREEN
                super.getGraphics()?.drawImage(it.data.image, padding, 0,
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
}