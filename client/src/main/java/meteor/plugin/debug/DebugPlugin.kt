package meteor.plugin.debug

import androidx.compose.runtime.mutableStateOf
import meteor.events.LoggedInChanged
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin
import meteor.ui.compose.overlay.Overlay.Companion.debugOverlays
import meteor.ui.compose.overlay.ViewportOverlayRoot.viewportOverlays

class DebugPlugin : Plugin("Debug", true) {
    val config = configuration<DebugConfig>()
    val viewportOverlay = overlay(DebugViewportOverlay)

    override fun onStart() {
        updateConfig()
    }

    override fun onLoggedInChanged(it: LoggedInChanged) {}

    override fun onConfigChanged(it: ConfigChanged) {
        if (it.affects(config))
            updateConfig()
    }

    fun updateConfig() {
        debugNpcs.value = config.isDebugNPCs().get()
        debugPlayers.value = config.isDebugPlayers().get()
        debugLocs.value = config.isDebugLocs().get()
        debugOverlays.value = config.isDebugOverlays().get()
    }
}