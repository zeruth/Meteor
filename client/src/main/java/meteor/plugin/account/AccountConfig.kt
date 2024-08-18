package meteor.plugin.account

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class AccountConfig(plugin: Plugin) : Config(plugin) {
    val keepUsername = ConfigItem(this, "Keep Username", "keepUsername".key(), false)
    val keepPassword = ConfigItem(this, "Keep Password", "keepPassword".key(), false)
    val autoUsername = ConfigItem(this, "Auto Username", "autoUsername".key(), "")
    val autoPassword = ConfigItem(this, "Auto Password", "autoPassword".key(), "", secret = true)
}