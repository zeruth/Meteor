package meteor.ui.compose

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import meteor.ui.compose.GamePanel.GameView
import meteor.ui.compose.config.ConfigPanelComposables
import meteor.ui.compose.config.ConfigPanelComposables.ConfigPanel
import meteor.ui.compose.sidebar.SidebarComposables.Sidebar
import meteor.ui.compose.sidebar.UISide

/**
 * The main entry point to the Compose UI
 */
object Window {
    val sidebarWidth = mutableStateOf(40.dp)
    val configWidth = mutableStateOf(300.dp)
    var configOpen = mutableStateOf(false)
    val uiSide = mutableStateOf(UISide.RIGHT)
    var gameWidth = mutableStateOf((-1).dp)
    @Composable
    fun MeteorWindow() {
        Box(Modifier.fillMaxSize()) {
            Row(Modifier.fillMaxSize()) {
                when (uiSide.value) {
                    UISide.RIGHT -> {
                        Box(Modifier.fillMaxHeight().weight(1f)) {
                            GameView()
                        }
                        if (configOpen.value) {
                            Box(Modifier.fillMaxHeight().width(configWidth.value)) {
                                ConfigPanel()
                            }
                        }
                        Box(Modifier.fillMaxHeight().width(sidebarWidth.value)) {
                            Sidebar()
                        }
                    }
                    UISide.LEFT -> {
                        Box(Modifier.fillMaxHeight().width(sidebarWidth.value)) {
                            Sidebar()
                        }
                        if (configOpen.value) {
                            Box(Modifier.fillMaxHeight().width(configWidth.value)) {
                                ConfigPanel()
                            }
                        }
                        Box(Modifier.fillMaxHeight().weight(1f)) {
                            GameView()
                        }
                    }
                }
            }
        }
    }
}