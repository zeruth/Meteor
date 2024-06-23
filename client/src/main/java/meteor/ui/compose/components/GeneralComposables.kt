package meteor.ui.compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import meteor.ui.compose.Colors

object GeneralComposables {
    /**
     * Will draw [left] content, fill remaining space with weighted [Spacer], then draw [right] content
     */
    @Composable
    fun SidedNode(height: Int, left: @Composable RowScope.() -> Unit, right: @Composable RowScope.() -> Unit, color: Color = Colors.surface.value) {
        Box(Modifier.clip(RoundedCornerShape(8.dp)).background(color).fillMaxWidth().height(height.dp)) {
            Row(Modifier.fillMaxSize()) {
                left.invoke(this)
                Spacer(modifier = Modifier.weight(1f))
                right.invoke(this)
            }
        }
    }
}