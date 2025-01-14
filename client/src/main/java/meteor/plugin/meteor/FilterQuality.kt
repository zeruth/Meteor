package meteor.plugin.meteor

enum class FilterQuality(val composeValue: androidx.compose.ui.graphics.FilterQuality) {
    None(androidx.compose.ui.graphics.FilterQuality.None),
    Low(androidx.compose.ui.graphics.FilterQuality.Low),
    Medium(androidx.compose.ui.graphics.FilterQuality.Medium),
    High(androidx.compose.ui.graphics.FilterQuality.High),
}