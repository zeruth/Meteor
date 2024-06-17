package meteor.ui.swing

import net.runelite.api.Constants
import java.awt.Dimension
import java.awt.Graphics
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
        size = Dimension(Constants.GAME_FIXED_WIDTH, Constants.GAME_FIXED_HEIGHT)
        image = BufferedImage(w, h, BufferedImage.TYPE_4BYTE_ABGR)
        graphics = image!!.createGraphics()
    }



    //Force rs2 to use our BufferedImage graphics (no need to draw before manipulation)
    override fun getGraphics(): Graphics? {
        return this.graphics
    }
}