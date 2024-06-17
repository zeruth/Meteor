package meteor.ui.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import meteor.Main
import meteor.ui.compose.overlay.GameOverlay
import net.runelite.rs.api.RSGameShell
import java.applet.Applet
import java.awt.Canvas
import java.awt.KeyboardFocusManager
import javax.swing.JPanel


/**
 * This panel will contain the game view & compose overlays eventually
 */
object GamePanel {
    var xPadding = mutableStateOf(0f)
    var stretchedWidth = mutableStateOf(0)
    var stretchedHeight = mutableStateOf(0)
    var debugOverlay = mutableStateOf(false)

    var lastHeight = -1
    var lastHeightScale = -1f
    var lastWidth = -1
    var lastWidthScale = -1f

    val gamePanel = JPanel()
    val canvas = Canvas()

    @Composable
    fun RS2GameView() {
        SwingPanel(factory = { gamePanel.apply {
            Main.client.canvas = canvas
            add(canvas)

            gamePanel.addKeyListener(Main.client as RSGameShell)

            gamePanel.addMouseListener(Main.client as RSGameShell)
            gamePanel.addMouseMotionListener(Main.client as RSGameShell)
            gamePanel.addMouseWheelListener(Main.client as RSGameShell)
        } }, modifier = Modifier.fillMaxSize())
        GameOverlay.render()
    }

    fun getHeightScale(): Float {
        if (Main.gamePanel.height == lastHeight)
            return lastHeightScale
        val windowSize: Int = Main.gamePanel.height
        val canvasSize: Int = Main.client.gamePanel?.height ?: Main.initialSize.height
        val scale = windowSize.toFloat() / canvasSize

        val s = (scale)
        lastHeight = Main.gamePanel.height
        lastHeightScale = s
        return s
    }

    fun getWidthScale(): Float {
        if (Main.gamePanel.width == lastWidth)
            return lastWidthScale
        val windowSize: Int = Main.gamePanel.width
        val canvasSize: Int = Main.client.gamePanel?.width ?: Main.initialSize.width
        val scale = windowSize.toFloat() / canvasSize

        val s = (scale)
        lastWidth = Main.gamePanel.width
        lastWidthScale = s
        return s
    }
}