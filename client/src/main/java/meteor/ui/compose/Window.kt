package meteor.ui.compose

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import meteor.ui.compose.GamePanel.Game
import meteor.ui.compose.config.ConfigPanelComposables.Panel
import meteor.ui.compose.sidebar.SidebarComposables.Sidebar
import meteor.ui.compose.sidebar.UISide

/**
 * The main entry point to the Compose UI
 */
object Window {
    val sidebarWidth = mutableStateOf(40.dp)
    val configWidth = mutableStateOf(300.dp)
    var panelOpen = mutableStateOf(false)
    val uiSide = mutableStateOf(UISide.RIGHT)
    var gameWidth = mutableStateOf((-1).dp)
    @Composable
    fun Window() {
        Box(Modifier.fillMaxSize()) {
            Row(Modifier.fillMaxSize()) {
                when (uiSide.value) {
                    UISide.RIGHT -> {
                        Box(Modifier.fillMaxHeight().weight(1f)) {
                            Game()
                        }
                        if (panelOpen.value) {
                            Box(Modifier.fillMaxHeight().width(configWidth.value)) {
                                Panel()
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
                        if (panelOpen.value) {
                            Box(Modifier.fillMaxHeight().width(configWidth.value)) {
                                Panel()
                            }
                        }
                        Box(Modifier.fillMaxHeight().weight(1f)) {
                            Game()
                        }
                    }
                }
            }
        }
    }
}