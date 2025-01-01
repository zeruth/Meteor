package meteor.plugin

import meteor.Logger
import meteor.plugin.account.AccountPlugin
import meteor.plugin.discord.DiscordPlugin
import meteor.plugin.rendering.RenderingPlugin
import meteor.plugin.stretchedmode.StretchedModePlugin
import meteor.plugin.meteor.MeteorPlugin
import meteor.plugin.sound.SoundPlugin

object PluginManager {
    val plugins = mutableListOf<Plugin>()
    val logger = Logger("PluginManager")

    init {
        plugins.add(AccountPlugin())
        plugins.add(DiscordPlugin())
        plugins.add(MeteorPlugin())
        plugins.add(RenderingPlugin())
        plugins.add(SoundPlugin())
        plugins.add(StretchedModePlugin())
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