package meteor.ui.compose.sidebar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import meteor.ui.compose.config.ConfigPanelComposables

open class SidebarButton(icon: ImageVector? = null,
                         description: String? = null,
                         tint: Color? = null,
                         imageResource: String? = null) {
    var icon = mutableStateOf(icon)
    var description = mutableStateOf(description)
    var tint = mutableStateOf(tint)
    var imageResource = mutableStateOf(imageResource)
    open fun onClick() {
        ConfigPanelComposables.content.value = null
        println("${javaClass.name} button click")
    }
}