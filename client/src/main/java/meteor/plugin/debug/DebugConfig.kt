package meteor.plugin.debug

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class DebugConfig(plugin: Plugin) : Config(plugin) {
    val isDebugNPCs = ConfigItem(this, "Debug NPCs", "isDebugNPCs".key(), false)
    val isDebugPlayers = ConfigItem(this, "Debug Players", "isDebugPlayers".key(), false)
    val isDebugLocs = ConfigItem(this, "Debug Locs", "isDebugLocs".key(), false)
    val isDebugOverlays = ConfigItem(this, "Debug Overlays", "isDebugOverlays".key(), false)
}