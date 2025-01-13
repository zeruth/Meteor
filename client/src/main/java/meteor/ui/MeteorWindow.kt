package meteor.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.ComposeWindow
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import meteor.Game.gameImage
import meteor.Game.loadingImage
import meteor.ui.GameView.GameViewContainer
import meteor.ui.GameView.stretchedMode
import meteor.ui.components.panel.PanelComposables.Panel
import meteor.ui.components.sidebar.SidebarComposables
import java.awt.Dimension

object MeteorWindow {
    val sidebarWidth = mutableStateOf(40.dp)
    val configWidth = mutableStateOf(300.dp)
    var fixedWindowSize = Dimension(789 + 16 + sidebarWidth.value.value.toInt(), 532 + 39)
    var fixedState = mutableStateOf(true)
    val floatingState = WindowState(
        size = DpSize(fixedWindowSize.width.dp, fixedWindowSize.height.dp),
        position = WindowPosition(Alignment.Center),
        placement = WindowPlacement.Floating)
    val fullscreenState = WindowState(
        position = WindowPosition(Alignment.Center),
        placement = WindowPlacement.Fullscreen)
    val windowState = mutableStateOf(floatingState)
    lateinit var windowInstance: ComposeWindow

    fun resetWindowSize() {
        var width = 789 + 16 + sidebarWidth.value.value.toInt()
        if (panelOpen.value)
            width += configWidth.value.value.toInt()
        fixedWindowSize = Dimension(width, 532 + 39)

        windowInstance.size = fixedWindowSize
    }

    var panelOpen = mutableStateOf(false)


    @Composable
    fun ApplicationScope.MeteorWindow() {
        key(windowState.value) {
            Window(
                onCloseRequest = ::exitApplication,
                title = "Meteor 225 (2.1.0)",
                state = windowState.value,
                undecorated = windowState.value == fullscreenState,
                resizable = !fixedState.value || (stretchedMode.value && windowState.value != fullscreenState)
            ) {
                windowInstance = this.window
                val finalImage = if (gameImage.value != null) gameImage else loadingImage
                Row {
                    GameViewContainer(finalImage.value!!)
                    if (panelOpen.value) {
                        Box(Modifier.fillMaxHeight().width(configWidth.value)) {
                            Panel()
                        }
                    }
                    SidebarComposables.Sidebar()
                }
            }

            LaunchedEffect(Unit) {
                resetWindowSize()
            }
        }
    }
}