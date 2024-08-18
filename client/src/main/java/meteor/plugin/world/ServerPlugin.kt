package meteor.plugin.world

import meteor.Main
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin
import meteor.plugin.debug.DebugConfig

class ServerPlugin : Plugin("Server", true, cantDisable = true) {
    val config = configuration<ServerConfig>()
    override fun onStart() {
        updateServerConnection()
    }

    override fun onConfigChanged(it: ConfigChanged) {
        if (it.affects(config)) {
            updateServerConnection()
        }
    }

    fun updateServerConnection() {
        Main.client.setMembers(config.isMembers.get())
        Main.client.`updateServerConnection$api`(config.codebase.get(), config.portOffset.get())
    }
}