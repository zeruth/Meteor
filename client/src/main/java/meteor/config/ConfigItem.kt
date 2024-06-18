package meteor.config

class ConfigItem<T>(val config: Config, val position: Int, key: String, val name: String, val defaultValue: T) {
    val key: String = "${config.plugin!!.name}.$key"
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