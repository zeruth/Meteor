package meteor.plugin.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import compose.icons.LineAwesomeIcons
import meteor.ui.compose.Colors

class World(val id: Int, val region: String, val address: String, val portOffset: Int, val members: Boolean) {
    companion object {
        val worlds = ArrayList<World>()
        init {
            worlds.add(World(1, "United States", "https://w1.225.2004scape.org", 0, false))
            worlds.add(World(2, "United States", "https://w2.225.2004scape.org", 3, true))
            worlds.add(World(3, "Germany", "https://w3.225.2004scape.org:8443", 0, false))
            worlds.add(World(4, "Germany", "https://w4.225.2004scape.org:8443", 3, true))
            worlds.add(World(5, "Australia", "https://aus1.2004scape.org", 0, false))
            worlds.add(World(6, "Australia", "https://aus2.2004scape.org", 3, true))
            worlds.add(World(7, "Japan", "https://jp1.2004scape.org", 0, false))
            worlds.add(World(8, "Japan", "https://jp2.2004scape.org", 3, true))
        }

        fun World.getFlag(): String {
            if (this.region == "United States") {
                return "flags/us.png"
            }
            if (this.region == "Germany") {
                return "flags/de.png"
            }
            if (this.region == "Australia") {
                return "flags/au.png"
            }
            if (this.region == "Japan") {
                return "flags/jp.png"
            }
            return "null"
        }
    }
}