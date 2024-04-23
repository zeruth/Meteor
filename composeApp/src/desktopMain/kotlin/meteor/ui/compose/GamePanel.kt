package meteor.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.draw.scale
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
    var stretchedWidth = mutableStateOf(0)
    var stretchedHeight = mutableStateOf(0)
    var debugOverlay = mutableStateOf(false)

    @Composable
    fun RS2GameView() {
        SwingPanel(factory = { Main.gamePanel }, modifier = Modifier.fillMaxSize())
        RS2Overlay()
    }

    @Composable
    fun RS2Overlay() {
        var mod = Modifier.absoluteOffset(x = xPadding.value.dp)
            .size(DpSize(stretchedWidth.value.dp, stretchedHeight.value.dp))
        if (debugOverlay.value)
            mod = mod.background(Color.Cyan.copy(alpha = .2f))
        Box(mod) {
            //TODO: Remove this as it's just to verify compose / swing interop isn't broken
            Text(Main.text.value, color = Color.Cyan, fontSize = 8.sp, modifier = Modifier.fillMaxSize())
        }
    }
}