package meteor

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.key
import androidx.compose.ui.window.application
import client.client
import com.google.gson.GsonBuilder
import meteor.DiscordPresence.updatingDiscordState
import meteor.audio.MidiPlayer
import meteor.audio.SoundPlayer
import meteor.config.ConfigManager
import meteor.plugin.PluginManager
import meteor.ui.MeteorWindow.MeteorWindow
import meteor.ui.components.sidebar.buttons.DiscordStatusButton.Companion.showDiscordStatusWindow
import java.io.File

object Main {
    lateinit var client: client
    val gson = GsonBuilder().setPrettyPrinting().create()
    val logger = Logger("main")
    private val startupTime = System.currentTimeMillis()
    private var started = false

    init {
        Logger.logFile = File(Configuration.dataDir, "log.txt")
        MidiPlayer.init()
        SoundPlayer.init()
        Game.init()
        PluginManager.startPlugins()

        val lastPresence = ConfigManager.get<String>("DiscordRPCStatus", "")
        DiscordPresence.update(lastPresence)
    }

    @JvmStatic
    fun main(args: Array<String>) = application {
        MeteorWindow()

        key(updatingDiscordState.value) {
            if (updatingDiscordState.value)
                showDiscordStatusWindow()
        }

        if (!started) {
            LaunchedEffect(Unit) {
                val startupDuration = System.currentTimeMillis() - startupTime
                logger.info("Startup time: ${startupDuration}ms")
            }
            started = true
        }
    }
}