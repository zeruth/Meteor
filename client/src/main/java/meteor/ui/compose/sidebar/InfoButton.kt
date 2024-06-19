package meteor.ui.compose.sidebar

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
import meteor.ui.compose.Colors.surface
import meteor.ui.compose.config.ConfigPanelComposables
import meteor.ui.compose.overlay.ViewportOverlayRoot

class InfoButton : SidebarButton(icon = LineAwesomeIcons.InfoCircleSolid) {
    override fun onClick() {
        ConfigPanelComposables.content.value = InfoPanel()
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
            Spacer(Modifier.height(4.dp))
            BubbleBoxCentered {
                Text("Meteor", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text("225-2.0.5-SNAPSHOT", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
            }
            Spacer(Modifier.height(4.dp))
            BubbleBoxCentered {
                Text("Injector", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text("1.3", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
            }
            Spacer(Modifier.height(4.dp))
            BubbleBoxCentered {
                Text("Logger", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text("1.2", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
            }
            Spacer(Modifier.height(4.dp))
            BubbleBoxCentered {
                Text("Eventbus", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text("1.1", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
            }

            Spacer(Modifier.height(16.dp))
            BubbleBoxCentered {
                Text("OS", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text(
                    System.getProperty("os.name").replace("Windows ", "Win") + "_" + System.getProperty("os.arch"),
                    color = Color.Cyan,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
            Spacer(Modifier.height(4.dp))
            BubbleBoxCentered {
                Text("  JVM", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text(
                    System.getProperty("java.version"),
                    color = Color.Cyan,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }

            Spacer(Modifier.height(16.dp))
            BubbleBoxCentered {
                Text("Swing", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text(
                    "${Main.swingTime.value}ms",
                    color = Color.Cyan,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
            Spacer(Modifier.height(4.dp))
            BubbleBoxCentered {
                Text("Compose-UI", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text(
                    "${Main.composeTime.value}ms",
                    color = Color.Cyan,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
            Spacer(Modifier.height(4.dp))
            BubbleBoxCentered {
                Text("Compose-Canvas", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(Modifier.width(10.dp))
                Text(
                    "${ViewportOverlayRoot.canvasRenderTime.value}ms",
                    color = Color.Cyan,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
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