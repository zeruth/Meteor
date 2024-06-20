package meteor

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import ext.java.ClassLoaderExt.createInstance
import meteor.Constants.RS_DIMENSIONS
import meteor.audio.MidiPlayer
import meteor.audio.SoundPlayer
import meteor.config.ConfigManager
import meteor.config.MeteorConfig
import meteor.events.Command
import meteor.events.PlaySong
import meteor.events.PlaySound
import meteor.events.StopMusic
import meteor.input.KeyListener
import meteor.input.TranslateMouseListener
import meteor.plugin.PluginManager
import meteor.ui.compose.components.Window.Window
import meteor.ui.swing.PostProcessGamePanel
import meteor.ui.swing.RS2GamePanel
import net.runelite.api.Client
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Dimension
import java.awt.Window
import java.io.File
import javax.sound.sampled.AudioSystem

object Main {
    val version  = "2.0.7-SNAPSHOT"
    lateinit var client: Client
    lateinit var window: Window
    val hooks = Hooks
    val logger = Logger("Main")
    val gamePanel = PostProcessGamePanel()
    var initialSize = Dimension(RS_DIMENSIONS.width, RS_DIMENSIONS.height + 28)
    var loaded = false
    var text = mutableStateOf("")
    val config = MeteorConfig()
    var forceRecomposition = mutableStateOf(false)
    var swingTime = mutableStateOf(1L)
    var composeTime = mutableStateOf(1L)
    val startupTime = System.currentTimeMillis()

    init {
        System.setProperty("compose.interop.blending", "true")
        Logger.logFile = File(Configuration.dataDir, "log.txt")
        logger.info("Logging to " + Logger.logFile.absolutePath)
        ConfigManager
        ConfigManager.set("version", version)
        gamePanel.background = java.awt.Color.BLACK
        KEVENT.subscribe<Command> { processClientCommand(it.data.command) }
        KEVENT.subscribe<PlaySound> {
            SoundPlayer(AudioSystem.getAudioInputStream(it.data.sound), 0)
        }
        KEVENT.subscribe<PlaySong> { MidiPlayer.playSong(false) }
        KEVENT.subscribe<StopMusic> { MidiPlayer.stop() }
    }

    /**
     * Hello World!
     */
    @JvmStatic
    fun main(args: Array<String>) = application {
        /**
         * This Window be reloaded on events where it may be destroyed such as windows scaling changes
         * So we check if it has already been loaded where needed
         */
        Window(
            onCloseRequest = ::exitApplication,
            title = "Meteor $version",
            state = WindowState(
                size = DpSize(initialSize.width.dp, initialSize.height.dp)
            ),
            icon = painterResource("Meteor.ico")
        ) {
            this@Main.window = window
            window.isResizable = true
            window.background = java.awt.Color.BLACK
            if (!loaded)
                initRS2()
            Window()
            if (!loaded)
                logger.info("Meteor-225 started in ${System.currentTimeMillis() - startupTime}ms")
            loaded = true
        }
    }

    private fun initRS2() {
        //Common init
        client = ClassLoader.getSystemClassLoader().createInstance<Client>()
        client.callbacks = hooks
        client.preGameInit()

        PluginManager.startPlugins()

        //Desktop init
        //We provide a custom JPanel impl that hooks the drawing process
        client.setGamePanel(RS2GamePanel(RS_DIMENSIONS.width, RS_DIMENSIONS.height))
        client.`initApplication$api`(RS_DIMENSIONS.width, RS_DIMENSIONS.height)
        gamePanel.addKeyListener(KeyListener)
        gamePanel.addMouseListener(TranslateMouseListener)
        gamePanel.addMouseMotionListener(TranslateMouseListener)
    }

    fun processClientCommand(command: String) {
        when (command) {
            "reset_window" -> {
                window.size = initialSize
            }
        }
    }
}
