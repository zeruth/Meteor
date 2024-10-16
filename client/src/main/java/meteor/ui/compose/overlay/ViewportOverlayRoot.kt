package meteor.ui.compose.overlay

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import ext.compose.DrawScopeExt.dpToPx
import meteor.Main
import meteor.Main.forceRecomposition
import meteor.ui.compose.components.GamePanel
import meteor.ui.compose.overlay.Overlay.Companion.debugOverlays
import meteor.ui.config.AspectMode
import net.runelite.api.Component
import java.awt.Dimension
import java.awt.Point

/**
 * This overlay is restricted to the viewport area
 */
object ViewportOverlayRoot {
    val VIEWPORT_DIMENSIONS = Dimension(512, 334)
    val VIEWPORT_OFFSETS = Point(8, 11)
    var yScale: Float? = null
    var xScale: Float? = null
    val polygons = HashMap<List<Point>, Color>()
    var width = mutableStateOf(Dp.Unspecified)
    var height = mutableStateOf(Dp.Unspecified)
    val canvasRenderTime = mutableStateOf(-1L)
    val viewportOverlays = ArrayList<ViewportOverlay>()
    var blockedViewportArea: Rect? = null

    @Composable
    fun render() {
        forceRecomposition.value
        updateScale()

        var xScale = xScale;
        var yScale = yScale;
        if (Main.client.aspectMode == AspectMode.FIT) {
            if (yScale!! > xScale!!)
                xScale = yScale
            else
                yScale = xScale
        }

        val offsetX = (VIEWPORT_OFFSETS.x * xScale!!).dp
        val offsetY = (VIEWPORT_OFFSETS.y * yScale!!).dp

        width.value = (VIEWPORT_DIMENSIONS.width * xScale).dp
        height.value = (VIEWPORT_DIMENSIONS.height * yScale).dp

        if (width.value == 0.0.dp || height.value == 0.0.dp) {
            return
        }

        var mod = if (Main.windowState.value == Main.fixedState) {
            Modifier
                .absoluteOffset(x = VIEWPORT_OFFSETS.x.dp, y = VIEWPORT_OFFSETS.y.dp)
                .size(DpSize(VIEWPORT_DIMENSIONS.width.dp, VIEWPORT_DIMENSIONS.height.dp))
                .clipToBounds()
                .background(Color.Transparent)
        } else {
            Modifier
                .absoluteOffset(x = offsetX, y = offsetY)
                .size(DpSize(width.value, height.value))
                .clipToBounds()
                .background(Color.Transparent)
        }
        if (/*Main.client.isLoggedIn() && */debugOverlays.value)
            mod = mod.background(Color.Red.copy(alpha = .2f))
        Box(mod) {
            forceRecomposition.value
            DrawPolygons(mod)
            for (overlay in viewportOverlays) {
                overlay.render().invoke(this)
            }
        }
    }

    @Composable
    fun DrawPolygons(mod: Modifier) {
        val textMeasurer = rememberTextMeasurer()
        Canvas(modifier = Modifier.fillMaxSize().background(Color.Transparent)) {
            forceRecomposition.value
            val canvasRenderStart = System.currentTimeMillis()

            val blockPath = Path().apply {
                if (Main.client.viewportInterfaceID != -1) {
                    Main.client.components[Main.client.viewportInterfaceID]?.let {
                        addRect(calculateComponentArea(it))
                    }
                } else {
                    blockedViewportArea = null
                }
                if (Main.client.menuVisible) {
                    addRect(getScaledRect(Main.client.menuX.toFloat(), Main.client.menuY.toFloat(), Main.client.menuWidth.toFloat(), Main.client.menuHeight.toFloat()))
                }
            }
            clipPath(blockPath, clipOp = ClipOp.Difference) {
                for (overlay in viewportOverlays) {
                    overlay.draw(textMeasurer).invoke(this)
                }
                for (points in polygons.keys) {
                    drawPolygon(points, polygons[points]!!)
                }
            }

            polygons.clear()
            canvasRenderTime.value = System.currentTimeMillis() - canvasRenderStart
        }
    }

    @Composable
    fun testBox() {
        Box(modifier = Modifier.width(250.dp).height(75.dp).background(Color.Green)) {

        }
    }

    fun DrawScope.calculateComponentArea(component: Component): Rect {
        val x = component.x.toFloat()
        val y = component.y.toFloat()
        val w = component.width.toFloat()
        val h = component.height.toFloat()
        return getScaledRect(x, y, w, h)
    }

    fun DrawScope.getScaledRect(x: Float, y: Float, w: Float, h: Float): Rect {
        return Rect(
            Offset(dpToPx(x * xScale!!), dpToPx(y * yScale!!)),
            Offset(dpToPx((x + w) * xScale!!), dpToPx((y + h) * yScale!!))
        )
    }

    fun DrawScope.drawPolygon(points: List<Point>, color: Color) {
        if (points.size != 4)
            throw RuntimeException("Invalid args for drawPolygon")

        val x = dpToPx(points[0].x * xScale!!)
        val y = dpToPx(points[0].y * yScale!!)
        val x1 = dpToPx(points[1].x * xScale!!)
        val y1 = dpToPx(points[1].y * yScale!!)
        val x2 = dpToPx(points[2].x * xScale!!)
        val y2 = dpToPx(points[2].y * yScale!!)
        val x3 = dpToPx(points[3].x * xScale!!)
        val y3 = dpToPx(points[3].y * yScale!!)

        drawLine(start = Offset(x, y), end = Offset(x1, y1), color = color)
        drawLine(start = Offset(x, y), end = Offset(x2, y2), color = color)
        drawLine(start = Offset(x1, y1), end = Offset(x3, y3), color = color)
        drawLine(start = Offset(x2, y2), end = Offset(x3, y3), color = color)
    }


    fun updateScale() {
        val scale = if (GamePanel.getWidthScale() < GamePanel.getHeightScale()) GamePanel.getWidthScale() else GamePanel.getHeightScale()
        if (Main.client.aspectMode == AspectMode.FIT) {
            yScale = scale
            xScale = scale
        } else {
            yScale = GamePanel.getHeightScale()
            xScale = GamePanel.getWidthScale()
        }
    }
}