package meteor.plugin.account

import meteor.Main.client
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin

class AccountPlugin : Plugin("Account", true) {
    val config = configuration<AccountConfig>()

    override fun onStart() {
        update()
    }

    override fun onStop() {
        client.setAutoUsername("")
        client.setAutoPassword("")
        client.setKeepUsername(false)
        client.setKeepPassword(false)
    }

    override fun onConfigChanged(it: ConfigChanged) {
        if (it.affects(config)) {
            update()
        }
    }

    fun update() {
        client.setAutoUsername(config.autoUsername.get())
        client.setAutoPassword(config.autoPassword.get())
        client.setKeepUsername(config.keepUsername.get())
        client.setKeepPassword(config.keepPassword.get())
    }
}