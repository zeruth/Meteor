package meteor.ui.compose.overlay

import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.TextMeasurer

open class ViewportOverlay : Overlay() {
    open fun render(textMeasurer: TextMeasurer): DrawScope.() -> Unit = {}
}