package meteor.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import meteor.Main
import meteor.ui.config.AspectMode
import java.awt.Dimension
import java.awt.Point

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
    val VIEWPORT_DIMENSIONS = Dimension(512,334)
    val VIEWPORT_OFFSETS = Point(8, 11)

    /**
     * This overlay layer is restricted to the viewport area
     */
    @Composable
    fun RS2ViewportOverlay() {
        val yScale = getHeightScale()
        val xScale = if (Main.client.aspectMode == AspectMode.FIT)
            yScale
        else
            getWidthScale()
        var mod = Modifier
            .absoluteOffset(
                x = (VIEWPORT_OFFSETS.x * xScale).dp,
                y = (VIEWPORT_OFFSETS.y * yScale).dp)
            .size(DpSize((VIEWPORT_DIMENSIONS.width * xScale).dp, (VIEWPORT_DIMENSIONS.height * yScale).dp))
            .clipToBounds()
        if (Main.client.loggedIn() && debugOverlay.value)
            mod = mod.background(Color.Red.copy(alpha = .2f))
        Box(mod) {
            if (Main.client.loggedIn() && debugOverlay.value) {
                for (npc in Main.client.npcs.filterNotNull()) {
                    npc.type?.let {
                        Main.client.`projectFromGround$api`(npc, npc.height + 30)
                        if (Main.client.projectX > 0 && Main.client.projectY > 0)
                            Text(it.name, color = Color.Magenta, fontSize = 14.sp,
                                modifier = Modifier.absoluteOffset(
                                    x = (Main.client.projectX * xScale).dp - Util.getCenteredTextOffset(it.name, 14.sp),
                                    y = (Main.client.projectY * yScale).dp))
                    }
                }
                Main.client.localPlayer?.let {
                    it.name?.let { name ->
                        Main.client.`projectFromGround$api`(it, it.height + 30)
                        if (Main.client.projectX > 0 && Main.client.projectY > 0)
                            Text(name, color = Color.Magenta, fontSize = 14.sp,
                                modifier = Modifier.absoluteOffset(
                                    x = (Main.client.projectX * xScale).dp - Util.getCenteredTextOffset(name, 14.sp),
                                    y = (Main.client.projectY * yScale).dp))
                    }
                }
            }
        }
    }

    /**
     * This overlay layer covers the entire game area
     * stretchedWidth/Height is updated every frame, so this composable will be to.
     */
    @Composable
    fun RS2Overlay() {
        val scale = getHeightScale()
        var mod = Modifier.absoluteOffset(x = xPadding.value.dp)
            .size(DpSize(stretchedWidth.value.dp, stretchedHeight.value.dp))
            .clipToBounds()
        if (Main.client.loggedIn() && debugOverlay.value)
            mod = mod.background(Color.Cyan.copy(alpha = .2f))
        Box(mod) {
            RS2ViewportOverlay()
            //TODO: Remove this as it's just to verify compose / swing interop isn't broken
            Text(Main.text.value, color = Color.Cyan, fontSize = 8.sp, modifier = Modifier.fillMaxSize())
        }
    }

    var lastHeight = -1
    var lastHeightScale = -1f

    private fun getHeightScale(): Float {
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

    var lastWidth = -1
    var lastWidthScale = -1f

    private fun getWidthScale(): Float {
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