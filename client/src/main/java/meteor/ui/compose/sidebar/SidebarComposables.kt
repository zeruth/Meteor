package meteor.ui.compose.sidebar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.PlugSolid
import ext.kotlin.MutableStateExt.toggle
import meteor.ui.compose.Colors
import meteor.ui.compose.Colors.secondary
import meteor.ui.compose.Colors.surface
import meteor.ui.compose.Window.configOpen
import meteor.ui.compose.Window.sidebarWidth

object SidebarComposables {
    val sidebarButtons = arrayListOf(PluginsButton(), InfoButton())
    val padding = mutableStateOf(5.dp)
    val buttonSize = mutableStateOf(sidebarWidth.value - padding.value)
    var lastButtonClicked = mutableStateOf<SidebarButton?>(null)
    @Composable
    fun Sidebar() {
        //Sidebar
        Box(Modifier.fillMaxSize().background(surface.value)) {
            //Buttons
            Column(Modifier.fillMaxSize().padding(all = padding.value)) {
                for (sidebarButton in sidebarButtons) {
                    Row(Modifier.fillMaxWidth().height(buttonSize.value - padding.value)) {
                            Box(Modifier.clip(RoundedCornerShape(5.dp)).fillMaxSize().background(secondary.value).clickable {
                                buttonClick(sidebarButton)
                            }) {
                                sidebarButton.icon.value?.let { Image(it, contentDescription = null) }
                        }
                    }
                    Spacer(Modifier.height(padding.value))
                }
            }
        }
    }

    fun buttonClick(button: SidebarButton) {
        if (lastButtonClicked.value == null || lastButtonClicked.value == button) {
            configOpen.toggle()
        } else {
            configOpen.value = true
        }
        if (configOpen.value)
            button.onClick()
        lastButtonClicked.value = button
    }

    @Composable
    fun SidebarButton() {
        Box(Modifier.fillMaxWidth().height(buttonSize.value).background(secondary.value)) {

        }
    }
}