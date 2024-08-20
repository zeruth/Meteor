package meteor.plugin.xptracker

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import meteor.Main.client
import meteor.Main.forceRecomposition
import meteor.ui.compose.overlay.ViewportOverlay
import net.runelite.api.Skill
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


/**
 * TODO: Very unoptimized atm.
 */
class XPTrackerOverlay(val plugin: XPTrackerPlugin) : ViewportOverlay() {
    var height = mutableStateOf(20)
    var width = mutableStateOf(120)
    var skillUpdates = Collections.synchronizedMap(HashMap<Skill, Long>())
/*    var skillIcons = HashMap<Skill, Image>()

    init {
        for (skill in Skill.values()) {
            skillIcons[skill] = ImageUtil.resizeCanvas(ImageUtil.resizeImage(SkillIconManager.getSkillImage(skill, true), IMAGE_SIZE, IMAGE_SIZE), ICON_DIMENSIONS.width, ICON_DIMENSIONS.height)
            skillXPBars[skill] = getSkilXOBar(skill)
        }
    }*/
    override fun render(): @Composable BoxScope.() -> Unit = {
        var offsetX by remember { mutableStateOf(0f) }
        var offsetY by remember { mutableStateOf(0f) }

        Box(modifier = Modifier.offset { IntOffset(offsetX.toInt(), offsetY.toInt()) }.clip(RoundedCornerShape(4.dp)).background(meteor.ui.compose.Colors.surfaceColor).draggableComponent { change, dragAmount ->
            offsetX += dragAmount.x
            offsetY += dragAmount.y
        }) {
            Column {
                forceRecomposition.value
                val pendingRemovals = ArrayList<Skill>()
                synchronized(skillUpdates) {
                    for (skill in skillUpdates.keys) {
                        val lastUpdate = skillUpdates[skill]!!
                        val duration = System.currentTimeMillis() - lastUpdate
                        if (duration > (plugin.config.skillTimeout.get<Int>() * (60 * 1000))) {
                            println("Dropping skill update for " + skill.name)
                            pendingRemovals.add(skill)
                        }
                    }
                    for (skill in pendingRemovals) {
                        skillUpdates.remove(skill)
                    }
                    for (skill in skillUpdates.keys) {
                        renderSkillBox(skill).invoke(this@Box)
                    }
                }
            }
        }
    }

    fun renderSkillBox(skill: Skill): @Composable BoxScope.() -> Unit = {
        var offsetX by remember { mutableStateOf(0f) }
        var offsetY by remember { mutableStateOf(0f) }

        Box(modifier = Modifier.width(width.value.dp).height(height.value.dp).clip(RoundedCornerShape(4.dp)).background(meteor.ui.compose.Colors.surfaceDarkColor)) {
            Row {
                Image(painterResource(skill.smallIconResource()), "${skill.name}-icon", modifier = Modifier.size(height.value.dp))
                Column(modifier = Modifier.size(height.value.dp)) {
                    Text("${client.levels[skill.id]}", color = meteor.ui.compose.Colors.secondaryColor, fontSize = 14.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
                }
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth().height((height.value.dp / 4) * 3).clip(RoundedCornerShape(4.dp)).align(Alignment.CenterVertically),
                    backgroundColor = meteor.ui.compose.Colors.surfaceDarkerColor,
                    progress = getLevelProgress(skill),
                    color = meteor.ui.compose.Colors.secondaryColor
                )
            }
        }
    }

    fun getLevelProgress(skill: Skill): Float {
        val currentLevelXP = getCurrentLevelXP(skill)
        val nextLevelXP = getNextLevelXP(skill)
        val delta = nextLevelXP - currentLevelXP
        var progress = (client.experience[skill.id] - currentLevelXP.toFloat()) / delta
        return progress
    }

    fun getCurrentLevelXP(skill: Skill): Int {
        if (client.levels[skill.id] == 1)
            return 0
        return client.levelExperience[client.levels[skill.id] - 2]
    }

    fun getNextLevelXP(skill: Skill): Int {
        return client.levelExperience[client.levels[skill.id] - 1]
    }

    fun Modifier.draggableComponent(onDrag: (change: Offset, dragAmount: Offset) -> Unit): Modifier = composed {
        pointerInput(Unit) {
            detectDragGestures { change, dragAmount ->
                onDrag(change.position, dragAmount)
            }
        }
    }
}