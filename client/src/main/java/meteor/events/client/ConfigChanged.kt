package meteor.events.client

import meteor.config.Config
import meteor.config.ConfigItem

class ConfigChanged(val key: String, val item: ConfigItem<*>?) {
    fun affects(config: Config): Boolean {
        return config.items.any { item -> item.key == key }
    }
}