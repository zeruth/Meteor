package meteor.plugin.infobars

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
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
class InfoBarsOverlay(val plugin: InfoBarsPlugin) : ViewportOverlay() {
    var height = mutableStateOf(20)
    var width = mutableStateOf(150)
    var skillUpdates = Collections.synchronizedMap(HashMap<Skill, Long>())
    var textColumnWidth = 28.dp

    /*    var skillIcons = HashMap<Skill, Image>()

        init {
            for (skill in Skill.values()) {
                skillIcons[skill] = ImageUtil.resizeCanvas(ImageUtil.resizeImage(SkillIconManager.getSkillImage(skill, true), IMAGE_SIZE, IMAGE_SIZE), ICON_DIMENSIONS.width, ICON_DIMENSIONS.height)
                skillXPBars[skill] = getSkilXOBar(skill)
            }
        }*/
    override fun render(): @Composable BoxScope.() -> Unit = {
        if (client.isLoggedIn) {
            var offsetX by remember { mutableStateOf(0f) }
            var offsetY by remember { mutableStateOf(0f) }
            if (client.viewportInterfaceID == -1 || (client.viewportInterfaceID != -1 && !plugin.config.hideWhenInterfaceOpen.get<Boolean>()))
                Box(modifier = Modifier.offset { IntOffset(offsetX.toInt(), offsetY.toInt()) }.clip(RoundedCornerShape(4.dp)).background(meteor.ui.compose.Colors.surface.value).align(Alignment.TopEnd).draggableComponent { change, dragAmount ->
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

                            renderHitpointsBox().invoke(this@Box)
                            renderPrayerBox().invoke(this@Box)
                            renderEnergyBox().invoke(this@Box)

                            if (skillUpdates.isNotEmpty()) {
                                Spacer(modifier = Modifier.height(5.dp))
                                Divider(thickness = 1.dp, color = Color.Black, modifier = Modifier.width(width.value.dp))
                                Spacer(modifier = Modifier.height(5.dp))
                                for (skill in skillUpdates.keys) {
                                    renderSkillBox(skill).invoke(this@Box)
                                }
                            }
                        }
                    }
                }
        }
    }

    fun renderSkillBox(skill: Skill): @Composable BoxScope.() -> Unit = {
        var offsetX by remember { mutableStateOf(0f) }
        var offsetY by remember { mutableStateOf(0f) }

        Box(modifier = Modifier.width(width.value.dp).height(height.value.dp).clip(RoundedCornerShape(4.dp)).background(meteor.ui.compose.Colors.surfaceDark.value)) {
            Row {
                Image(painterResource(skill.smallIconResource()), "${skill.name}-icon", modifier = Modifier.size(height.value.dp))
                Column(modifier = Modifier.size(textColumnWidth)) {
                    Text("${client.levels[skill.id]}", color = Color.White, fontSize = 14.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
                }
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth().height((height.value.dp / 4) * 3).clip(RoundedCornerShape(4.dp)).align(Alignment.CenterVertically),
                    backgroundColor = meteor.ui.compose.Colors.surfaceDarker.value,
                    progress = getLevelProgress(skill),
                    color = meteor.ui.compose.Colors.secondary.value
                )
            }
        }
    }

    fun renderHitpointsBox(): @Composable BoxScope.() -> Unit = {
        var offsetX by remember { mutableStateOf(0f) }
        var offsetY by remember { mutableStateOf(0f) }

        Box(modifier = Modifier.width(width.value.dp).height(height.value.dp).clip(RoundedCornerShape(4.dp)).background(meteor.ui.compose.Colors.surfaceDarkColor)) {
            Row {
                Image(painterResource(Skill.HITPOINTS.smallIconResource()), "hitpoints-icon", modifier = Modifier.size(height.value.dp))
                Column(modifier = Modifier.size(textColumnWidth)) {
                    Text("${client.boostedLevels[Skill.HITPOINTS.id]}", color = Color.White, fontSize = 14.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
                }
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth().height((height.value.dp / 4) * 3).clip(RoundedCornerShape(4.dp)).align(Alignment.CenterVertically),
                    backgroundColor = meteor.ui.compose.Colors.surfaceDarkerColor,
                    progress = client.boostedLevels[Skill.HITPOINTS.id].toFloat() / client.levels[Skill.HITPOINTS.id].toFloat(),
                    color = Color.Red
                )
            }
        }
    }

    fun renderPrayerBox(): @Composable BoxScope.() -> Unit = {
        var offsetX by remember { mutableStateOf(0f) }
        var offsetY by remember { mutableStateOf(0f) }

        Box(modifier = Modifier.width(width.value.dp).height(height.value.dp).clip(RoundedCornerShape(4.dp)).background(meteor.ui.compose.Colors.surfaceDarkColor)) {
            Row {
                Image(painterResource(Skill.PRAYER.smallIconResource()), "prayer-icon", modifier = Modifier.size(height.value.dp))
                Column(modifier = Modifier.size(textColumnWidth)) {
                    Text("${client.boostedLevels[Skill.PRAYER.id]}", color = Color.White, fontSize = 14.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
                }
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth().height((height.value.dp / 4) * 3).clip(RoundedCornerShape(4.dp)).align(Alignment.CenterVertically),
                    backgroundColor = meteor.ui.compose.Colors.surfaceDarkerColor,
                    progress = client.boostedLevels[Skill.PRAYER.id].toFloat() / client.levels[Skill.PRAYER.id].toFloat(),
                    color = Color.Cyan
                )
            }
        }
    }

    fun renderEnergyBox(): @Composable BoxScope.() -> Unit = {
        var offsetX by remember { mutableStateOf(0f) }
        var offsetY by remember { mutableStateOf(0f) }

        Box(modifier = Modifier.width(width.value.dp).height(height.value.dp).clip(RoundedCornerShape(4.dp)).background(meteor.ui.compose.Colors.surfaceDarkColor)) {
            Row {
                Image(painterResource("skill_icons_small/agility.png"), "agility-icon", modifier = Modifier.size(height.value.dp))
                Column(modifier = Modifier.size(textColumnWidth)) {
                    Text("${client.energy}", color = Color.White, fontSize = 14.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
                }
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth().height((height.value.dp / 4) * 3).clip(RoundedCornerShape(4.dp)).align(Alignment.CenterVertically),
                    backgroundColor = meteor.ui.compose.Colors.surfaceDarkerColor,
                    progress = client.energy / 100f,
                    color = Color.Yellow
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