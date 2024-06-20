package meteor.plugin

import meteor.plugin.debug.DebugPlugin
import meteor.plugin.rendering.RenderingPlugin

object PluginManager {
    val plugins = mutableListOf<Plugin>()

    init {
        plugins.add(RenderingPlugin())
        plugins.add(DebugPlugin())
    }

    fun startPlugins() {
        for (plugin in plugins) {
            plugin.start()
        }
    }

    inline fun <reified P : Plugin> get(): P {
        return plugins.filterIsInstance<P>().first()
    }
}