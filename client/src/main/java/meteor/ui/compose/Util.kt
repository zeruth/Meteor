package meteor.ui.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

object Util {
    @Composable
    fun getTextWidth(text: String, size: TextUnit): Dp {
        val style = TextStyle(fontSize = size)
        val textMeasurer = rememberTextMeasurer()
        val widthInPixels = textMeasurer.measure(text, style).size.width
        return with(LocalDensity.current) { widthInPixels.toDp() }
    }

    @Composable
    fun getCenteredTextOffset(text: String, size: TextUnit): Dp {
        return getTextWidth(text, size) / 2
    }

    fun DrawScope.getTextWidth(textMeasurer: TextMeasurer, text: String, size: TextUnit): Int {
        val style = TextStyle(fontSize = size)
        return textMeasurer.measure(text, style).size.width
    }

    fun DrawScope.getCenteredTextOffset(textMeasurer: TextMeasurer, text: String, size: TextUnit): Int {
        return getTextWidth(textMeasurer, text, size) / 2
    }
}