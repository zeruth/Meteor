package meteor

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import client.Configuration
import client.client
import client.events.DrawFinished
import meteor.Main.client as clientInstance
import jagex2.client.GameShell
import org.rationalityfrontline.kevent.KEVENT
import sign.signlink
import java.net.InetAddress

/**
 * [gameImage]
 *  Compose format image where final images are drawn
 * [loadingImage]
 *  Game draws loading screens outside of draw() in a busy loop
 *  directly to parent containers graphics
 *  Hooking that would require code changes in deob, so we do it this way:
 *  While loading, the current image is drawn every 1ms
 *  Then the loading draw thread is discarded when draw() events fire off naturally
 */
object Game {
    val gameImage = mutableStateOf<ImageBitmap?>(null)
    val loadingImage = mutableStateOf<ImageBitmap?>(null)

    val loadingDrawThread = Thread {
        while (gameImage.value == null) {
            loadingImage.value = GameShell.image.toComposeImageBitmap()
            Thread.sleep(1)
        }
    }

    init {
        KEVENT.subscribe<DrawFinished> {
            gameImage.value = GameShell.image.toComposeImageBitmap()
        }
    }

    fun init() {
        clientInstance = client()
        client.nodeId = 10
        client.portOffset = 0
        client.setHighMemory()
        client.members = false
        signlink.startpriv(InetAddress.getByName("localhost"))
        Configuration.INTERCEPT_GRAPHICS = true
        clientInstance.initApplication(789, 532)
        loadingDrawThread.start()
    }
}