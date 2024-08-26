package meteor.plugin.loginscreen.buttons

import androidx.compose.runtime.mutableStateOf
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.GlobeSolid
import meteor.plugin.loginscreen.LoginScreenButton

class WorldSelectionButton : LoginScreenButton() {
    companion object {
        val worldSelectorVisible = mutableStateOf(false)
    }
    init {
        icon = LineAwesomeIcons.GlobeSolid
    }

    override fun onClick() {
        worldSelectorVisible.value =  !worldSelectorVisible.value
    }
}