package meteor.ui.compose.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import meteor.Constants
import meteor.Main
import meteor.Main.forceRecomposition

/**
 * This panel will contain the game view & compose overlays eventually
 */
object GamePanel {
    var xPadding = mutableStateOf(0f)
    var yPadding = mutableStateOf(0f)
    var stretchedWidth = mutableStateOf(Constants.RS_DIMENSIONS.width)
    var stretchedHeight = mutableStateOf(Constants.RS_DIMENSIONS.height)

    @Composable
    fun Game() {
        forceRecomposition.value
        SwingPanel(factory = { Main.gamePanel }, modifier = Modifier.fillMaxSize())
    }
}