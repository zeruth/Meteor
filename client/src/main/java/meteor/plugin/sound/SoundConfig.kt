package meteor.plugin.sound

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class SoundConfig(plugin: Plugin) : Config(plugin) {
    val onlyPlayJingles = ConfigItem(this, "Only play jingles", "onlyPlayJingles".key(), false)
}