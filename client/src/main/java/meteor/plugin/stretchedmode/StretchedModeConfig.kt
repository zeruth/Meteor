package meteor.plugin.stretchedmode

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class StretchedModeConfig(plugin: Plugin) : Config(plugin) {
    val stretchToFill = ConfigItem(this, "Stretch to fill", "stretchToFill".key(), false)
}