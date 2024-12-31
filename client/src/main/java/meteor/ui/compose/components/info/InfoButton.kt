package meteor.ui.compose.components.info

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.InfoCircleSolid
import meteor.Main
import meteor.Main.forceRecomposition
import meteor.Main.version
import meteor.ui.compose.Colors
import meteor.ui.compose.Colors.surface
import meteor.ui.compose.components.GeneralComposables.SidedNode
import meteor.ui.compose.components.panel.PanelComposables
import meteor.ui.compose.overlay.ViewportOverlayRoot
import meteor.ui.compose.components.sidebar.SidebarButton
import meteor.ui.swing.PostProcessGamePanel
import meteor.ui.swing.PostProcessGamePanel.Companion.swingFPS
import java.time.Instant
import java.util.concurrent.ConcurrentLinkedQueue

class InfoButton : SidebarButton(icon = LineAwesomeIcons.InfoCircleSolid) {
    private val composeRenderTimes = ConcurrentLinkedQueue<Pair<Instant, Long>>()
    val composeFPS = mutableStateOf(0)

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
                    Text("Meteor", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text("225-$version", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Injector", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text("1.4", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Logger", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text("1.2", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Eventbus", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text("1.1", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(16.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("OS", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        System.getProperty("os.name").replace("Windows ", "Win") + "_" + System.getProperty("os.arch"),
                        color = Colors.secondary.value,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("JVM", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        System.getProperty("java.version"),
                        color = Colors.secondary.value,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(16.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Swing-UI", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        "${Main.swingTime.value}ms",
                        color = Colors.secondary.value,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Compose-UI", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        "${Main.composeTime.value}ms",
                        color = Colors.secondary.value,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Compose-Canvas", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        "${ViewportOverlayRoot.canvasRenderTime.value}ms",
                        color = Colors.secondary.value,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })

            val renderTime = (ViewportOverlayRoot.canvasRenderTime.value + Main.composeTime.value).coerceAtLeast(1)
            val now = Instant.now()
            composeRenderTimes.add(now to renderTime)
            removeOldEntries()
            key(forceRecomposition.value) {
                composeFPS.value = 1000 / getAverageComposeRenderTime()
            }

            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Compose(Game) FPS (1sec Avg)", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        "${composeFPS.value} fps",
                        color = Colors.secondary.value,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
            Spacer(Modifier.height(2.dp))
            SidedNode(30,
                left = @Composable {
                    Spacer(Modifier.width(4.dp))
                    Text("Swing(Game) FPS (1sec Avg)", color = Colors.secondary.value, modifier = Modifier.align(Alignment.CenterVertically))
                },
                right = @Composable {
                    Text(
                        "${swingFPS.value} fps",
                        color = Colors.secondary.value,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(4.dp))
                })
        }
    }

    fun getAverageComposeRenderTime(): Int {
        removeOldEntries()
        val times = composeRenderTimes.map { it.second }
        return if (times.isNotEmpty()) times.average().toInt() else 1
    }

    private fun removeOldEntries() {
        val cutoff = Instant.now().minusSeconds(1)
        while (composeRenderTimes.peek()?.first?.isBefore(cutoff) == true) {
            composeRenderTimes.poll()
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