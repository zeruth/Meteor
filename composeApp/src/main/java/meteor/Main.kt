package meteor

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import meteor.Constants.RS_DIMENSIONS
import meteor.audio.MidiPlayer
import meteor.audio.SoundPlayer
import meteor.events.Command
import meteor.events.PlaySong
import meteor.events.PlaySound
import meteor.events.StopMusic
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
import java.applet.Applet
import java.applet.AppletStub
import java.awt.Dimension
import java.awt.Frame
import java.awt.Window
import java.net.MalformedURLException
import java.net.URL
import java.util.*
import javax.sound.sampled.AudioSystem


class Main : Applet(), AppletStub{
    var client_parameters: Properties = Properties()
    init {
        // General
        client_parameters.put("1", "");
        client_parameters.put("2", "false");
        client_parameters.put("3", "0");
        client_parameters.put("5", "false");
        client_parameters.put("6", "Rxl4woCZsjcFFBT6wt6lwbrHiydCjdD8"); // dynamic
        client_parameters.put("9", "0");
        client_parameters.put("11", "1449949008"); // dynamic
        client_parameters.put("16", "");
        client_parameters.put("17", "14560"); // dynamic
        client_parameters.put("20", "110");
        client_parameters.put("24", "0"); // modewhere
        client_parameters.put("25", "0");
        client_parameters.put("26", "0");
        client_parameters.put("27", "0");
        client_parameters.put("31", "false");
        client_parameters.put("33", "false");
        client_parameters.put("34", "0");
        client_parameters.put("35", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk"); // dynamic
        client_parameters.put("36", "0");
        client_parameters.put("39", "0");
        client_parameters.put("40", "halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
        client_parameters.put("42", "false");
        client_parameters.put("46", "0");
        client_parameters.put("47", "");
        client_parameters.put("49", "false");
        client_parameters.put("51", "");
        client_parameters.put("52", "false");
        client_parameters.put("55", "false");

        // Connection 1
        client_parameters.put("28", "http://" + HOST_ADDRESS);

        // Connection 2 (content)
        client_parameters.put("23", HOST_ADDRESS);
        client_parameters.put("12", "43594");
        client_parameters.put("30", "443");
        client_parameters.put("32", "1200");

        // Connection 3 (httpContent)
        client_parameters.put("14", HOST_ADDRESS);
        client_parameters.put("44", "80");
        client_parameters.put("53", "443");
        client_parameters.put("45", "0");

        // Connection 4 (lobby)
        client_parameters.put("43", HOST_ADDRESS);
        client_parameters.put("29", "43594");
        client_parameters.put("41", "443");
        client_parameters.put("54", "1132"); // differs

        // Connection 5 (world)
        client_parameters.put("8", "43594");
        client_parameters.put("19", "443");
        client_parameters.put("50", "7");

        // Services
        client_parameters.put("10", HOST_ADDRESS); // .runescape.com
        client_parameters.put("13", "");
        client_parameters.put("18", "http://" + HOST_ADDRESS + "/operator/v1/");
        client_parameters.put("22", "http://" + HOST_ADDRESS +"/");
        client_parameters.put("37", "http://" + HOST_ADDRESS + "/m=gamelogspecs/clientstats?data=");
        client_parameters.put("38", "http://" + HOST_ADDRESS);
        client_parameters.put("48", ""); // 196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com
    }
    companion object {
        val main = Main()
        lateinit var client: Client
        lateinit var window: Window
        val hooks = Hooks
        val gamePanel = PostProcessGamePanel()
        var initialSize = Dimension(RS_DIMENSIONS.width, RS_DIMENSIONS.height + 28)
        var loaded = false
        var text = mutableStateOf("")
        const val HOST_ADDRESS: String = "localhost"

        init {
            System.setProperty("compose.interop.blending", "true")
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
            Window(onCloseRequest = ::exitApplication,
                title = "Meteor",
                state = WindowState(
                    size = DpSize(initialSize.width.dp, initialSize.height.dp),
                )) {
                Main.window = window
                window.isResizable = true
                window.background = java.awt.Color.BLACK
                //This Window be reloaded on events where it may be destroyed such as windows scaling changes
                if (!loaded)
                    initRS2()
                MeteorWindow()
                rs3Frame()
            }
        }

        fun rs3Frame() {
            val frame = Frame()
            frame.size = Dimension(800, 600)
            frame.add(main)
            frame.isVisible = true
        }

        private fun initRS2() {
            //Common init
            client = ClassLoader.getSystemClassLoader().loadClass("rs2.client.Client").newInstance() as Client
            client.callbacks = hooks
            try {
                client.preGameInit(main)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            loaded = true

            //Desktop init
            //We provide a custom JPanel impl that hooks the drawing process
            //client.setGamePanel(RS2GamePanel(RS_DIMENSIONS.width, RS_DIMENSIONS.height))
           // client.`initApplication$api`(RS_DIMENSIONS.width, RS_DIMENSIONS.height)
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
                RenderMode.CPU -> text.value = "Meteor 2.0.5-SNAPSHOT"
                RenderMode.GPU -> text.value = "Meteor 2.0.5-SNAPSHOT (GPU)"
                else -> {}
            }
            /*        if (client.loggedIn())
                        client.localPlayer?.let {
                            text.value += " - ${it.name}"
                        }*/
        }
    }


    override fun appletResize(dimensionX: Int, dimensionY: Int) {
        super.resize(Dimension(dimensionX, dimensionY))
    }

    override fun getParameter(paramName: String?): String {
        return client_parameters[paramName].toString()
    }

    override fun getDocumentBase(): URL? {
        return this.codeBase
    }

    override fun getCodeBase(): URL? {
        try {
            return URL("http://$HOST_ADDRESS")
        } catch (ex: MalformedURLException) {
            ex.printStackTrace()
        }

        return null
    }
}
