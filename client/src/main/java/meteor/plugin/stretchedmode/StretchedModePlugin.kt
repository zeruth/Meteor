package meteor.plugin.stretchedmode

import meteor.Main
import meteor.Main.client
import meteor.Main.window
import meteor.events.LoggedInChanged
import meteor.events.ReachedLoginScreen
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin
import meteor.ui.config.AspectMode
import org.rationalityfrontline.kevent.KEVENT

class StretchedModePlugin : Plugin("Stretched Mode") {
    val config = configuration<StretchedModeConfig>()
    var allowFill = false

    init {
        KEVENT.subscribe<ReachedLoginScreen> {
            allowFill = true
            updateConfig()
        }
    }

    override fun onConfigChanged(it: ConfigChanged) {
        if (it.affects(config)) {
            updateConfig()
        }

        if (it.item == config.stretchToFill) {
            window.repaint()
        }
    }

    override fun onStart() {
        updateConfig()

        if (Main.windowState.value != Main.fullscreenState) {
            Main.windowState.value = Main.windowedState
        }
    }

    override fun onStop() {
        client.aspectMode = AspectMode.FIT

        if (Main.windowState.value != Main.fullscreenState) {
            Main.windowState.value = Main.fixedState
        }
    }

    fun updateConfig() {
        client.aspectMode = when (config.stretchToFill.get<Boolean>()) {
            true -> if (allowFill) AspectMode.FILL else AspectMode.FIT
            false -> AspectMode.FIT
        }
    }
}