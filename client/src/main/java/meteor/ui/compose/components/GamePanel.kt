package meteor.ui.compose.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import meteor.Constants
import meteor.Main
import meteor.Main.forceRecomposition
import meteor.ui.compose.overlay.GameOverlayRoot

/**
 * This panel will contain the game view & compose overlays eventually
 */
object GamePanel {
    var xPadding = mutableStateOf(0f)
    var stretchedWidth = mutableStateOf(Constants.RS_DIMENSIONS.width)
    var stretchedHeight = mutableStateOf(Constants.RS_DIMENSIONS.height)
    var lastHeight = -1
    var lastHeightScale = -1f
    var lastWidth = -1
    var lastWidthScale = -1f

    @Composable
    fun Game() {
        forceRecomposition.value
        SwingPanel(factory = { Main.gamePanel }, modifier = Modifier.fillMaxSize())
        GameOverlayRoot.render()
    }

    fun getHeightScale(): Float {
        if (Main.windowState.value == Main.fixedState)
            return 1f
        if (Main.gamePanel.height == lastHeight)
            return lastHeightScale
        val windowSize: Int = Main.gamePanel.height
        val canvasSize: Int = Constants.RS_DIMENSIONS.height
        val scale = windowSize.toFloat() / canvasSize

        val s = (scale)
        lastHeight = Main.gamePanel.height
        lastHeightScale = s
        return s
    }

    fun getWidthScale(): Float {
        if (Main.windowState.value == Main.fixedState)
            return 1f
        if (Main.gamePanel.width == lastWidth)
            return lastWidthScale
        val windowSize: Int = Main.gamePanel.width
        val canvasSize: Int = Constants.RS_DIMENSIONS.width
        val scale = windowSize.toFloat() / canvasSize

        val s = (scale)
        lastWidth = Main.gamePanel.width
        lastWidthScale = s
        return s
    }
}