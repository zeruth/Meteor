package meteor.config

import com.google.gson.GsonBuilder
import meteor.Configuration
import meteor.Logger
import meteor.events.client.ConfigChanged
import org.rationalityfrontline.kevent.KEVENT
import java.io.File

object ConfigManager {
    val logger = Logger("ConfigManager")
    val configFile = File(Configuration.dataDir, "properties")
    val gson = GsonBuilder().setPrettyPrinting().create()
    var properties = Properties()
    val configItems = ArrayList<ConfigItem<*>>()

    init {
        if (configFile.exists()) {
            val startTime = System.currentTimeMillis()
            properties = gson.fromJson(configFile.reader(), Properties::class.java)
            logger.info("Loaded ${properties.properties.size} config properties (${System.currentTimeMillis() - startTime}ms)")
        }
    }

    fun <T> getItem(key: String) : ConfigItem<T>? {
        return getGeneric(key) as ConfigItem<T>?
    }

    fun getGeneric(key: String) : ConfigItem<*>? {
        return configItems.firstOrNull { it.key == key }
    }

    inline fun <reified T> get(key: String, defaultValue: Any): T {
        val value = properties.properties[key]
        when (T::class) {
            String::class -> {
                value ?: return defaultValue as T
                return value as T
            }

            Int::class -> {
                value ?: return defaultValue as T
                return value.toInt() as T
            }

            Double::class -> {
                value ?: return defaultValue as T
                return value.toDouble() as T
            }

            Long::class -> {
                value ?: return defaultValue as T
                return value.toLong() as T
            }

            Boolean::class -> {
                value ?: return defaultValue as T
                return value.toBoolean() as T
            }

            Float::class -> {
                value ?: return defaultValue as T
                return value.toFloat() as T
            }

            else -> throw RuntimeException("Invalid value type ${T::class}")
        }
    }

    fun updateValue(key: String, value: Any): Boolean {
        if (properties.properties[key] != value.toString()) {
            properties.properties[key] = value.toString()
            return true
        }
        return false
    }

    /**
     * Only post/save if the new value != the old value
     */
    fun set(key: String, value: Any) {
        if (updateValue(key, value)) {
            KEVENT.post(ConfigChanged(key, getGeneric(key)))
            save()
        }
    }

    fun save() {
        configFile.writeText(gson.toJson(properties))
    }
}