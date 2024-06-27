package meteor.plugin.rendering

import meteor.Main.client
import meteor.Main.window
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin
import meteor.ui.config.AspectMode
import meteor.ui.config.CPUFilter

class RenderingPlugin : Plugin("Rendering", true) {
    val config = configuration<RenderingConfig>()

    override fun onStart() {
        updateConfig()
    }

    override fun onStop() {
        client.cpuFilter = CPUFilter.NONE
    }

    override fun onConfigChanged(it: ConfigChanged) {
        if (it.affects(config))
            updateConfig()
    }

    fun updateConfig() {
        when (config.useBilinearFilter.get<Boolean>()) {
            true -> client.cpuFilter = CPUFilter.BILINEAR
            false -> client.cpuFilter = CPUFilter.NONE
        }
    }
}