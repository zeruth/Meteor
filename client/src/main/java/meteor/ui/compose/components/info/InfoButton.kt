package meteor.ui.compose.components.info

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.InfoCircleSolid
import meteor.Main
import meteor.Main.version
import meteor.ui.compose.Colors.surface
import meteor.ui.compose.components.GeneralComposables.SidedNode
import meteor.ui.compose.components.panel.PanelComposables
import meteor.ui.compose.overlay.ViewportOverlayRoot
import meteor.ui.compose.components.sidebar.SidebarButton

class InfoButton : SidebarButton(icon = LineAwesomeIcons.InfoCircleSolid, bottom = true) {
    override fun onClick() {
        PanelComposables.content.value = InfoPanel()
    }

    fun InfoPanel() = @Composable {
        Column(Modifier.fillMaxSize()) {
            BubbleBoxColumn {
                Image(
                    painterResource("brand/badge.png"),
                    null,
                    modifier = Modifier.size(150.dp).align(Alignment.CenterHorizontally)
                )
            }
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Meteor", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text("225-$version", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Injector", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text("1.4", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Logger", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text("1.2", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Eventbus", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text("1.1", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(16.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("OS", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        System.getProperty("os.name").replace("Windows ", "Win") + "_" + System.getProperty("os.arch"),
                        color = Color.Cyan,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("JVM", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        System.getProperty("java.version"),
                        color = Color.Cyan,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(16.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Swing", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        "${Main.swingTime.value}ms",
                        color = Color.Cyan,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Compose-UI", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        "${Main.composeTime.value}ms",
                        color = Color.Cyan,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Compose-Canvas", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        "${ViewportOverlayRoot.canvasRenderTime.value}ms",
                        color = Color.Cyan,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
        }
    }

    @Composable
    private fun ColumnScope.BubbleBoxColumn(content: @Composable () -> Unit) {
        Box(
            Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(surface.value)
                .align(Alignment.CenterHorizontally)
        ) {
            Column {
                content.invoke()
            }
        }
    }

    @Composable
    private fun ColumnScope.BubbleBoxRow(content: @Composable () -> Unit) {
        Box(
            Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(surface.value)
                .align(Alignment.CenterHorizontally)
        ) {
            Row {
                content.invoke()
            }
        }
    }

    @Composable
    private fun ColumnScope.BubbleBoxCentered(content: @Composable () -> Unit) {
        BubbleBoxColumn {
            BubbleBoxRow {
                content.invoke()
            }
        }
    }
}