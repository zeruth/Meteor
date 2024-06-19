package meteor.events.client

import meteor.config.ConfigItem

class ConfigChanged(val key: String, val item: ConfigItem<*>?)