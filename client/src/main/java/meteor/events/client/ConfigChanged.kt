package meteor.events.client

import meteor.config.Config
import meteor.config.ConfigItem

class ConfigChanged(val item: ConfigItem<*>?) {
    fun affects(config: Config): Boolean {
        return config.items.contains(item)
    }
}