package ext.kotlin

import androidx.compose.runtime.MutableState

object MutableStateExt {
    fun MutableState<Boolean>.toggle() {
        this.value = !this.value
    }
}