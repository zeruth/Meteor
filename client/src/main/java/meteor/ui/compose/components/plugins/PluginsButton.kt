package meteor.ui.compose.components.plugins

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateMapOf
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.PlugSolid
import meteor.plugin.Plugin
import meteor.ui.compose.components.panel.PanelComposables
import meteor.ui.compose.components.plugins.PluginsComposables.PluginList
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
    }
}