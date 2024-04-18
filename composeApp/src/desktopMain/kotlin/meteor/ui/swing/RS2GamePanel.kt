package meteor.ui.swing

import meteor.Configuration
import meteor.Main
import meteor.impl.BufferedDrawFinished
import meteor.impl.DrawFinished
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Dimension
import java.awt.Graphics
import java.awt.KeyboardFocusManager
import java.awt.image.BufferedImage
import javax.swing.JPanel

/**
 * Double buffered RS2 image
 */
class RS2GamePanel(w: Int, h: Int) : JPanel() {
    var image = BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB)
    var bufferedImage = BufferedImage(image.width, image.height, BufferedImage.TYPE_INT_ARGB)
    var bufferedGraphics = bufferedImage.createGraphics()

    var loading = true

    init {
        size = Dimension(Configuration.DIMENSIONS.width, Configuration.DIMENSIONS.height)

        //Loading
        Thread(kotlinx.coroutines.Runnable {
            while (loading) {
                //Must sleep 1ms to draw correctly on fast cpus
                Thread.sleep(1)
                drawAndPost()
            }
        }).start()

        //Login/In-game
        KEVENT.subscribe<DrawFinished> {
            //Kill the loading drawing thread
            loading = false
            checkFocus()
            drawAndPost()
        }
    }

    private fun drawAndPost() {
        //Double buffer
        bufferedGraphics?.drawImage(image, 0, 0, this)
        //Post
        KEVENT.post(BufferedDrawFinished(bufferedImage))
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

    //Override rs2 surface graphics
    override fun getGraphics(): Graphics? {
        return bufferedImage.graphics
    }
}