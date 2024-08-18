package meteor.plugin


import meteor.events.Command
import meteor.events.LoggedInChanged
import meteor.events.Logout
import meteor.events.SkillUpdate
import meteor.events.client.ConfigChanged
import meteor.ui.compose.events.PreRender
import org.rationalityfrontline.kevent.KEventSubscriber
import org.rationalityfrontline.kevent.SubscriberThreadMode
import org.rationalityfrontline.kevent.subscribe
import org.rationalityfrontline.kevent.unsubscribeAll

open class EventSubscriber : KEventSubscriber {
    var listening: Boolean = false
    open fun onCommand(it: Command) {}
    open fun onConfigChanged(it: ConfigChanged) {}
    open fun onPreRender(it: PreRender) {}
    open fun onLoggedInChanged(it: LoggedInChanged) {}
    open fun onSkillUpdate(it: SkillUpdate) {}
    open fun onLogout(it: Logout) {}

    open fun executeIfListening(unit: () -> (Unit)) {
        if (listening)
            unit()
    }

    fun subscribeEvents(listening: Boolean) {
        subscribeEvent<Command> { executeIfListening { onCommand(it) } }
        subscribeEvent<ConfigChanged> { executeIfListening { onConfigChanged(it) } }
        subscribeEvent<PreRender> { executeIfListening { onPreRender(it) } }
        subscribeEvent<LoggedInChanged> { executeIfListening { onLoggedInChanged(it) } }
        subscribeEvent<SkillUpdate> { executeIfListening { onSkillUpdate(it) } }
        subscribeEvent<Logout> { executeIfListening { onLogout(it) } }
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

    private val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
}