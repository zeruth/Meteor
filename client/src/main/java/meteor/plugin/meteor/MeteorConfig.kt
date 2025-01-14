package meteor.plugin.meteor

import meteor.config.Config
import meteor.config.ConfigItem

class MeteorConfig(plugin: MeteorPlugin) : Config(plugin) {
    val uiColor = ConfigItem(this, "UI color", "uicolor".key(), UIColor.GREEN)
    val filterQuality = ConfigItem(this, "Filter quality", "filterQuality".key(), FilterQuality.None)
}