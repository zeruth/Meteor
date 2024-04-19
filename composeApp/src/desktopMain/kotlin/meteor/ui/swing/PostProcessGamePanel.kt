package meteor.ui.swing

import jagex2.client.Client
import meteor.Configuration.FILTER
import meteor.Configuration.STRETCH_TO_FILL
import meteor.impl.BufferedDrawFinished
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Graphics2D
import java.awt.RenderingHints
import javax.swing.JPanel

/**
 *  Handle scaling / stretching / post-processing
 */
class PostProcessGamePanel : JPanel() {
    private val hints = RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR)
    private var graphics2D: Graphics2D? = null
    companion object {
        var stretchedWidth = -1
        var stretchedHeight = -1
        var padding = 0
        var lastScale = 0f
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
                if (FILTER)
                    it.setRenderingHints(hints)

                if (STRETCH_TO_FILL) {
                    padding = 0
                    it.drawImage(event.data.image, padding, 0,
                        width, height,this)
                } else { //FIT_TO_SCREEN
                    it.drawImage(event.data.image, padding, 0,
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