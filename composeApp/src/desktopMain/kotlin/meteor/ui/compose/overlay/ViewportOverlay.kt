package meteor.ui.compose.overlay

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import meteor.Main
import meteor.ui.compose.GamePanel
import meteor.ui.compose.Util
import meteor.ui.config.AspectMode
import java.awt.Dimension
import java.awt.Point

object ViewportOverlay {
    val VIEWPORT_DIMENSIONS = Dimension(512,334)
    val VIEWPORT_OFFSETS = Point(8, 11)

    /**
     * This overlay layer is restricted to the viewport area
     */
    @Composable
    fun render() {
        val yScale = GamePanel.getHeightScale()
        val xScale = if (Main.client.aspectMode == AspectMode.FIT)
            yScale
        else
            GamePanel.getWidthScale()

        val offsetX = (VIEWPORT_OFFSETS.x * xScale).dp
        val offsetY = (VIEWPORT_OFFSETS.y * yScale).dp

        val width = (VIEWPORT_DIMENSIONS.width * xScale).dp
        val height = (VIEWPORT_DIMENSIONS.height * yScale).dp

        var mod = Modifier
            .absoluteOffset(x = offsetX, y = offsetY)
            .size(DpSize(width, height))
            .clipToBounds()
        if (Main.client.loggedIn() && GamePanel.debugOverlay.value)
            mod = mod.background(Color.Red.copy(alpha = .2f))

        Box(mod) {
            if (Main.client.loggedIn() && GamePanel.debugOverlay.value) {
                for (npc in Main.client.npcs.filterNotNull()) {
                    npc.type?.let {
                        Main.client.`projectFromGround$api`(npc, npc.height + 30)
                        Text(it.name, color = Color.Yellow, fontSize = 14.sp,
                            modifier = Modifier.absoluteOffset(
                                x = (Main.client.projectX * xScale).dp - Util.getCenteredTextOffset(it.name, 14.sp),
                                y = (Main.client.projectY * yScale).dp))
                    }
                }
                for (player in Main.client.players.filterNotNull()) {
                    Main.client.`projectFromGround$api`(player, player.height + 30)
                    player.name?.let {
                        Text(it, color = if (player == Main.client.localPlayer) Color.Magenta else Color.Yellow, fontSize = 14.sp,
                            modifier = Modifier.absoluteOffset(
                                x = (Main.client.projectX * xScale).dp - Util.getCenteredTextOffset(it, 14.sp),
                                y = (Main.client.projectY * yScale).dp))
                    }
                }
            }
        }
    }
}