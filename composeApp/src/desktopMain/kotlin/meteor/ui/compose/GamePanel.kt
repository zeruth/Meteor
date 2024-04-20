package meteor.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import meteor.Constants.RS_DIMENSIONS
import meteor.Main
import meteor.ui.config.FillMode

/**
 * This panel will contain the game view & compose overlays eventually
 */
object GamePanel {

    @Composable
    fun RS2GameView() {
        SwingPanel(factory = { Main.gamePanel }, modifier = Modifier.fillMaxSize())

        //We only want to overlay the space the game takes up
        val scale = Main.window.height / RS_DIMENSIONS.height.toFloat()
        val actualWidth = Main.gamePanel.width - (Main.xPadding.value * 2)

        Box(modifier = Modifier.width(actualWidth.dp).height((RS_DIMENSIONS.height * scale).dp)
            .absoluteOffset(x = (Main.xPadding.value).dp)
        ) {
            //TODO: Remove this as it's just to verify compose / swing interop isn't broken
            Text(Main.text.value, color = Color.Cyan, fontSize = 8.sp, modifier = Modifier.fillMaxSize())
        }
    }
}