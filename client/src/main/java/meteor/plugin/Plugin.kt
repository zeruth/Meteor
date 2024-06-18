package meteor.plugin

import meteor.config.Config
import meteor.config.ConfigManager
import meteor.ui.compose.sidebar.PluginsButton.Companion.runningMap

open class Plugin : EventSubscriber(){
    lateinit var name: String
    var enabledByDefault = false
    var configuration: Config? = null
    var running = false

    open fun onStart() {

    }
    open fun onStop() {

    }

    fun start() {
        val enable = ConfigManager.get<Boolean>("plugin.$name.enabled", enabledByDefault)
        if (!enable)
            return
        onStart()
        subscribeEvents(true)
        running = true
        runningMap[this] = true
    }

    fun stop() {
        unsubscribe()
        onStop()
        running = false
        runningMap[this] = false
    }

    inline fun <reified T> configuration(): T {
        configuration = T::class.java.getDeclaredConstructor().newInstance() as Config
        configuration!!.plugin = this
        return configuration as T
    }
}