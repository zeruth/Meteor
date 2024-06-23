package meteor.ui.compose.components.buttons

import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.CompressArrowsAltSolid
import compose.icons.lineawesomeicons.ExpandArrowsAltSolid
import meteor.Main
import meteor.config.ConfigManager
import meteor.ui.compose.components.sidebar.SidebarButton

class FullscreenToggleButton : SidebarButton(
    icon = if (ConfigManager.get("meteor.fullscreen", false)) LineAwesomeIcons.CompressArrowsAltSolid else LineAwesomeIcons.ExpandArrowsAltSolid,
    actionButton = true,
    bottom = true) {
    override fun onClick() {
        if (icon.value == LineAwesomeIcons.ExpandArrowsAltSolid) {
            icon.value = LineAwesomeIcons.CompressArrowsAltSolid
            Main.windowState.value = Main.fullscreenState
            ConfigManager.set("meteor.fullscreen", true)
        } else {
            icon.value = LineAwesomeIcons.ExpandArrowsAltSolid
            Main.windowState.value = Main.windowedState
            ConfigManager.set("meteor.fullscreen", false)
        }
    }
}