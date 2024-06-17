package meteor

import meteor.Main.client
import meteor.input.KeyManager
import meteor.input.MouseManager
import meteor.ui.compose.GamePanel
import meteor.ui.compose.GamePanel.gamePanel
import net.runelite.api.Constants
import net.runelite.api.hooks.Callbacks
import org.rationalityfrontline.kevent.KEVENT
import java.awt.*
import java.awt.event.KeyEvent
import java.awt.event.MouseEvent
import java.awt.event.MouseWheelEvent
import java.awt.image.BufferedImage
import java.awt.image.VolatileImage

object Hooks : Callbacks {

    class PendingEvent(val event: Any)

    private var pendingEvents = ArrayList<PendingEvent>()

    override fun post(event: Any) {
        KEVENT.post(event)
    }

    override fun postDeferred(event: Any) {
        pendingEvents.add(PendingEvent(event))
    }

    override fun tick() {

    }

    override fun frame() {

    }

    override fun updateNpcs() {

    }

    override fun drawScene(pixels: IntArray?) {

    }

    override fun drawAboveOverheads() {

    }

    private lateinit var gameImage: Image
    lateinit var finalImage: Image
    var lastWidth = -1
    var lastHeight = -1
    var skipNextFrame = false

    private var lastStretchedDimensions: Dimension? = null
    private var lastRealDimensions: Dimension? = null
    private var stretchedImage: VolatileImage? = null
    private var stretchedGraphics: Graphics2D? = null

    override fun draw(mainBufferProvider: Image, x: Int, y: Int) {
        client.invalidateStretching(true)

        gameImage = if (client.isStretchedEnabled || client.isSleeping)
            copy(mainBufferProvider).getSubimage(0, 0, Constants.GAME_FIXED_WIDTH, Constants.GAME_FIXED_HEIGHT)
        else
            copy(mainBufferProvider)
        val graphics2d: Graphics2D = gameImage.graphics as Graphics2D

        // Stretch the game image if the user has that enabled
        if (client.isStretchedEnabled) {
            gamePanel.graphicsConfiguration ?: return
            val gc: GraphicsConfiguration = gamePanel.graphicsConfiguration
            val stretchedDimensions: Dimension = client.stretchedDimensions
            var status = -1
            if (stretchedDimensions != lastStretchedDimensions || stretchedImage == null || stretchedImage!!.validate(
                    gc
                ).also { status = it } != VolatileImage.IMAGE_OK
            ) {
                // if IMAGE_INCOMPATIBLE the image and g2d need to be rebuilt, otherwise
                // if IMAGE_RESTORED only the g2d needs to be rebuilt
                stretchedGraphics?.dispose()

                if (stretchedDimensions != lastStretchedDimensions || stretchedImage == null || status == VolatileImage.IMAGE_INCOMPATIBLE) {
                    // VolatileImage javadocs says this proactively releases the resources used by the VolatileImage
                    stretchedImage?.flush()

                    if (stretchedDimensions.width <= 0 || stretchedDimensions.height <= 0)
                        return
                    stretchedImage =
                        gc.createCompatibleVolatileImage(stretchedDimensions.width, stretchedDimensions.height)
                    lastStretchedDimensions = stretchedDimensions
                }
                stretchedGraphics = stretchedImage!!.graphics as Graphics2D
            }

            stretchedGraphics!!.setRenderingHint(
                RenderingHints.KEY_INTERPOLATION,
                if (client.isStretchedFast) RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR else RenderingHints.VALUE_INTERPOLATION_BILINEAR
            )
            stretchedGraphics!!.drawImage(gameImage, 0, 0, stretchedDimensions.width, stretchedDimensions.height, null)

            finalImage = stretchedImage!!
        } else {
            finalImage = gameImage
        }

        if (!client.isStretchedEnabled) {
            client.`updateBounds$api`(gamePanel.width, gamePanel.height)
        } else {
            client.`updateBounds$api`(Constants.GAME_FIXED_WIDTH, Constants.GAME_FIXED_HEIGHT)
        }

        if (!skipNextFrame)
        // Draw the image onto the game canvas
            gamePanel.graphics.drawImage(finalImage, 0, 0, null)
        else
            skipNextFrame = false

        if (!client.isStretchedEnabled) {
            if (client.gameWidth != lastWidth || client.gameHeight != lastHeight) {
                client.`createMessageTabPanel$api`()
                lastWidth = client.gameWidth
                lastHeight = client.gameHeight
                skipNextFrame = true
            }
        } else {
            if (client.gameWidth != Constants.GAME_FIXED_WIDTH || client.gameHeight != Constants.GAME_FIXED_HEIGHT - 12) {
                client.`createMessageTabPanel$api`()
                skipNextFrame = true
            }
        }
    }

