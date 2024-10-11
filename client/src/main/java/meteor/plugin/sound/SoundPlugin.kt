package meteor.plugin.sound

import meteor.Main
import meteor.Main.client
import meteor.events.LoggedInChanged
import meteor.events.PlaySong
import meteor.events.StopMusic
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin

class SoundPlugin : Plugin("Sound", cantDisable = true) {
    val config = configuration<SoundConfig>()
    override fun onStart() {
        client.setOnlyPlayJingles(config.onlyPlayJingles.get<Boolean>())
        updateSong()
    }

    fun updateSong() {
        if (client.isLoggedIn) {
            if (client.onlyPlayJingles()) {
                client.callbacks.post(StopMusic)
            } else {
                Main.lastSong?.let {
                    client.callbacks.post(PlaySong(it))
                }
            }
        }
    }

    override fun onStop() {
        client.setOnlyPlayJingles(false)
        updateSong()
    }

    override fun onConfigChanged(it: ConfigChanged) {
        if (it.affects(config)) {
            if (it.item == config.onlyPlayJingles) {
                if (config.onlyPlayJingles.get<Boolean>())
                    client.callbacks.post(StopMusic)
            }
            client.setOnlyPlayJingles(config.onlyPlayJingles.get<Boolean>())
            updateSong()
        }
    }

    override fun onLoggedInChanged(it: LoggedInChanged) {
        updateSong()
    }
}