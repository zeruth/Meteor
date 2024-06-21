package meteor.ui.compose.components.buttons

import androidx.compose.ui.graphics.Color
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.CompressArrowsAltSolid
import compose.icons.lineawesomeicons.ExpandArrowsAltSolid
import compose.icons.lineawesomeicons.WindowCloseSolid
import meteor.Main
import meteor.config.ConfigManager
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