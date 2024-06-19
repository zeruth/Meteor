package meteor.plugin.debug

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import ext.kotlin.MutableStateExt.toggle
import meteor.Main
import meteor.events.Command
import meteor.plugin.Plugin
import meteor.ui.compose.GamePanel
import meteor.ui.compose.events.PreRender
import meteor.ui.compose.overlay.ViewportOverlayRoot.blockedViewportAreas
import meteor.ui.compose.overlay.ViewportOverlayRoot.viewportOverlays

class DebugTwoPlugin : Plugin("Debug_Two") {
    init {
        enabledByDefault = false
    }
}