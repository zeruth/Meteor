package meteor.ui.compose.components.plugins

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.CogSolid
import compose.icons.lineawesomeicons.StarSolid
import meteor.config.ConfigManager
import meteor.plugin.Plugin
import meteor.plugin.PluginManager.plugins
import meteor.ui.compose.Colors
import meteor.ui.compose.components.config.ConfigComposables.ConfigPanel
import meteor.ui.compose.components.panel.PanelComposables
import meteor.ui.compose.components.plugins.PluginsButton.Companion.favoritesMap
import meteor.ui.compose.components.plugins.PluginsButton.Companion.runningMap

object PluginsComposables {

    fun PluginList() = @Composable {
        Column(Modifier.fillMaxSize()) {
            for (plugin in plugins.sortedByDescending { favoritesMap[it] }) {
                PluginNode(plugin)
                Spacer(Modifier.height(2.dp))
            }
        }
    }

    @Composable
    fun PluginNode(plugin: Plugin) {
        Box(Modifier.clip(RoundedCornerShape(8.dp)).background(Colors.surface.value).fillMaxWidth().height(30.dp)) {
            Row(Modifier.fillMaxSize()) {
                Box(Modifier.padding(all = 2.dp).size(30.dp)) {
                    favoritesMap.putIfAbsent(
                        plugin,
                        ConfigManager.get<Boolean>("plugin.${plugin.name}.isFavorite", false)
                    )
                    val isFavorite = favoritesMap[plugin]!!
                    if (isFavorite)
                        Image(
                            LineAwesomeIcons.StarSolid,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Colors.secondary.value),
                            modifier = Modifier.align(Alignment.Center).clickable {
                                favoritesMap[plugin] = !favoritesMap[plugin]!!
                                ConfigManager.set("plugin.${plugin.name}.isFavorite", favoritesMap[plugin]!!)
                            })
                    else
                        Image(
                            LineAwesomeIcons.StarSolid,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Colors.surfaceDark.value),
                            modifier = Modifier.align(Alignment.Center).clickable {
                                favoritesMap[plugin] = !favoritesMap[plugin]!!
                                ConfigManager.set("plugin.${plugin.name}.isFavorite", favoritesMap[plugin]!!)
                            })
                }
                Text(
                    plugin.name, Modifier.align(Alignment.CenterVertically),
                    style = TextStyle(color = Colors.secondary.value, fontSize = 18.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Box(Modifier.padding(all = 2.dp).size(30.dp)) {
                    if (plugin.configuration != null) {
                        Image(
                            LineAwesomeIcons.CogSolid,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Colors.secondary.value),
                            modifier = Modifier.align(Alignment.Center).clickable {
                                PanelComposables.secondaryContent.value = ConfigPanel(plugin.configuration!!)
                            })
                    }
                }
                runningMap.putIfAbsent(plugin, plugin.running)
                Switch(
                    runningMap[plugin]!!,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    onCheckedChange = {
                        ConfigManager.set("plugin.${plugin.name}.enabled", !runningMap[plugin]!!)
                        if (plugin.running) {
                            plugin.stop()
                        } else
                            plugin.start()
                    },
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = Colors.surfaceDark.value,
                        checkedThumbColor = Colors.secondary.value
                    )
                )
            }
        }
    }
}