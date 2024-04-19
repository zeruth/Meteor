package meteor

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import jagex2.client.Client
import meteor.Configuration.DIMENSIONS
import meteor.impl.Command
import meteor.input.KeyListener
import meteor.input.TranslateMouseListener
import meteor.ui.compose.GamePanel
import meteor.ui.compose.GamePanel.RS2GameView
import meteor.ui.compose.Window.MeteorWindow
import meteor.ui.swing.PostProcessGamePanel
import meteor.ui.swing.RS2GamePanel
import org.rationalityfrontline.kevent.KEVENT
import java.awt.Dimension
import java.awt.Window


object Main {
    lateinit var client: Client
    val gamePanel = PostProcessGamePanel()
    lateinit var window: Window
    private var initialSize = Dimension(801, 567)

    init {
        System.setProperty("compose.interop.blending", "true")
        gamePanel.background = java.awt.Color.BLACK

        KEVENT.subscribe<Command> {
            when (it.data.command) {
                "fill" -> Configuration.STRETCH_TO_FILL = true
                "fit" -> {
                    Configuration.STRETCH_TO_FILL = false
                    window.repaint()
                }
                "reset_window" -> {
                    window.size = initialSize
                }
                "filter" -> {
                    Configuration.FILTER = !Configuration.FILTER
                }
            }
        }
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
        Client.gamePanel = RS2GamePanel(DIMENSIONS.width, DIMENSIONS.height)
        client.initApplication(DIMENSIONS.width, DIMENSIONS.height)
        gamePanel.addKeyListener(KeyListener)
        gamePanel.addMouseListener(TranslateMouseListener)
        gamePanel.addMouseMotionListener(TranslateMouseListener)
    }
}
