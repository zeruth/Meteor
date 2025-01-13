package meteor.ui.components.sidebar.buttons

import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.CompressArrowsAltSolid
import compose.icons.lineawesomeicons.ExpandArrowsAltSolid
import meteor.config.ConfigManager
import meteor.ui.GameView
import meteor.ui.compose.components.sidebar.SidebarButton

class FullscreenToggleButton : SidebarButton(
    icon = if (ConfigManager.get("meteor.fullscreen", false)) LineAwesomeIcons.CompressArrowsAltSolid else LineAwesomeIcons.ExpandArrowsAltSolid,
    actionButton = true,
    bottom = true) {
    override fun onClick() {
        GameView.toggleFullscreen()
    }
}