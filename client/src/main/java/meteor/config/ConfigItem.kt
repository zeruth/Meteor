package meteor.config

import meteor.config.ConfigManager.configItems

class ConfigItem<T>(val config: Config, val name: String, val key: String, val defaultValue: T) {
    init {
        configItems.add(this)
        config.items.add(this)
    }
    inline fun <reified T> get(): T {
        return ConfigManager.get(key, defaultValue as Any) as T
    }

    fun set(value: Any) {
        ConfigManager.set(key, value)
    }

    fun toggle() {
        if (defaultValue is Boolean) {
            ConfigManager.set(key, !get<Boolean>())
        }
    }
}