package meteor.plugin.server

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class ServerConfig(plugin: Plugin) : Config(plugin) {
    val codebase = ConfigItem(this, "Codebase (URL)", "codebase".key(), "https://w1.225.2004scape.org")
    val portOffset = ConfigItem(this, "Port Offset", "portOffset".key(), 0)
    val isMembers = ConfigItem(this, "Members World", "isMembers".key(), false)
}