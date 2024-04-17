package meteor

import jagex2.client.Client
import meteor.impl.DrawFinished
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Color
import java.awt.Graphics
import java.awt.image.BufferedImage
import javax.swing.JPanel

/**
 * All drawing is done to the background of this, we should move to the BufferedImage for manipulation
 */
class GamePanel(private val w: Int, val h: Int) : JPanel() {
    var loading = true
    init {
        Thread(kotlinx.coroutines.Runnable {
            while (loading) {
                Thread.sleep(1)
                graphics?.color = Color.BLACK
                graphics?.fillRect(0, 0, gameImage.width, gameImage.height)
                graphics?.drawImage(gameImage, 0, 0, null)
            }
        }).start()
        KEVENT.subscribe<DrawFinished> {
            loading = false
            graphics?.color = Color.BLACK
            graphics?.fillRect(0, 0, gameImage.width, gameImage.height)
            graphics?.drawImage(gameImage, 0, 0, null)
        }
    }
    val gameImage = BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB)
    private var graphics: Graphics? = null

    override fun paint(g: Graphics) {
        if (this.graphics == null)
            this.graphics = super.getGraphics()
    }

    override fun getGraphics(): Graphics? {
        return gameImage.createGraphics()
    }
}