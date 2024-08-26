package meteor.plugin.loginscreen.buttons

import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.VolumeMuteSolid
import compose.icons.lineawesomeicons.VolumeUpSolid
import meteor.Main
import meteor.audio.MidiPlayer
import meteor.config.ConfigManager
import meteor.plugin.loginscreen.LoginScreenButton

class MusicControlButton : LoginScreenButton() {
    init {
        icon = if (ConfigManager.get<Boolean>("meteor.loginMusicEnabled", true))
            LineAwesomeIcons.VolumeUpSolid
        else
            LineAwesomeIcons.VolumeMuteSolid
    }

    override fun onClick() {
        if (icon == LineAwesomeIcons.VolumeUpSolid) {
            icon = LineAwesomeIcons.VolumeMuteSolid
            Main.client.`stopMidi$api`()
            ConfigManager.set("meteor.loginMusicEnabled", false)
            MidiPlayer.preventLoginMusic = true;
        }
        else {
            icon = LineAwesomeIcons.VolumeUpSolid
            Main.client.`setMidi$api`("scape_main", 12345678, 40000)
            ConfigManager.set("meteor.loginMusicEnabled", true)
            MidiPlayer.preventLoginMusic = false;
        }
    }
}