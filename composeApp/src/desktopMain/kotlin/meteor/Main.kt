package meteor

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import jagex2.client.Client
import meteor.Constants.RS_DIMENSIONS
import meteor.events.Command
import meteor.input.KeyListener
import meteor.input.TranslateMouseListener
import meteor.ui.compose.Window.MeteorWindow
import meteor.ui.config.FillMode
import meteor.ui.config.GPUFilter
import meteor.ui.config.RenderMode
import meteor.ui.swing.PostProcessGamePanel
import meteor.ui.swing.RS2GamePanel
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Dimension
import java.awt.Window


object Main {
    lateinit var client: Client
    lateinit var window: Window
    val gamePanel = PostProcessGamePanel()
    var initialSize = Dimension(801, 567)
    var fillMode = FillMode.FIT
    var gpuFilter = GPUFilter.LINEAR
    var renderMode = RenderMode.GPU
    var loaded = false

    var text = mutableStateOf("")
    var xPadding = mutableStateOf(0f)
    var windowWidth = mutableStateOf(0)
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
                // This Window be reloaded on events where it may be destroyed such as windows scaling changes
                if (!loaded)
                    initRS2()
                MeteorWindow()
            }
    }

    private fun initRS2() {
        //Common init
        client = Client()
        client.preInit()

        //Desktop init
        //We provide a custom JPanel impl that hooks the drawing process
        Client.gamePanel = RS2GamePanel(RS_DIMENSIONS.width, RS_DIMENSIONS.height)
        client.initApplication(RS_DIMENSIONS.width, RS_DIMENSIONS.height)
        gamePanel.addKeyListener(KeyListener)
        gamePanel.addMouseListener(TranslateMouseListener)
        gamePanel.addMouseMotionListener(TranslateMouseListener)
        loaded = true
    }

    fun processClientCommand(command: String) {
        when (command) {
            "fill" -> fillMode = FillMode.FILL
            "fit" -> {
                fillMode = FillMode.FIT
                window.repaint()
            }
            "reset_window" -> {
                window.size = initialSize
            }
            "filter" -> {
                Configuration.CPU_LINEAR = !Configuration.CPU_LINEAR
            }
            "gpu" -> {
                renderMode = when (renderMode) {
                    RenderMode.CPU -> RenderMode.GPU
                    RenderMode.GPU -> RenderMode.CPU
                }
            }
            "area" -> {
                gpuFilter = GPUFilter.AREA
            }
            "linear_gpu" -> {
                gpuFilter = GPUFilter.LINEAR
            }
            "cubic" -> {
                gpuFilter = GPUFilter.CUBIC
            }
            "lanc" -> {
                gpuFilter = GPUFilter.LANCZOS4
            }
        }
    }
}
