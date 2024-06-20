package meteor.plugin.debug

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import meteor.Main
import meteor.events.LoggedInChanged
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin
import meteor.ui.compose.components.GamePanel
import meteor.ui.compose.events.PreRender
import meteor.ui.compose.overlay.ViewportOverlayRoot.blockComponentArea
import meteor.ui.compose.overlay.ViewportOverlayRoot.blockedViewportAreas
import meteor.ui.compose.overlay.ViewportOverlayRoot.viewportOverlays

class DebugPlugin : Plugin("Debug", true) {
    companion object {
        var debugOverlays = mutableStateOf(false)
    }
    val config = configuration<DebugConfig>()
    val viewportOverlay = DebugViewportOverlay

    override fun onStart() {
        updateConfig()
        viewportOverlays.add(viewportOverlay)
    }

    override fun onStop() {
        viewportOverlays.remove(viewportOverlay)
    }

    override fun onLoggedInChanged(it: LoggedInChanged) {

    }

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