package meteor.plugin.rendering

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class RenderingConfig(plugin: Plugin) : Config(plugin) {
    init {
        add(ConfigItem("Bilinear filtering", "useBilinearFilter".key(), false))
        add(ConfigItem("Stretch to fill", "stretchToFill".key(), false))
    }

    fun useBilinearFilter() = get<Boolean>("useBilinearFilter".key())
    fun stretchToFill() = get<Boolean>("stretchToFill".key())
}