package meteor.ui.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.*
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

object Util {
    @Composable
    fun getTextWidth(text: String, size: TextUnit) : Dp {
        val style = TextStyle(fontSize = size)
        val textMeasurer = rememberTextMeasurer()
        val widthInPixels = textMeasurer.measure(text, style).size.width
        return with(LocalDensity.current) { widthInPixels.toDp() }
    }

    @Composable
    fun getCenteredTextOffset(text: String, size: TextUnit): Dp {
        return getTextWidth(text, size) / 2
    }
}