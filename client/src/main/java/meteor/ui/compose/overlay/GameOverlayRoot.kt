package meteor.ui.compose.overlay

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import meteor.Constants
import meteor.Main
import meteor.Main.forceRecomposition
import meteor.ui.compose.components.GamePanel
import meteor.ui.compose.events.PreRender
import meteor.ui.compose.overlay.Overlay.Companion.debugOverlays
import meteor.ui.compose.overlay.ViewportOverlayRoot.height
import meteor.ui.compose.overlay.ViewportOverlayRoot.width
import org.rationalityfrontline.kevent.KEVENT

object GameOverlayRoot {
    val gameOverlays = ArrayList<GameOverlay>()
    /**
     * This overlay layer covers the entire game area
     */
    @Composable
    fun render() {
        forceRecomposition.value
        KEVENT.post(PreRender)
        val compositionStart = System.currentTimeMillis()
        var mod = if (Main.windowState.value == Main.fixedState) {
            Modifier.size(DpSize(Constants.RS_DIMENSIONS.width.dp, Constants.RS_DIMENSIONS.height.dp))
                .clipToBounds()
        } else {
            Modifier.absoluteOffset(x = GamePanel.xPadding.value.dp, y = GamePanel.yPadding.value.dp)
                .size(DpSize(GamePanel.stretchedWidth.value.dp, GamePanel.stretchedHeight.value.dp))
                .clipToBounds()
        }
        if (Main.client.isLoggedIn() && debugOverlays.value)
            mod = mod.background(Color.Cyan.copy(alpha = .2f))
        Box(mod) {
            ViewportOverlayRoot.render()
        }
        Main.composeTime.value = System.currentTimeMillis() - compositionStart
    }
}