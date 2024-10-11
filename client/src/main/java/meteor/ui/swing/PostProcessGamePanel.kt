package meteor.ui.swing

import androidx.compose.ui.unit.dp
import meteor.Constants.RS_DIMENSIONS
import meteor.Main
import meteor.Main.forceRecomposition
import meteor.events.DrawFinished
import meteor.ui.compose.components.GamePanel
import meteor.ui.compose.components.GamePanel.stretchedHeight
import meteor.ui.compose.components.GamePanel.stretchedWidth
import meteor.ui.compose.components.GamePanel.xPadding
import meteor.ui.compose.components.GamePanel.yPadding
import meteor.ui.compose.components.Window.gameWidth
import meteor.ui.compose.components.Window.panelOpen
import meteor.ui.config.AspectMode
import meteor.ui.config.CPUFilter
import meteor.ui.config.RenderMode
import org.rationalityfrontline.kevent.KEVENT
import java.awt.*
import java.awt.image.BufferedImage
import javax.swing.JPanel


/**
 *  Handle scaling / stretching / post-processing
 */
class PostProcessGamePanel : JPanel() {
    private var graphics2D: Graphics2D? = null
    private val hints = RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR)
    private var loading = true

    init {
        //Loading
        Thread {
            while (loading) {
                //Must sleep 1ms to draw correctly on fast cpus
                Thread.sleep(1)
                RS2GamePanel.image?.let { draw() }
            }
        }.start()

        //Login/In-game
        KEVENT.subscribe<DrawFinished> {
            //Forces compose overlays to update every frame
            forceRecomposition.value = !forceRecomposition.value
            //Kill the loading drawing thread
            loading = false
            checkFocus()
            draw()
            gameWidth.value = Main.gamePanel.width.dp
        }
    }

    fun draw() {
        val timer = System.currentTimeMillis()
        super.getGraphics()?.let {
            graphics2D = it as Graphics2D
            val finalImage = RS2GamePanel.image!!
            updateSizeAndScale(finalImage)
            drawToSurface(it, finalImage)
        }
        Main.swingTime.value = System.currentTimeMillis() - timer
    }

    private fun updateSizeAndScale(finalImage: BufferedImage) {
        val scale = getScale(finalImage)
        var stretchedWidth = width
        var stretchedHeight = height
        if (Main.client.aspectMode == AspectMode.FIT) {
            stretchedWidth = (RS_DIMENSIONS.width * scale).toInt()
            stretchedHeight = (RS_DIMENSIONS.height * scale).toInt()
        }

        GamePanel.stretchedWidth.value = stretchedWidth
        GamePanel.stretchedHeight.value = stretchedHeight

        if (Main.client.aspectMode == AspectMode.FIT)
            updatePadding(true, finalImage)
        else
            updatePadding(false, finalImage)
    }

    private fun drawToSurface(graphics: Graphics2D, finalImage: BufferedImage) {
        graphics.color = Color.BLACK
        when (Main.client.aspectMode) {
            AspectMode.FIT -> {
                if (xPadding.value > 0) {
                    graphics.fillRect(0, 0, xPadding.value.toInt(), height)
                    graphics.fillRect(stretchedWidth.value + xPadding.value.toInt(), 0, xPadding.value.toInt(), height)
                    graphics.fillRect(0, stretchedHeight.value, width, 5)
                }
                if (yPadding.value > 0) {
                    graphics.fillRect(0, 0, width, yPadding.value.toInt())
                    graphics.fillRect(0, stretchedHeight.value + yPadding.value.toInt(), width, yPadding.value.toInt() + 5)
                }
            }
            else -> {}
        }
        if (Main.client.cpuFilter == CPUFilter.BILINEAR) {
            graphics.setRenderingHints(hints)
        }
        if (Main.windowState.value == Main.fixedState) {
            graphics.drawImage(finalImage, 0, 0, finalImage.width, finalImage.height, this)
            return
        }

        when (Main.client.aspectMode) {
            AspectMode.FIT -> {
                graphics.drawImage(
                    finalImage, Main.client.xPadding.toInt(), Main.client.yPadding.toInt(),
                    stretchedWidth.value, stretchedHeight.value, this
                )
            }

            AspectMode.FILL -> graphics.drawImage(finalImage, 0, 0, width, height, this)
            else -> {}
        }
    }

    private fun updatePadding(fit: Boolean, finalImage: BufferedImage) {
        if (!fit) {
            Main.client.xPadding = 0f
            GamePanel.xPadding.value = 0f
            Main.client.yPadding = 0f
            GamePanel.yPadding.value = 0f
            return
        }
        Main.client.yPadding = ((height - stretchedHeight.value.toFloat()) / 2).coerceAtLeast(0f)
        GamePanel.yPadding.value = Main.client.yPadding
        Main.client.xPadding = ((width - stretchedWidth.value.toFloat()) / 2).coerceAtLeast(0f)
        GamePanel.xPadding.value = Main.client.xPadding
    }

    private fun setCPURenderingHints(graphics2D: Graphics2D) {
        if (Main.client.cpuFilter == CPUFilter.BILINEAR) {
            println("using bilinear")
            graphics2D.setRenderingHints(hints)
        }
    }

    private fun getScale(finalImage: BufferedImage): Float {
        val heightScale = height.toFloat() / finalImage.height
        val widthScale = width.toFloat() / finalImage.width
        return if (widthScale < heightScale) widthScale else heightScale
    }

    fun isHeightScaling(finalImage: BufferedImage) : Boolean {
        val heightScale = height.toFloat() / finalImage.height
        val widthScale = width.toFloat() / finalImage.width
        return if (widthScale < heightScale) false else true
    }

    /**
     * This fixes a compose bug where focus would be lost every click causing subsequent keystrokes to be ignored.
     */
    private fun checkFocus() {
        if (Main.window.isFocused) {
            val focusOwner = KeyboardFocusManager.getCurrentKeyboardFocusManager().focusOwner
            if (!panelOpen.value) {
                focusOwner?.let {
                    if (it::class.java.toString().contains("org.jetbrains.skiko.SkiaLayer")) {
                        Main.gamePanel.grabFocus()
                    }
                }
                if (focusOwner == null) {
                    Main.gamePanel.grabFocus()
                }
            }
        }
    }
}