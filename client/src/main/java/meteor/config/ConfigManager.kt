package meteor.config

import com.google.gson.GsonBuilder
import meteor.Configuration
import meteor.Logger
import meteor.Util.gson
import meteor.events.client.ConfigChanged
import org.rationalityfrontline.kevent.KEVENT
import java.io.File

object ConfigManager {
    val logger = Logger("ConfigManager")
    val configFile = File(Configuration.dataDir, "properties")
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

    fun getString(key: String, defaultValue: Any): String {
        val currentValue = properties.properties[key] ?: return defaultValue.toString()
        return currentValue
    }

    inline fun <reified T> get(key: String, defaultValue: Any): T {
        val value = properties.properties[key]
        try {
            if (T::class == String::class) {
                if (value as T == null)
                    return defaultValue as T
                return value
            }
            return gson.fromJson(value, T::class.java)?: return defaultValue as T
        } catch (e: Exception) {
            logger.error("Error parsing config value $value for key $key")
            logger.error(e)
            return defaultValue as T
        }
    }

    fun <T> updateValue(key: String, value: T): Boolean {
        //No serialization required
        if (value is String) {
            if (properties.properties[key] != value) {
                properties.properties[key] = value
                return true
            }
        }
        //serialize
        val json = gson.toJson(value)
        if (properties.properties[key] != json) {
            properties.properties[key] = json
            return true
        }
        return false
    }

    /**
     * Only post/save if the new value != the old value
     */
    fun <T> set(key: String, value: T) {
        if (updateValue(key, value)) {
            KEVENT.post(ConfigChanged(getItem<T>(key)))
            save()
        }
    }

    fun save() {
        configFile.writeText(gson.toJson(properties))
    }
}