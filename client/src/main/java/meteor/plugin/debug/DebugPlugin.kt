package meteor.plugin.debug

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import meteor.Main
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin
import meteor.ui.compose.components.GamePanel
import meteor.ui.compose.events.PreRender
import meteor.ui.compose.overlay.ViewportOverlayRoot.blockedViewportAreas
import meteor.ui.compose.overlay.ViewportOverlayRoot.viewportOverlays

class DebugPlugin : Plugin("Debug", true) {
    val config = configuration<DebugConfig>()
    val viewportOverlay = DebugViewportOverlay
    val bankRect = Rect(Offset(12f, 20f), Offset(500f, 326f))

    override fun onStart() {
        updateConfig()
        viewportOverlays.add(viewportOverlay)
    }

    override fun onStop() {
        viewportOverlays.remove(viewportOverlay)
    }

    override fun onPreRender(it: PreRender) {
        if (Main.client.isBankOpen) {
            blockedViewportAreas.add(bankRect)
        }
    }

    override fun onConfigChanged(it: ConfigChanged) {
        when (it.item) {
            config.isDebugNPCs(),
            config.isDebugPlayers(),
            config.isDebugLocs() -> updateConfig()
        }
    }

    fun updateConfig() {
        GamePanel.debugNpcs.value = config.isDebugNPCs().get()
        GamePanel.debugPlayers.value = config.isDebugPlayers().get()
        GamePanel.debugLocs.value = config.isDebugLocs().get()
    }
}