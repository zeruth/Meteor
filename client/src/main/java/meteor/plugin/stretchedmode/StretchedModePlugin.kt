package meteor.plugin.stretchedmode

import meteor.Main
import meteor.Main.client
import meteor.Main.window
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin
import meteor.ui.config.AspectMode

class StretchedModePlugin : Plugin("Stretched Mode") {
    val config = configuration<StretchedModeConfig>()

    override fun onConfigChanged(it: ConfigChanged) {
        if (it.affects(config)) {
            updateConfig()
        }

        if (it.item == config.stretchToFill) {
            window.repaint()
        }
    }

    override fun onStart() {
        if (Main.windowState.value != Main.fullscreenState) {
            Main.windowState.value = Main.windowedState
        }
    }

    override fun onStop() {
        if (Main.windowState.value != Main.fullscreenState) {
            Main.windowState.value = Main.fixedState
        }
    }

    fun updateConfig() {
        when (config.stretchToFill.get<Boolean>()) {
            true -> client.aspectMode = AspectMode.FILL
            false -> client.aspectMode = AspectMode.FIT
        }
    }
}