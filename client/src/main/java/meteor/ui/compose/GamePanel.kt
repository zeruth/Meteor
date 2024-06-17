package meteor.ui.compose

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import meteor.Main
import meteor.ui.compose.overlay.GameOverlay

/**
 * This panel will contain the game view & compose overlays eventually
 */
object GamePanel {
    var xPadding = mutableStateOf(0f)
    var stretchedWidth = mutableStateOf(0)
    var stretchedHeight = mutableStateOf(0)
    var debugOverlays = mutableStateOf(false)
    var debugNpcs = mutableStateOf(false)
    var debugPlayers = mutableStateOf(false)
    var lastHeight = -1
    var lastHeightScale = -1f
    var lastWidth = -1
    var lastWidthScale = -1f

    @Composable
    fun GameView() {
        SwingPanel(factory = { Main.gamePanel }, modifier = Modifier.fillMaxSize())
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