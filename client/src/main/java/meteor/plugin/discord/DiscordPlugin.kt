package meteor.plugin.discord

import meteor.plugin.Plugin

class DiscordPlugin : Plugin("Discord Rich Presence", true, cantDisable = true) {
    val config = configuration<DiscordConfig>()

    fun enabled() : Boolean {
        return config.enabled.get<Boolean>()
    }

    fun sendStatusLoggedOut() : Boolean {
        return config.sendStatusLoggedOut.get<Boolean>()
    }
}