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
    companion object {
        var image: BufferedImage? = null
    }
    private var graphics: Graphics? = null

    init {
        size = Dimension(Configuration.DIMENSIONS.width, Configuration.DIMENSIONS.height)
        image = BufferedImage(w, h, BufferedImage.TYPE_4BYTE_ABGR)
        graphics = image!!.createGraphics()
    }



    //Force rs2 to use our BufferedImage graphics (no need to draw before manipulation)
    override fun getGraphics(): Graphics? {
        return this.graphics
    }
}