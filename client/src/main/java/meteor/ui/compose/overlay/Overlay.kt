package meteor.ui.compose.overlay

import androidx.compose.runtime.mutableStateOf

open class Overlay {
    companion object {
        var debugOverlays = mutableStateOf(false)
    }
}