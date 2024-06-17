package meteor.ui.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import meteor.Hooks
import meteor.Main
import meteor.Main.client
import meteor.ui.compose.GamePanel.RS2GameView
import java.applet.Applet

/**
 * The main entry point to the Compose UI
 */
object Window {
    @Composable
    fun MeteorWindow() {
        RS2GameView()
        client.callbacks = Hooks
        client.`initClient$api`(emptyArray())
        client.`initWindow$api`()
    }
}