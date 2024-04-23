package meteor

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import meteor.Constants.RS_DIMENSIONS
import meteor.events.Command
import meteor.input.KeyListener
import meteor.input.TranslateMouseListener
import meteor.ui.compose.GamePanel
import meteor.ui.compose.Window.MeteorWindow
import meteor.ui.config.AspectMode
import meteor.ui.config.CPUFilter
import meteor.ui.config.GPUFilter
import meteor.ui.config.RenderMode
import meteor.ui.swing.PostProcessGamePanel
import meteor.ui.swing.RS2GamePanel
import net.runelite.api.Client
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Dimension
import java.awt.Window


object Main {
    lateinit var client: Client
    lateinit var window: Window
    val hooks = Hooks
    val gamePanel = PostProcessGamePanel()
    var initialSize = Dimension(RS_DIMENSIONS.width, RS_DIMENSIONS.height + 28)
    var loaded = false
    var text = mutableStateOf("")

    init {
        System.setProperty("compose.interop.blending", "true")
        gamePanel.background = java.awt.Color.BLACK
        KEVENT.subscribe<Command> { processClientCommand(it.data.command) }
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
        client = ClassLoader.getSystemClassLoader().loadClass("Client").newInstance() as Client
        client.callbacks = hooks
        client.preInit()
        loaded = true

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
            "fill" -> client.aspectMode = AspectMode.FILL
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
            }
            "gpu" -> {
                client.renderMode = when (client.renderMode) {
                    RenderMode.CPU -> RenderMode.GPU
                    RenderMode.GPU -> RenderMode.CPU
                    else -> RenderMode.CPU
                }
            }
            "area" -> {
                client.gpuFilter = GPUFilter.AREA
            }
            "linear_gpu" -> {
                client.gpuFilter = GPUFilter.LINEAR
            }
            "cubic" -> {
                client.gpuFilter = GPUFilter.CUBIC
            }
            "lanc" -> {
                client.gpuFilter = GPUFilter.LANCZOS4
            }
            "overlay" -> {
                GamePanel.debugOverlay.value = !GamePanel.debugOverlay.value
            }
        }
    }

    fun updateStatusText() {
        when (client.renderMode) {
            RenderMode.CPU -> text.value = "Meteor 2.0.4"
            RenderMode.GPU -> text.value = "Meteor 2.0.4 (GPU)"
            else -> {}
        }
    }
}
