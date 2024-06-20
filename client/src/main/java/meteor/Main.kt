package meteor

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import ext.kotlin.MutableStateExt.toggle
import meteor.Constants.RS_DIMENSIONS
import meteor.audio.MidiPlayer
import meteor.audio.SoundPlayer
import meteor.config.ConfigManager
import meteor.config.ConfigManager.properties
import meteor.config.MeteorConfig
import meteor.events.Command
import meteor.events.PlaySong
import meteor.events.PlaySound
import meteor.events.StopMusic
import meteor.input.KeyListener
import meteor.input.TranslateMouseListener
import meteor.plugin.PluginManager
import meteor.ui.compose.components.GamePanel
import meteor.ui.compose.components.Window.Window
import meteor.ui.config.AspectMode
import meteor.ui.config.CPUFilter
import meteor.ui.config.RenderMode
import meteor.ui.swing.PostProcessGamePanel
import meteor.ui.swing.RS2GamePanel
import net.runelite.api.Client
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Dimension
import java.awt.Window
import java.io.File
import javax.sound.sampled.AudioSystem


object Main {
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
        Window(
            onCloseRequest = ::exitApplication,
            title = "Meteor",
            state = WindowState(
                size = DpSize(initialSize.width.dp, initialSize.height.dp),
            )
        ) {
            this@Main.window = window
            window.isResizable = true
            window.background = java.awt.Color.BLACK
            //This Window be reloaded on events where it may be destroyed such as windows scaling changes
            if (!loaded)
                initRS2()
            Window()
            logger.info("Meteor-225 started in ${System.currentTimeMillis() - startupTime}ms")
        }
    }

    private fun initRS2() {
        //Common init
        client = ClassLoader.getSystemClassLoader().load<Client>()
        client.callbacks = hooks
        client.preGameInit()
        loaded = true

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

    fun updateStatusText() {
        var t = ""
        when (client.renderMode) {
            RenderMode.CPU -> t = "Meteor 2.0.5-SNAPSHOT"
            RenderMode.GPU -> t = "Meteor 2.0.5-SNAPSHOT (GPU)"
            else -> {}
        }
        ConfigManager.set("version", t)
        if (client.loggedIn())
            client.localPlayer?.let {
                t += " - ${it.name}"
            }
        text.value = t
    }

    private inline fun <reified T : Any> ClassLoader.load(): T {
        return loadClass(T::class.simpleName).getDeclaredConstructor().newInstance() as T
    }
}
