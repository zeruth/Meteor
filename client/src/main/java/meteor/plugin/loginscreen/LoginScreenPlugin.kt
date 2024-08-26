package meteor.plugin.loginscreen

import meteor.audio.MidiPlayer
import meteor.config.ConfigManager
import meteor.plugin.Plugin

class LoginScreenPlugin: Plugin("Login Screen", enabledByDefault = true, cantDisable = true, hidden = true) {
    val overlay = overlay(LoginScreenOverlay())

    override fun onStart() {
        val musicEnabled = ConfigManager.get<Boolean>("meteor.loginMusicEnabled", true)
        if (!musicEnabled) {
            MidiPlayer.preventLoginMusic = true;
        }
    }
}