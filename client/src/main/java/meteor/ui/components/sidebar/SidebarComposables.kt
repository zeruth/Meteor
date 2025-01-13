package meteor.ui.components.sidebar

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import ext.kotlin.MutableStateExt.toggle
import meteor.ui.MeteorWindow
import meteor.ui.MeteorWindow.panelOpen
import meteor.ui.MeteorWindow.sidebarWidth
import meteor.ui.MeteorWindow.windowState
import meteor.ui.components.panel.PanelComposables.secondaryContent
import meteor.ui.components.sidebar.buttons.*
import meteor.ui.compose.components.sidebar.SidebarButton

object SidebarComposables {
    val sidebarButtons = arrayListOf(PluginsButton(), DiscordStatusButton(), StretchToggleButton(), FullscreenToggleButton())
    val padding = mutableStateOf(5.dp)
    val buttonSize = mutableStateOf(sidebarWidth.value - padding.value)
    var lastButtonClicked = mutableStateOf<SidebarButton?>(null)

    inline fun <reified T> getButton(): T {
        return sidebarButtons.filterIsInstance<T>().first()
    }

    @Composable
    fun Sidebar() {
        key(windowState.value) {
            //Sidebar
            Box(Modifier.fillMaxHeight().width(sidebarWidth.value).background(meteor.ui.Colors.surfaceDark.value)) {
                //Buttons
                Column(Modifier.fillMaxSize().padding(all = padding.value)) {
                    for (sidebarButton in sidebarButtons.filter { !it.bottom }) {
                        SidebarButtonNode(sidebarButton)
                    }
                    Spacer(Modifier.weight(1f))
                    for (sidebarButton in sidebarButtons.filter { it.bottom }) {
                        SidebarButtonNode(sidebarButton)
                    }
                    if (windowState.value == MeteorWindow.fullscreenState) {
                        SidebarButtonNode(CloseMeteorButton())
                    }
                }
            }
        }
    }

    @Composable
    fun SidebarButtonNode(sidebarButton: SidebarButton) {
        Row(Modifier.fillMaxWidth().height(buttonSize.value - padding.value)) {
            Box(
                Modifier.clip(RoundedCornerShape(5.dp)).fillMaxSize().background(sidebarButton.tint.value?: meteor.ui.Colors.secondary.value )
                    .clickable {
                        buttonClick(sidebarButton)
                    }) {
                sidebarButton.icon.value?.let { Image(it, contentDescription = null) }
            }
        }
        Spacer(Modifier.height(padding.value))
    }

    fun buttonClick(button: SidebarButton) {
        if (button.actionButton) {
            button.onClick()
            return
        }
        if (lastButtonClicked.value == button) {
            if (secondaryContent.value != null) {
                secondaryContent.value = null
            } else {
                panelOpen.toggle()
                if (windowState.value != MeteorWindow.fullscreenState)
                    MeteorWindow.resetWindowSize()
            }
        }
        if (lastButtonClicked.value == null) {
            panelOpen.value = true
        } else {
            if (lastButtonClicked.value != button) {
                secondaryContent.value = null
                panelOpen.value = true
            }
        }
        if (panelOpen.value)
            button.onClick()
        lastButtonClicked.value = button
    }

    @Composable
    fun SidebarButton() {
        Box(Modifier.fillMaxWidth().height(buttonSize.value).background(meteor.ui.Colors.secondary.value)) {

        }
    }
}