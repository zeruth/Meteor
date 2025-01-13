package meteor.ui.components.sidebar.buttons

import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.CompressArrowsAltSolid
import compose.icons.lineawesomeicons.ExpandArrowsAltSolid
import compose.icons.lineawesomeicons.LockSolid
import compose.icons.lineawesomeicons.UnlockSolid
import meteor.config.ConfigManager
import meteor.ui.GameView
import meteor.ui.GameView.stretchedMode
import meteor.ui.MeteorWindow
import meteor.ui.MeteorWindow.fixedState
import meteor.ui.MeteorWindow.fullscreenState
import meteor.ui.MeteorWindow.resetWindowSize
import meteor.ui.MeteorWindow.windowState
import meteor.ui.compose.components.sidebar.SidebarButton

class StretchToggleButton : SidebarButton(
    icon = if (!fixedState.value || (stretchedMode.value && windowState.value != fullscreenState)) LineAwesomeIcons.LockSolid else LineAwesomeIcons.UnlockSolid,
    actionButton = true,
    bottom = true) {
    override fun onClick() {
        toggleStretchedMode()
    }

    fun toggleStretchedMode() {
        if (windowState.value == MeteorWindow.floatingState) {
            if (!stretchedMode.value) {
                fixedState.value = false
                stretchedMode.value = true
                windowState.value = MeteorWindow.floatingState
                icon.value = LineAwesomeIcons.LockSolid
                ConfigManager.set("meteor.stretched", true)
            } else {
                stretchedMode.value = false
                fixedState.value = true
                icon.value = LineAwesomeIcons.UnlockSolid
                ConfigManager.set("meteor.stretched", false)
                resetWindowSize()
            }
        }
    }
}