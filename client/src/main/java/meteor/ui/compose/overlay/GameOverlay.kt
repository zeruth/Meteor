package meteor.ui.compose.overlay

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.TextMeasurer

open class GameOverlay : Overlay() {
    open fun render(): @Composable BoxScope.() -> Unit = {}
}