package meteor

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import com.google.gson.GsonBuilder
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
import meteor.ui.compose.components.Window.configWidth
import meteor.ui.compose.components.Window.panelOpen
import meteor.ui.compose.components.Window.sidebarWidth
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

    var setupSize = false

    @Composable
    fun getWidthDensity(): Float {
        val density = LocalDensity.current
        val gameWidth = initialSize.width * density.density
        val sidebarWidth = sidebarWidth.value * density.density
        var panelWidth = if (panelOpen.value) configWidth.value.value else 0F
        panelWidth *= density.density
        val minWidth = gameWidth + sidebarWidth.value + panelWidth
        return minWidth
    }

    fun getWidth(): Float {
        val gameWidth = initialSize.width
        val sidebarWidth = sidebarWidth.value
        val panelWidth = if (panelOpen.value) configWidth.value.value else 0F
        val minWidth = gameWidth + sidebarWidth.value + panelWidth
        return minWidth
    }

    fun getHeight(): Int {
        val minHeight = initialSize.height
        return minHeight
    }

    @Composable
    fun getHeightDensity(): Int {
        val density = LocalDensity.current
        var panelWidth = if (panelOpen.value) configWidth.value.value else 0F
        panelWidth *= density.density
        val minHeight = (initialSize.height * density.density).toInt()
        return minHeight
    }

    val windowedState = WindowState(
        size = DpSize(getWidth().dp, getHeight().dp),
        position = WindowPosition(Alignment.Center),
        placement = WindowPlacement.Floating)

    val fullscreenState = WindowState(
        size = DpSize(getWidth().dp, getHeight().dp),
        placement = WindowPlacement.Maximized)

    val fixedState = WindowState(
        size = DpSize(getMinimumWidth().dp, getMinimumHeight().dp),
        position = WindowPosition(Alignment.Center),
        placement = WindowPlacement.Floating)

    val fullscreen = ConfigManager.get<Boolean>("meteor.fullscreen", false)
    val stretched = ConfigManager.get<Boolean>("plugin.Stretched Mode.enabled", false)

    val windowState =
        if (fullscreen) {
            mutableStateOf(fullscreenState)
        }
        else if (stretched) {
            mutableStateOf(windowedState)
        }
        else {
            mutableStateOf(fixedState)
        }

    fun getMinimumWidth() : Int {
        return 15 + RS_DIMENSIONS.width + sidebarWidth.value.value.toInt()
    }

    fun getMinimumHeight() : Int {
        return 40 + RS_DIMENSIONS.height
    }

    /**
     * Hello World!
     */
    @JvmStatic
    fun main(args: Array<String>) = application {
        key(windowState.value) {
            Window(
                onCloseRequest = ::exitApplication,
                title = "Meteor $version",
                state = windowState.value,
                undecorated = windowState.value == fullscreenState,
                resizable = windowState.value != fixedState,
                icon = painterResource("Meteor.ico")
            ) {
                this@Main.window = window
                if (!loaded)
                    initRS2()
                Window()
                if (!loaded)
                    logger.info("Meteor-225 started in ${System.currentTimeMillis() - startupTime}ms")
                loaded = true
            }
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
