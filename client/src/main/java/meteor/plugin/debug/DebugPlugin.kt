package meteor.plugin.debug

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import ext.kotlin.MutableStateExt.toggle
import meteor.Main
import meteor.events.Command
import meteor.events.ConfigChanged
import meteor.plugin.Plugin
import meteor.ui.compose.GamePanel
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
        when (it.key) {
            config.isDebugNPCs().key,
            config.isDebugPlayers().key,
            config.isDebugLocs().key -> updateConfig()
        }
    }

    fun updateConfig() {
        GamePanel.debugNpcs.value = config.isDebugNPCs().get()
        GamePanel.debugPlayers.value = config.isDebugPlayers().get()
        GamePanel.debugLocs.value = config.isDebugLocs().get()
    }
}