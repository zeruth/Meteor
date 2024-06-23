package meteor.plugin

import meteor.config.Config
import meteor.config.ConfigManager
import meteor.plugin.debug.DebugViewportOverlay
import meteor.ui.compose.components.plugins.PluginsButton.Companion.runningMap
import meteor.ui.compose.overlay.GameOverlay
import meteor.ui.compose.overlay.GameOverlayRoot.gameOverlays
import meteor.ui.compose.overlay.Overlay
import meteor.ui.compose.overlay.ViewportOverlay
import meteor.ui.compose.overlay.ViewportOverlayRoot
import meteor.ui.compose.overlay.ViewportOverlayRoot.viewportOverlays

open class Plugin(val name: String, var enabledByDefault: Boolean = false, var hidden: Boolean = false) : EventSubscriber() {
    var configuration: Config? = null
    var running = false
    var overlays = ArrayList<Overlay>()

    init {
        if (hidden) {
            enabledByDefault = true
        }
    }

    open fun onStart() {

    }

    open fun onStop() {

    }

    fun start() {
        val enable = ConfigManager.get<Boolean>("plugin.$name.enabled", enabledByDefault)
        if (!enable && !hidden)
            return
        onStart()
        subscribeEvents(true)
        for (overlay in overlays) {
            when (overlay) {
                is ViewportOverlay -> viewportOverlays.add(overlay)
                is GameOverlay -> gameOverlays.add(overlay)
            }
        }
        running = true
        runningMap[this] = true
    }

    fun stop() {
        for (overlay in overlays) {
            when (overlay) {
                is ViewportOverlay -> viewportOverlays.remove(overlay)
                is GameOverlay -> gameOverlays.remove(overlay)
            }
        }
        unsubscribe()
        onStop()
        running = false
        runningMap[this] = false
    }

    inline fun <reified T> configuration(): T {
        configuration = T::class.constructors.first().call(this) as Config
        return configuration as T
    }

    fun <T : Overlay> overlay(instance: T): T {
        overlays.add(instance)
        return instance
    }
}