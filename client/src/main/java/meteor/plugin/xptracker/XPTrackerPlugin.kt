package meteor.plugin.xptracker

import meteor.Main
import meteor.events.Logout
import meteor.events.SkillUpdate
import meteor.events.client.ConfigChanged
import meteor.plugin.Plugin
import meteor.plugin.debug.DebugConfig
import meteor.plugin.debug.DebugViewportOverlay
import meteor.plugin.xptracker.XPTrackerOverlay.skillUpdates
import net.runelite.api.Skill

class XPTrackerPlugin : Plugin("XP Tracker", true) {
    val viewportOverlay = overlay(XPTrackerOverlay)
    var experience: IntArray? = null
    var levels: IntArray? = null
    var boostedLevels: IntArray? = null
    var lastExperience: IntArray = IntArray(50)

    override fun onStart() {

    }

    override fun onLogout(it: Logout) {
        lastExperience = IntArray(50)
    }

    override fun onSkillUpdate(it: SkillUpdate) {

        var ret = false
        if (experience == null) {
            experience = it.experience
            ret = true
        }
        experience?.let {
            for ((i, currentSkillXp) in experience!!.withIndex()) {
                val lastSkillXP = lastExperience[i]
                if (currentSkillXp > lastSkillXP) {
                    println("skill update")
                    skillUpdates[Skill.from(i)] = System.currentTimeMillis()
                }
                lastExperience[i] = currentSkillXp
            }
        }

        if (levels == null) {
            levels = it.levels
            ret = true
        }
        if (boostedLevels == null) {
            boostedLevels = it.boostedLevels
            ret = true
        }
    }
}