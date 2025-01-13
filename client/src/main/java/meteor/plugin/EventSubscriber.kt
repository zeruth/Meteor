package meteor.plugin


import meteor.events.ConfigChanged
import org.rationalityfrontline.kevent.KEventSubscriber
import org.rationalityfrontline.kevent.SubscriberThreadMode
import org.rationalityfrontline.kevent.subscribe
import org.rationalityfrontline.kevent.unsubscribeAll

open class EventSubscriber : KEventSubscriber {
    var listening: Boolean = false
    open fun onConfigChanged(it: ConfigChanged) {}

    open fun executeIfListening(unit: () -> (Unit)) {
        if (listening)
            unit()
    }

    fun subscribeEvents(listening: Boolean) {
        subscribeEvent<ConfigChanged> { executeIfListening { onConfigChanged(it) } }
        if (listening)
            this.listening = true
    }

    private inline fun <reified T : Any> subscribeEvent(noinline unit: (T) -> Unit) {
        subscribe(threadMode = SubscriberThreadMode.POSTING) { event -> unit.invoke(event.data) }
    }


    fun unsubscribe() {
        unsubscribeAll()
        listening = false
    }
}