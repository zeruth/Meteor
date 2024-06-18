package meteor.plugin.debug

import meteor.config.Config

class DebugConfig : Config() {
    fun isDebugNPCs() = config(1, "Debug NPCs", "isDebugNPCs", false)
    fun isDebugPlayers() = config(2, "Debug Players", "isDebugPlayers", false)
    fun isDebugLocs() = config(3, "Debug Locs", "isDebugLocs", false)
}