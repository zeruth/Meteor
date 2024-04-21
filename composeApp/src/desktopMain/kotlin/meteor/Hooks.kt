package meteor

import net.runelite.api.Callbacks
import org.rationalityfrontline.kevent.KEVENT

object Hooks : Callbacks{
    override fun post(event: Any) {
        KEVENT.post(event)
    }
}