package meteor.plugin

import meteor.Logger
import meteor.plugin.account.AccountPlugin
import meteor.plugin.debug.DebugPlugin
import meteor.plugin.rendering.RenderingPlugin
import meteor.plugin.stretchedmode.StretchedModePlugin
import meteor.plugin.world.ServerPlugin
import meteor.plugin.infobars.InfoBarsPlugin

object PluginManager {
    val plugins = mutableListOf<Plugin>()
    val logger = Logger("PluginManager")

    init {
        plugins.add(DebugPlugin())
        plugins.add(RenderingPlugin())
        plugins.add(StretchedModePlugin())
        plugins.add(ServerPlugin())
        plugins.add(InfoBarsPlugin())
        plugins.add(AccountPlugin())
    }

    fun startPlugins() {
        val startTime = System.currentTimeMillis()
        for (plugin in plugins) {
            plugin.start()
        }
        logger.info("Loaded ${plugins.size} plugins (${System.currentTimeMillis() - startTime}ms)")
    }

    inline fun <reified P : Plugin> get(): P {
        return plugins.filterIsInstance<P>().first()
    }
}