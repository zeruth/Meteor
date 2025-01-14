package meteor.plugin.meteor

import meteor.events.ConfigChanged
import meteor.plugin.Plugin
import meteor.ui.Colors
import meteor.ui.GameView

class MeteorPlugin : Plugin("Meteor", cantDisable = true, enabledByDefault = true) {
    val config = configuration<MeteorConfig>()
    override fun onStart() {
        Colors.secondary.value = config.uiColor.get<UIColor>().color
        GameView.filterQuality.value = config.filterQuality.get()
    }

    override fun onConfigChanged(it: ConfigChanged) {
        if (it.affects(config)) {
            if (it.item == config.filterQuality) {
                GameView.filterQuality.value = config.filterQuality.get<FilterQuality>()
            }
            if (it.item == config.uiColor) {
                Colors.secondary.value = config.uiColor.get<UIColor>().color
            }
        }
    }
}