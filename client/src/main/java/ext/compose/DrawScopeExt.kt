package ext.compose

import androidx.compose.ui.graphics.drawscope.DrawScope

object DrawScopeExt {
    fun DrawScope.dpToPx(dp: Float): Float {
        return dp * density
    }
}