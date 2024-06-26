package meteor.plugin.rendering

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class RenderingConfig(plugin: Plugin) : Config(plugin) {
    val useBilinearFilter = ConfigItem(this, "Bilinear filtering", "useBilinearFilter".key(), false)
}