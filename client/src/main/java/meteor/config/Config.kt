package meteor.config

import meteor.plugin.Plugin

open class Config {
    var plugin: Plugin? = null
    var items = 0
    inline fun <reified T> config(position: Int, name: String, key: String, defaultValue: T): ConfigItem<T> {
        items += 1
        return ConfigItem(this, position, key, name, defaultValue)
    }
}