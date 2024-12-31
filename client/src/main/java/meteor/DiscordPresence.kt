package meteor

import io.github.vyfor.kpresence.RichClient
import io.github.vyfor.kpresence.logger.ILogger
import io.github.vyfor.kpresence.logger.LogLevel
import io.github.vyfor.kpresence.rpc.ActivityType
import meteor.plugin.PluginManager
import meteor.plugin.discord.DiscordPlugin

object DiscordPresence {
    private val discordClient = RichClient(969159977463848960)

    init {
        discordClient.logger = ILogger.default(level = LogLevel.TRACE)
        discordClient.connect(shouldBlock = true)
    }

    fun update(
        type: ActivityType = ActivityType.GAME,
        details: String? = null,
        state: String? = null,) {
        discordClient.update {
            this.type = type
            this.details = details
            this.state = state

            timestamps {
                start = now()
            }

            button("Play 2004scape", "https://2004scape.org/")
        }
    }

    fun update(state: String?) {
        var state = state
        PluginManager.get<DiscordPlugin>()?.let {
            if (!it.enabled())
                return
            if (!Main.client.isLoggedIn && !it.sendStatusLoggedOut())
                state = null
        }
        val details = if (Main.client.isLoggedIn) "Logged in" else "Logged out"

        if (state == null || state!!.length < 2 || state!!.length > 128) {
            update(details = details, state = null)
            return
        }

        update(details = details, state = state)
    }
}