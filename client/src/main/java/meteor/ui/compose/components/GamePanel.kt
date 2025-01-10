package meteor.ui.compose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.zIndex
import meteor.Main
import meteor.ui.swing.PostProcessGamePanel

object GamePanel {
    @Composable
    fun Game() {
        //Swing panel isn't actually shown, it provides the client dimensions to work with
        SwingPanel(factory = { Main.gamePanel }, modifier = Modifier.fillMaxSize().background(Color.Transparent).zIndex(-1f))

        PostProcessGamePanel.imageBitmap.value?.let {
            Image(it, "", filterQuality = FilterQuality.High, contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize().zIndex(1f))
        }
    }
}