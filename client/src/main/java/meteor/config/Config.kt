package meteor.config

import meteor.plugin.Plugin

open class Config(var plugin: Plugin? = null) {
    val items = ArrayList<ConfigItem<*>>()
    fun String.key() : String {
        return "${plugin!!.name}.$this"
    }
    fun <T> get(key: String): ConfigItem<T> {
        return items.first { it.key == key} as ConfigItem<T>
    }
}