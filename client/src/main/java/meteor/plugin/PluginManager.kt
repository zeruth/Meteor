package meteor.plugin

import meteor.Logger
import meteor.plugin.discord.DiscordPlugin

object PluginManager {
    val plugins = mutableListOf<Plugin>()
    val logger = Logger("PluginManager")

    init {
        plugins.add(DiscordPlugin())
    }

    fun startPlugins() {
        val startTime = System.currentTimeMillis()
        for (plugin in plugins) {
            plugin.start()
        }
        logger.info("Loaded ${plugins.size} plugins (${System.currentTimeMillis() - startTime}ms)")
    }

    inline fun <reified P : Plugin> get(): P? {
        return plugins.filterIsInstance<P>().firstOrNull()
    }
}