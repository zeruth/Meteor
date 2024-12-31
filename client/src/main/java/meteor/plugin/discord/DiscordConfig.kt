package meteor.plugin.discord

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class DiscordConfig(plugin: Plugin) : Config(plugin) {
    val enabled = ConfigItem(this, "Enabled", "enabled".key(), true)
    val sendStatusLoggedOut = ConfigItem(this, "Send status logged out", "sendStatusLoggedOut".key(), true)
}