package meteor.plugin

import meteor.Logger
import meteor.plugin.debug.DebugPlugin
import meteor.plugin.overlayhelper.OverlayHelperPlugin
import meteor.plugin.rendering.RenderingPlugin

object PluginManager {
    val plugins = mutableListOf<Plugin>()
    val logger = Logger("PluginManager")

    init {
        plugins.add(DebugPlugin())
        plugins.add(OverlayHelperPlugin())
        plugins.add(RenderingPlugin())
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