package meteor

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import eventbus.events.GameStateChanged
import eventbus.events.SleepingChanged
import net.runelite.api.Constants.GAME_FIXED_SIZE
import meteor.events.Command
import meteor.input.KeyListener
import meteor.input.MouseManager
import meteor.input.TranslateMouseListener
import meteor.input.TranslateMouseWheelListener
import meteor.ui.compose.GamePanel
import meteor.ui.compose.Window.MeteorWindow
import meteor.ui.swing.PostProcessGamePanel
import net.runelite.api.Client
import net.runelite.api.GameState
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Dimension
import java.awt.Window


object Main {
    lateinit var client: Client
    lateinit var window: Window
    val mouseManager = MouseManager
    val hooks = Hooks
    val gamePanel = PostProcessGamePanel()
    var initialSize = Dimension(GAME_FIXED_SIZE.width, GAME_FIXED_SIZE.height)
    var loaded = false
    var text = mutableStateOf("")

    init {
        System.setProperty("compose.interop.blending", "true")
        gamePanel.background = java.awt.Color.BLACK
        KEVENT.subscribe<Command> { processClientCommand(it.data.command) }
        KEVENT.subscribe<GameStateChanged> {
            if (!client.isStretchedEnabled)
                enable()
            else
                disable()
        }
        KEVENT.subscribe<SleepingChanged> {
            if (it.data.isSleeping)
                enable()
            else
                disable()
        }
/*        KEVENT.subscribe<PlaySound> {
            SoundPlayer(AudioSystem.getAudioInputStream(it.data.sound), 0)
        }
        KEVENT.subscribe<PlaySong> { MidiPlayer.playSong(false) }
        KEVENT.subscribe<StopMusic> { MidiPlayer.stop() }*/
    }

    private val mouseListener = TranslateMouseListener
    private val mouseWheelListener = TranslateMouseWheelListener

    fun toggle(force: Boolean) {
        if (force) {
            if (!client.isStretchedEnabled)
                enable()
            if (client.isStretchedEnabled)
                disable()
        } else {
            if (client.isStretchedEnabled) {
                if (!shouldEnable())
                    disable()
            } else {
                if (shouldEnable())
                    enable()
            }
        }
    }

    fun shouldEnable() : Boolean
    {
        return false
    }
    fun enable() {
        mouseManager.registerMouseListener(0, mouseListener)
        mouseManager.registerMouseWheelListener(0, mouseWheelListener)
        client.isStretchedEnabled = true
        //updateConfig()
    }

    fun disable() {
        client.isStretchedEnabled = false
        client.invalidateStretching(true)
        mouseManager.unregisterMouseListener(mouseListener)
        mouseManager.unregisterMouseWheelListener(mouseWheelListener)
    }

    /**
     * Hello World!
     */
    @JvmStatic
    fun main(args: Array<String>) = application {
            Window(onCloseRequest = ::exitApplication,
                title = "Meteor",
                state = WindowState(
                    size = DpSize(initialSize.width.dp, initialSize.height.dp),
                )) {
                this@Main.window = window
                window.isResizable = true
                window.background = java.awt.Color.BLACK
                //This Window be reloaded on events where it may be destroyed such as windows scaling changes
                if (!loaded)
                    initRS2()
                MeteorWindow()
            }
    }

    private fun initRS2() {
        //Common init
        client = ClassLoader.getSystemClassLoader().load<Client>()
        client.callbacks = hooks
        //client.preGameInit()
        loaded = true

/*        //Desktop init
        //We provide a custom JPanel impl that hooks the drawing process
        client.setGamePanel(RS2GamePanel(RS_DIMENSIONS.width, RS_DIMENSIONS.height))
        client.`initApplication$api`(RS_DIMENSIONS.width, RS_DIMENSIONS.height)*/
        gamePanel.addKeyListener(KeyListener)
/*        gamePanel.addMouseListener(TranslateMouseListener)
        gamePanel.addMouseMotionListener(TranslateMouseListener)*/
    }

    fun processClientCommand(command: String) {
        when (command) {
/*            "fill" -> client.aspectMode = AspectMode.FILL
            "fit" -> {
                client.aspectMode = AspectMode.FIT
                window.repaint()
            }
            "reset_window" -> {
                window.size = initialSize
            }
            "filter" -> {
                client.cpuFilter = when (client.cpuFilter) {
                    CPUFilter.BILINEAR -> CPUFilter.NONE
                    CPUFilter.NONE -> CPUFilter.BILINEAR
                    else -> CPUFilter.NONE
                }
            }*/
            "overlay" -> {
                GamePanel.debugOverlay.value = !GamePanel.debugOverlay.value
            }
        }
    }

    fun updateStatusText() {
/*        when (client.renderMode) {
            RenderMode.CPU -> text.value = "Meteor 2.0.5-SNAPSHOT"
            RenderMode.GPU -> text.value = "Meteor 2.0.5-SNAPSHOT (GPU)"
            else -> {}
        }
        if (client.loggedIn())
            client.localPlayer?.let {
                text.value += " - ${it.name}"
            }*/
    }

    private inline fun<reified T : Any> ClassLoader.load(): T {
        return loadClass(T::class.simpleName).getDeclaredConstructor().newInstance() as T
    }
}
