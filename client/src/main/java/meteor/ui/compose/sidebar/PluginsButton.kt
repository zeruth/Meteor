package meteor.ui.compose.sidebar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.CogSolid
import compose.icons.lineawesomeicons.PlugSolid
import compose.icons.lineawesomeicons.StarSolid
import meteor.config.Config
import meteor.config.ConfigItem
import meteor.config.ConfigManager
import meteor.plugin.Plugin
import meteor.plugin.PluginManager.plugins
import meteor.ui.compose.Colors
import meteor.ui.compose.config.ConfigPanelComposables
import java.lang.reflect.Method
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.declaredMembers
import kotlin.reflect.jvm.jvmName

class PluginsButton : SidebarButton(icon = LineAwesomeIcons.PlugSolid) {
    companion object {
        val runningMap = mutableStateMapOf<Plugin, Boolean>()
        val favoritesMap = mutableStateMapOf<Plugin, Boolean>()
        val switchStateMap = mutableStateMapOf<String, Boolean>()
    }
    override fun onClick() {
        ConfigPanelComposables.content.value = PluginList()
    }
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
                    favoritesMap.putIfAbsent(plugin, ConfigManager.get<Boolean>("plugin.${plugin.name}.isFavorite", false))
                    val isFavorite = favoritesMap[plugin]!!
                    if (isFavorite)
                        Image(LineAwesomeIcons.StarSolid,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Colors.secondary.value),
                            modifier = Modifier.align(Alignment.Center).clickable {
                                favoritesMap[plugin] = !favoritesMap[plugin]!!
                                ConfigManager.set("plugin.${plugin.name}.isFavorite", favoritesMap[plugin]!!)
                            })
                    else
                        Image(LineAwesomeIcons.StarSolid,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Colors.surfaceDark.value),
                            modifier = Modifier.align(Alignment.Center).clickable {
                                favoritesMap[plugin] = !favoritesMap[plugin]!!
                                ConfigManager.set("plugin.${plugin.name}.isFavorite", favoritesMap[plugin]!!)
                            })
                }
                Text(plugin.name, Modifier.align(Alignment.CenterVertically),
                    style = TextStyle(color = Colors.secondary.value, fontSize = 18.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Box(Modifier.padding(all = 2.dp).size(30.dp)) {
                    if (plugin.configuration != null) {
                        Image(LineAwesomeIcons.CogSolid,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Colors.secondary.value),
                            modifier = Modifier.align(Alignment.Center).clickable {
                                ConfigPanelComposables.secondaryContent.value = ConfigPanel(plugin.configuration!!)
                            })
                    }
                }
                runningMap.putIfAbsent(plugin, plugin.running)
                Switch(runningMap[plugin]!!,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    onCheckedChange = {
                        ConfigManager.set("plugin.${plugin.name}.enabled", !runningMap[plugin]!!)
                        if (plugin.running) {
                            plugin.stop()
                        }
                        else
                            plugin.start()},
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = Colors.surfaceDark.value,
                        checkedThumbColor = Colors.secondary.value)
                )
            }
        }
    }

    fun ConfigPanel(config: Config) = @Composable {
        Box(Modifier.fillMaxSize()) {
            Column(Modifier.fillMaxSize()) {
                for (item in config.items) {
                    when (item.defaultValue) {
                        is Boolean -> BooleanPanelNode(item as ConfigItem<Boolean>)
                    }
                    Spacer(Modifier.height(2.dp))
                }
            }
        }
    }

    @Composable
    fun BooleanPanelNode(config: ConfigItem<Boolean>) {
        switchStateMap.putIfAbsent(config.key, config.get())
        Box(Modifier.clip(RoundedCornerShape(8.dp)).background(Colors.surface.value).fillMaxWidth().height(30.dp)) {
            Row(Modifier.height(30.dp)) {
                Spacer(Modifier.width(5.dp))
                Text(config.name, Modifier.align(Alignment.CenterVertically),
                    style = TextStyle(color = Colors.secondary.value, fontSize = 18.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Switch(switchStateMap[config.key]!!,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    onCheckedChange = {
                        config.toggle()
                        switchStateMap[config.key] = config.get()
                    },
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = Colors.surfaceDark.value,
                        checkedThumbColor = Colors.secondary.value)
                )
            }
        }
    }
}