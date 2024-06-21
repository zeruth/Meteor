package meteor.ui.compose.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.FrameWindowScope
import meteor.Constants
import meteor.ui.compose.components.GamePanel.Game
import meteor.ui.compose.components.panel.PanelComposables.Panel
import meteor.ui.compose.components.sidebar.SidebarComposables.Sidebar
import meteor.ui.compose.components.sidebar.UISide
import java.awt.Dimension

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
    fun FrameWindowScope.Window() {
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