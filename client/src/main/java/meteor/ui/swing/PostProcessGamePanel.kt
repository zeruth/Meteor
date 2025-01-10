package meteor.ui.swing

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.unit.dp
import meteor.Main
import meteor.Main.forceRecomposition
import meteor.events.DrawFinished
import meteor.ui.compose.components.Window.gameWidth
import meteor.ui.compose.components.Window.panelOpen
import meteor.ui.swing.RS2GamePanel.Companion.image
import org.rationalityfrontline.kevent.KEVENT
import java.awt.*
import java.time.Instant
import java.util.concurrent.ConcurrentLinkedQueue
import javax.swing.JPanel


/**
 *  Handle scaling / stretching / post-processing
 */
class PostProcessGamePanel : JPanel() {
    private var graphics2D: Graphics2D? = null
    private var loading = true
    companion object {
        private val swingRenderTimes = ConcurrentLinkedQueue<Pair<Instant, Long>>()
        val swingFPS = mutableStateOf(0)

        private fun removeOldEntries() {
            val cutoff = Instant.now().minusSeconds(1)
            while (swingRenderTimes.peek()?.first?.isBefore(cutoff) == true) {
                swingRenderTimes.poll()
            }
        }

        var imageBitmap = mutableStateOf<ImageBitmap?>(null)
    }

    init {
        //Loading
        Thread {
            while (loading) {
                //Must sleep 1ms to draw correctly on fast cpus
                Thread.sleep(1)
                image?.let { draw() }
            }
        }.start()

        //Login/In-game
        KEVENT.subscribe<DrawFinished> {
            //Forces compose overlays to update every frame
            forceRecomposition.value = !forceRecomposition.value
            //Kill the loading drawing thread
            loading = false
            checkFocus()
            draw()
            gameWidth.value = Main.gamePanel.width.dp
        }
    }

    fun draw() {
        val timer = System.currentTimeMillis()
        super.getGraphics()?.let {
            graphics2D = it as Graphics2D
            val finalImage = image!!
            imageBitmap.value = finalImage.toComposeImageBitmap()
        }
        Main.swingTime.value = System.currentTimeMillis() - timer
        val renderTime = (Main.swingTime.value).coerceAtLeast(1)
        val now = Instant.now()
        swingRenderTimes.add(now to renderTime)
        removeOldEntries()
        swingFPS.value = swingRenderTimes.size
    }

    /**
     * This fixes a compose bug where focus would be lost every click causing subsequent keystrokes to be ignored.
     */
    private fun checkFocus() {
        if (Main.window.isFocused) {
            val focusOwner = KeyboardFocusManager.getCurrentKeyboardFocusManager().focusOwner
            if (!panelOpen.value) {
                focusOwner?.let {
                    if (it::class.java.toString().contains("org.jetbrains.skiko.SkiaLayer")) {
                        Main.gamePanel.grabFocus()
                    }
                }
                if (focusOwner == null) {
                    Main.gamePanel.grabFocus()
                }
            }
        }
    }
}