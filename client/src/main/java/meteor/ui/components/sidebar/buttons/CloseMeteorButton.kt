package meteor.ui.components.sidebar.buttons

import androidx.compose.ui.graphics.Color
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.WindowCloseSolid
import meteor.ui.compose.components.sidebar.SidebarButton
import kotlin.system.exitProcess

class CloseMeteorButton : SidebarButton(
    icon = LineAwesomeIcons.WindowCloseSolid,
    actionButton = true,
    tint = Color.Red) {
    override fun onClick() {
        exitProcess(0)
    }
}