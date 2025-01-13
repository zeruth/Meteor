package meteor.ui.components.sidebar.buttons

import androidx.compose.runtime.mutableStateMapOf
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.PlugSolid
import meteor.plugin.Plugin
import meteor.ui.GameView.stretchedMode
import meteor.ui.MeteorWindow
import meteor.ui.MeteorWindow.windowState
import meteor.ui.components.panel.PanelComposables
import meteor.ui.components.plugins.PluginsComposables.PluginList
import meteor.ui.compose.components.sidebar.SidebarButton

class PluginsButton : SidebarButton(icon = LineAwesomeIcons.PlugSolid) {
    companion object {
        val runningMap = mutableStateMapOf<Plugin, Boolean>()
        val favoritesMap = mutableStateMapOf<Plugin, Boolean>()
        val switchStateMap = mutableStateMapOf<String, Boolean>()
        val textStateMap = mutableStateMapOf<String, String>()
    }

    override fun onClick() {
        PanelComposables.content.value = PluginList()
        if (windowState.value != MeteorWindow.fullscreenState)
            MeteorWindow.resetWindowSize()
    }
}