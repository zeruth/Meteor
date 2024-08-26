package meteor.ui.compose

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color

object Colors {
    val bg900 = Color(0x263238)
    val surfaceColor = Color(0xFF272525)
    val surfaceDarkColor = Color(0xFF1B1A1A)
    val surfaceDarkerColor = Color(0xFF111010)
    val secondaryColor = Color(0xFF00ff1a)
    val secondarySurfaceColor = Color(0xff292828)

    val surface = mutableStateOf(surfaceColor)
    val surfaceDark = mutableStateOf(surfaceDarkColor)
    val surfaceDarker = mutableStateOf(surfaceDarkerColor)
    val secondary = mutableStateOf(secondaryColor)
    val secondarySurface = mutableStateOf(this.secondarySurfaceColor)

    val green = Color(0xFF00ff1a)
    val purple = Color(0xff7e00e1)
    val red = Color(0x0ffff0000)
    val orange = Color(0x0ffff9900)
    val yellow = Color(0x0fffff500)
    val cyan = Color(0x0ff00ffe0)
    val blue = Color(0x0ff0038ff)
    val pink = Color(0x0fffa00ff)
}