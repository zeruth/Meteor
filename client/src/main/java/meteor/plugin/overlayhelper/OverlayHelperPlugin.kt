package meteor.plugin.overlayhelper

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import meteor.Main.client
import meteor.plugin.Plugin
import meteor.ui.compose.events.PreRender
import meteor.ui.compose.overlay.ViewportOverlayRoot.blockedViewportAreas

class OverlayHelperPlugin : Plugin("Overlay Helper", hidden = true) {
    val bankRect = Rect(Offset(12f, 20f), Offset(500f, 326f))
    val welcomeRect = Rect(Offset(12f, 76f), Offset(500f, 260f))
    override fun onPreRender(it: PreRender) {
        if (client.isBankVisible) {
            blockedViewportAreas.add(bankRect)
        }
        else if (client.isWelcomeScreenVisible) {
            blockedViewportAreas.add(welcomeRect)
        }
    }
}