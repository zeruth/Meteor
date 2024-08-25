package meteor.plugin.infobars

import meteor.events.Logout
import meteor.events.SkillUpdate
import meteor.plugin.Plugin
import net.runelite.api.Skill

class InfoBarsPlugin : Plugin("Info Bars", true) {
    val config = configuration<InfoBarsConfig>()
    val viewportOverlay = overlay(InfoBarsOverlay(this))
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
                var skipUpdate = false
                if (currentSkillXp > lastSkillXP) {
                    if (lastSkillXP == 0) {
                        if (config.ignoreFirstUpdate.get<Boolean>())
                            skipUpdate = true
                    }
                    if (!skipUpdate)
                        viewportOverlay.skillUpdates[Skill.from(i)] = System.currentTimeMillis()
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