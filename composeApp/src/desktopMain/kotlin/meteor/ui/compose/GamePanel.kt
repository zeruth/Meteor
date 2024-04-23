package meteor.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import meteor.Constants.RS_DIMENSIONS
import meteor.Main

/**
 * This panel will contain the game view & compose overlays eventually
 */
object GamePanel {
    var xPadding = mutableStateOf(0f)

    @Composable
    fun RS2GameView() {
        SwingPanel(factory = { Main.gamePanel }, modifier = Modifier.fillMaxSize())

        val overlaySize = DpSize(Main.client.stretchedWidth.dp, Main.client.stretchedHeight.dp)
        Box(modifier = Modifier.size(overlaySize).absoluteOffset(x = xPadding.value.dp)) {
            //TODO: Remove this as it's just to verify compose / swing interop isn't broken
            Text(Main.text.value, color = Color.Cyan, fontSize = 8.sp, modifier = Modifier.fillMaxSize())
        }
    }
}