package meteor.plugin

import meteor.plugin.debug.DebugPlugin
import meteor.plugin.debug.DebugTwoPlugin

object PluginManager {
    val plugins = mutableListOf<Plugin>()
    init {
        plugins.add(DebugTwoPlugin())
        plugins.add(DebugPlugin())
    }
    fun startPlugins() {
        for (plugin in plugins) {
            plugin.start()
        }
    }

    inline fun <reified P : Plugin> get() : P {
        return plugins.filterIsInstance<P>().first()
    }
}