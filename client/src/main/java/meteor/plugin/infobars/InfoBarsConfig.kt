package meteor.plugin.infobars

import meteor.config.Config
import meteor.config.ConfigItem
import meteor.plugin.Plugin

class InfoBarsConfig(plugin: Plugin) : Config(plugin) {
    val skillTimeout = ConfigItem(this, "Skill Timeout (minutes)", "skillTimeout".key(), 1)
    val ignoreFirstUpdate = ConfigItem(this, "Ignore first update", "ignoreFirstUpdate".key(), true)
}