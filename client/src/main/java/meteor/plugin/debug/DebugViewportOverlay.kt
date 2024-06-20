package meteor.plugin.debug

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import meteor.Main
import meteor.ui.compose.components.GamePanel
import meteor.ui.compose.Util.getCenteredTextOffset
import meteor.ui.compose.overlay.ViewportOverlay
import meteor.ui.compose.overlay.ViewportOverlayRoot.polygons
import meteor.ui.compose.overlay.ViewportOverlayRoot.xScale
import meteor.ui.compose.overlay.ViewportOverlayRoot.yScale

object DebugViewportOverlay : ViewportOverlay() {
    override fun render(drawScope: DrawScope, textMeasurer: TextMeasurer) {
        drawScope.run {
            if (Main.client.loggedIn() && GamePanel.debugNpcs.value) {
                for (npc in Main.client.npcs.filterNotNull()) {
                    npc.type?.let {
                        Main.client.`projectFromGround$api`(npc, npc.height + 30)
                        if (Main.client.projectX != (-1) || Main.client.projectY != (-1)) {
                            val x = (Main.client.projectX * xScale!! * density).dp - getCenteredTextOffset(
                                textMeasurer,
                                it.name,
                                14.sp
                            ).dp
                            val y = (Main.client.projectY * yScale!! * density).dp
                            val style = TextStyle(color = Color.Yellow, fontSize = 14.sp)
                            val result = textMeasurer.measure(
                                it.name,
                                style
                            )
                            drawText(
                                textMeasurer,
                                it.name,
                                Offset(x.value, y.value),
                                size = Size(result.size.width.toFloat(), result.size.height.toFloat()),
                                style = style
                            )
                        }
                        npc.trueTilePoints?.let { points ->
                            polygons[points.toList()] = Color.Blue
                        }
                        npc.localTilePoints?.let { points ->
                            polygons[points.toList()] = Color.Yellow
                        }
                    }
                }
            }
            if (Main.client.loggedIn() && GamePanel.debugPlayers.value) {
                for (player in Main.client.players.filterNotNull()) {
                    Main.client.`projectFromGround$api`(player, player.height + 30)
                    player.name?.let {
                        val x = (Main.client.projectX * xScale!! * density).dp - getCenteredTextOffset(
                            textMeasurer,
                            it,
                            14.sp
                        ).dp
                        val y = (Main.client.projectY * yScale!! * density).dp
                        if (Main.client.projectX != (-1) || Main.client.projectY != (-1)) {
                            val style = TextStyle(
                                color = if (player == Main.client.localPlayer) Color.Magenta else Color.Yellow,
                                fontSize = 14.sp
                            )
                            val result = textMeasurer.measure(
                                it,
                                style
                            )
                            drawText(
                                textMeasurer,
                                it,
                                Offset(x.value, y.value),
                                size = Size(result.size.width.toFloat(), result.size.height.toFloat()),
                                style = style
                            )
                        }
                        player.trueTilePoints?.let { points ->
                            polygons[points.toList()] = Color.Cyan
                        }
                        player.localTilePoints?.let { points ->
                            polygons[points.toList()] = Color.Gray
                        }
                    }
                }
            }
            if (Main.client.loggedIn() && GamePanel.debugLocs.value) {
                //Animated Locs
                for (it in Main.client.locs.filterNotNull()) {
                    it.localTilePoints?.let { points ->
                        polygons[points.toList()] = Color.Blue
                    }
                    Main.client.`project$api`(
                        it.x * 128 + 64,
                        Main.client.`getHeightmapY$api`(
                            Main.client.getCurrentLevel(),
                            it.x * 128 + 64,
                            it.z * 128 + 64
                        ) - 60,
                        it.z * 128 + 64
                    )
                    val x = (Main.client.projectX * xScale!!).dp * density - getCenteredTextOffset(
                        textMeasurer,
                        "${it.id}",
                        14.sp
                    ).dp
                    val y = (Main.client.projectY * yScale!!).dp * density
                    if (Main.client.projectX > 0 || Main.client.projectY > 0) {
                        val style = TextStyle(color = Color.Blue, fontSize = 14.sp)
                        val result = textMeasurer.measure(
                            it.id.toString(),
                            style
                        )
                        drawText(
                            textMeasurer,
                            "${it.id}",
                            Offset(x.value, y.value),
                            size = Size(result.size.width.toFloat(), result.size.height.toFloat()),
                            style = style
                        )
                    }
                }
                for (x in Main.client.scene.tiles[Main.client.currentLevel])
                    for (tile in x.filterNotNull()) {
                        tile.wallDecoration?.let {
                            it.localTilePoints?.let { points ->
                                polygons[points.toList()] = Color.Red
                            }
                            Main.client.`project$api`(
                                it.x,
                                Main.client.`getHeightmapY$api`(Main.client.getCurrentLevel(), it.x, it.z) - 60,
                                it.z
                            )
                            val x = (Main.client.projectX * xScale!!).dp * density - getCenteredTextOffset(
                                textMeasurer,
                                "${it.id}",
                                14.sp
                            ).dp
                            val y = (Main.client.projectY * yScale!!).dp * density
                            if (Main.client.projectX > 0 || Main.client.projectY > 0) {
                                val style = TextStyle(color = Color.Red, fontSize = 14.sp)
                                val result = textMeasurer.measure(
                                    it.id.toString(),
                                    style
                                )
                                drawText(
                                    textMeasurer,
                                    "${it.id}",
                                    Offset(x.value, y.value),
                                    size = Size(result.size.width.toFloat(), result.size.height.toFloat()),
                                    style = style
                                )
                            }
                        }
                        tile.groundDecoration?.let {
                            it.localTilePoints?.let { points ->
                                polygons[points.toList()] = Color.White
                            }
                            Main.client.`project$api`(
                                it.x,
                                Main.client.`getHeightmapY$api`(Main.client.getCurrentLevel(), it.x, it.z) - 60,
                                it.z
                            )
                            val x = (Main.client.projectX * xScale!!).dp * density - getCenteredTextOffset(
                                textMeasurer,
                                "${it.id}",
                                14.sp
                            ).dp
                            val y = (Main.client.projectY * yScale!!).dp * density
                            if (Main.client.projectX > 0 || Main.client.projectY > 0) {
                                val style = TextStyle(color = Color.White, fontSize = 14.sp)
                                val result = textMeasurer.measure(
                                    it.id.toString(),
                                    style
                                )
                                drawText(
                                    textMeasurer,
                                    "${it.id}",
                                    Offset(x.value, y.value),
                                    size = Size(result.size.width.toFloat(), result.size.height.toFloat()),
                                    style = style
                                )
                            }
                        }
                        //Game Locs
                        tile.locs.clone().filterNotNull().forEach {
                            it.localTilePoints?.let { points ->
                                polygons[points.toList()] = Color.Blue
                            }
                            Main.client.`project$api`(
                                it.x,
                                Main.client.`getHeightmapY$api`(Main.client.getCurrentLevel(), it.x, it.z) - 60,
                                it.z
                            )
                            val x = (Main.client.projectX * xScale!!).dp * density - getCenteredTextOffset(
                                textMeasurer,
                                "${it.id}",
                                14.sp
                            ).dp
                            val y = (Main.client.projectY * yScale!!).dp * density
                            if (Main.client.projectX > 0 || Main.client.projectY > 0) {
                                val style = TextStyle(color = Color.Blue, fontSize = 14.sp)
                                val result = textMeasurer.measure(
                                    it.id.toString(),
                                    style
                                )
                                drawText(
                                    textMeasurer,
                                    "${it.id}",
                                    Offset(x.value, y.value),
                                    size = Size(result.size.width.toFloat(), result.size.height.toFloat()),
                                    style = style
                                )
                            }
                        }
                    }
            }
        }
    }
}