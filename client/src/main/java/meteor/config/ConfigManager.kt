package meteor.config

import com.google.gson.GsonBuilder
import meteor.Configuration
import meteor.events.ConfigChanged
import meteor.plugin.Plugin
import meteor.plugin.PluginManager
import org.rationalityfrontline.kevent.KEVENT
import java.io.File

object ConfigManager {
    val configFile = File(Configuration.dataDir, "properties")
    val gson = GsonBuilder().setPrettyPrinting().create()
    var properties = Properties()

    init {
        if (configFile.exists()) {
            properties = gson.fromJson(configFile.reader(), Properties::class.java)
            println("Loaded ${properties.properties.size} properties")
        }
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

    fun set(key: String, value: Any) {
        if (updateValue(key, value)) {
            KEVENT.post(ConfigChanged(key))
            save()
        }

    }

    fun save() {
        configFile.writeText(gson.toJson(properties))
    }

    inline fun <reified P : Plugin, C : Config> getConfig(): C {
        return PluginManager.get<P>().configuration as C
    }
}