    private fun copy(src: Image): BufferedImage {
        val width = src.getWidth(null)
        val height = src.getHeight(null)
        val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
        val graphics = image.graphics
        graphics.drawImage(src, 0, 0, width, height, null)
        graphics.dispose()
        return image
    }

    var mouseWheelPressed = false

    override fun mousePressed(mouseEvent: MouseEvent): MouseEvent {

        // Get the currently focused component
        val focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().focusOwner

        if (focusedComponent != null) {
            if (focusedComponent.toString().contains("SkiaLayer")) {
                focusedComponent.isFocusable = false
                gamePanel.requestFocus()
                println("Forced keyboard focus away from Compose: $focusedComponent")
            }
        }

        val newEvent = MouseManager.processMousePressed(mouseEvent)
        if (mouseEvent.button == MouseEvent.BUTTON2)
            mouseWheelPressed = true
        return newEvent
    }

    fun checkInventoryClicked(click: MouseEvent): Boolean {
        return click.x >= Constants.GAME_FIXED_WIDTH - 35
                && click.y >= 3
                && click.x < Constants.GAME_FIXED_WIDTH - 3
                && click.y < 35
    }

    override fun mouseReleased(mouseEvent: MouseEvent): MouseEvent {
        if (mouseEvent.button == MouseEvent.BUTTON2)
            mouseWheelPressed = false
        return MouseManager.processMouseReleased(mouseEvent)
    }

    override fun mouseClicked(mouseEvent: MouseEvent): MouseEvent {
        return MouseManager.processMouseClicked(mouseEvent)
    }

    override fun mouseEntered(mouseEvent: MouseEvent): MouseEvent {
        return MouseManager.processMouseEntered(mouseEvent)
    }

    override fun mouseExited(mouseEvent: MouseEvent): MouseEvent {
        return MouseManager.processMouseExited(mouseEvent)
    }

    override fun mouseDragged(mouseEvent: MouseEvent): MouseEvent {
        val xGain = mouseEvent.x - lastMouseX
        lastMouseX = mouseEvent.x
        if (mouseWheelPressed) {
            if (xGain > 0)
                client.cameraRotation += 1
            if (xGain < 0)
                client.cameraRotation -= 1
        }
        return MouseManager.processMouseDragged(mouseEvent)
    }

    var lastMouseX = 0

    override fun mouseMoved(mouseEvent: MouseEvent): MouseEvent {
        return MouseManager.processMouseMoved(mouseEvent)
    }

    override fun mouseWheelMoved(mouseEvent: MouseWheelEvent): MouseWheelEvent {
        val newScale = client.scale + mouseEvent.wheelRotation * 40
        if (newScale > 4000 || newScale < 100)
            return MouseManager.processMouseWheelMoved(mouseEvent)
        client.scale = newScale
        return MouseManager.processMouseWheelMoved(mouseEvent)
    }

    override fun keyPressed(keyEvent: KeyEvent) {
        if (client.showOptionsMenu)
            if (keyEvent.keyCode == KeyEvent.VK_1) {
                client.`chooseOption$api`(0)
                keyEvent.consume()
            }
        if (client.showOptionsMenu)
            if (keyEvent.keyCode == KeyEvent.VK_2) {
                client.`chooseOption$api`(1)
                keyEvent.consume()
            }
        if (client.showOptionsMenu)
            if (keyEvent.keyCode == KeyEvent.VK_3) {
                client.`chooseOption$api`(2)
                keyEvent.consume()
            }
        if (client.showOptionsMenu)
            if (keyEvent.keyCode == KeyEvent.VK_4) {
                client.`chooseOption$api`(3)
                keyEvent.consume()
            }
        if (client.showOptionsMenu)
            if (keyEvent.keyCode == KeyEvent.VK_5) {
                client.`chooseOption$api`(4)
                keyEvent.consume()
            }
        if (client.showOptionsMenu)
            if (keyEvent.keyCode == KeyEvent.VK_6) {
                client.`chooseOption$api`(5)
                keyEvent.consume()
            }
        if (keyEvent.keyCode == KeyEvent.VK_ESCAPE)
            client.setShowUITab(0)
        return KeyManager.processKeyPressed(keyEvent)
    }

    override fun keyReleased(keyEvent: KeyEvent) {
        return KeyManager.processKeyReleased(keyEvent)
    }

    override fun keyTyped(keyEvent: KeyEvent) {
        return KeyManager.processKeyTyped(keyEvent)
    }
}