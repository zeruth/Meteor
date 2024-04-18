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
import meteor.input.KeyListener
import meteor.input.TranslateMouseListener
import java.awt.Dimension
import java.awt.Window
import java.awt.event.KeyEvent
import javax.swing.AbstractAction
import javax.swing.ActionMap
import javax.swing.InputMap
import javax.swing.KeyStroke


object Main {
    lateinit var client: Client
    val gamePanel = PostProcessGamePanel()
    lateinit var window: Window

    init {
        System.setProperty("compose.interop.blending", "true")
        gamePanel.background = java.awt.Color.BLACK
    }


    /**
     * Hello World!
     */
    @JvmStatic
    fun main(args: Array<String>) = application {
            Window(onCloseRequest = ::exitApplication, title = "Meteor", state = WindowState(size = DpSize(802.dp, 567.dp))) {
                this.window.isResizable = true
                this.window.minimumSize = Dimension(DIMENSIONS.width, DIMENSIONS.height)
                this.window.background = java.awt.Color.BLACK
                this@Main.window = this.window
                initRS2()
                MeteorWindow()
            }
    }

    @Composable
    fun MeteorWindow() {
        SwingPanel(factory = { gamePanel }, modifier = Modifier.fillMaxSize())
        Text("Meteor 2.0.0", color = Color.Cyan, fontSize = 8.sp, modifier = Modifier.fillMaxSize())
    }

    private fun initRS2() {
        //Common init
        client = Client()
        client.preInit()

        //Desktop init
        //We provide a custom JPanel impl that hooks the drawing process
        Client.gamePanel = RS2GamePanel(DIMENSIONS.width, DIMENSIONS.height)
        Client.gamePanel.size = Dimension(DIMENSIONS.width, DIMENSIONS.height)
        client.initApplication(DIMENSIONS.width, DIMENSIONS.height)
        gamePanel.addKeyListener(KeyListener)
        gamePanel.addMouseListener(TranslateMouseListener)
        gamePanel.addMouseMotionListener(TranslateMouseListener)
    }
}
