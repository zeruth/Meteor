package meteor.plugin.meteor

import meteor.config.Config
import meteor.config.ConfigItem

class MeteorConfig(plugin: MeteorPlugin) : Config(plugin) {
    val uiColor = ConfigItem(this, "UI Color", "uicolor".key(), UIColor.GREEN)
}