package meteor.plugin.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.StarSolid
import meteor.Main
import meteor.plugin.loginscreen.World.Companion.getFlag
import meteor.plugin.loginscreen.buttons.MusicControlButton
import meteor.plugin.loginscreen.buttons.WorldSelectionButton
import meteor.ui.compose.Colors
import meteor.ui.compose.overlay.GameOverlay

class LoginScreenOverlay : GameOverlay() {
    var items = ArrayList<LoginScreenButton>()
    var currentWorld = 1;
    override fun render(): @Composable (BoxScope.() -> Unit) = {
        if (!Main.client.isLoggedIn) {
            if (items.isEmpty()) {
                items.add(WorldSelectionButton())
                items.add(MusicControlButton())
            }
            Box(modifier = Modifier.background(Color.Transparent).fillMaxSize()) {
                Column(modifier = Modifier.align(Alignment.BottomCenter)) {
                    if (WorldSelectionButton.worldSelectorVisible.value) {
                        Row {
                            Box(Modifier.clip(RoundedCornerShape(5.dp)).background(Colors.surfaceDark.value).width(185.dp).height(215.dp)) {
                                Column(modifier = Modifier.fillMaxSize()) {
                                    Text("2004Scape.org", color = Color.White, modifier = Modifier.align(Alignment.CenterHorizontally).height(20.dp))
                                    for (world in World.worlds) {
                                        Row(Modifier.height(20.dp).background(if (currentWorld == world.id) Colors.surfaceDarker.value else Colors.surface.value).clickable {
                                            Main.client.setMembers(world.members)
                                            Main.client.`updateServerConnection$api`(world.address, world.portOffset)
                                            currentWorld = world.id
                                        }) {
                                            Box(modifier = Modifier.width(25.dp)) {
                                                Text("${world.id}", modifier = Modifier.align(Alignment.Center), color = Color.White)
                                            }
                                            Divider(Modifier.width(5.dp).fillMaxHeight().background(Colors.surfaceDark.value))
                                            Box(modifier = Modifier.width(20.dp)) {
                                                Image(LineAwesomeIcons.StarSolid, "members", modifier = Modifier.fillMaxSize(), colorFilter = ColorFilter.tint(if (world.members) Color.Yellow else Color.White))
                                            }
                                            Divider(Modifier.width(5.dp).fillMaxHeight().background(Colors.surfaceDark.value))
                                            Box(modifier = Modifier.width(25.dp)) {
                                                Image(painterResource(world.getFlag()), "region-flag", modifier = Modifier.fillMaxSize())
                                            }
                                            Divider(Modifier.width(5.dp).fillMaxHeight().background(Colors.surfaceDark.value))
                                            Box(modifier = Modifier.width(100.dp)) {
                                                Text(world.region, modifier = Modifier.align(Alignment.Center), color = Color.White)
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(5.dp))
                                    }
                                }
                            }
                        }
                        Spacer(Modifier.height(5.dp))
                    }
                    Row(modifier = Modifier.width((50 * items.size).dp).height(50.dp).align(Alignment.CenterHorizontally)) {
                        for (item in items) {
                            Box(Modifier.clip(RoundedCornerShape(5.dp)).background(Colors.surfaceDarkColor).size(50.dp).clickable {
                                item.onClick()
                            }) {
                                Image(item.icon, contentDescription = null, modifier = Modifier.fillMaxSize(), colorFilter = ColorFilter.tint(Colors.secondary.value))
                            }
                            Spacer(Modifier.width(5.dp))
                        }
                    }
                }
            }
        }
    }
}