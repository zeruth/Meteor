package meteor.ui.compose.components.config

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import meteor.config.Config
import meteor.config.ConfigItem
import meteor.ui.compose.Colors
import meteor.ui.compose.components.plugins.PluginsButton.Companion.switchStateMap

object ConfigComposables {
    fun ConfigPanel(config: Config) = @Composable {
        Box(Modifier.fillMaxSize()) {
            Column(Modifier.fillMaxSize()) {
                for (item in config.items) {
                    when (item.defaultValue) {
                        is Boolean -> ConfigNode { BooleanPanelNode(item as ConfigItem<Boolean>).invoke(this) }
                    }
                    Spacer(Modifier.height(2.dp))
                }
            }
        }
    }

    @Composable
    fun ConfigNode(height: Int = 30, content: @Composable RowScope.() -> Unit) {
        Box(Modifier.clip(RoundedCornerShape(8.dp)).background(Colors.surface.value).fillMaxWidth().height(height.dp)) {
            Row(Modifier.height(height.dp)) {
                content.invoke(this)
            }
        }
    }

    fun BooleanPanelNode(config: ConfigItem<Boolean>) : @Composable RowScope.() -> Unit = @Composable {
        switchStateMap.putIfAbsent(config.key, config.get())

        Spacer(Modifier.width(5.dp))
        Text(
            config.name, Modifier.align(Alignment.CenterVertically),
            style = TextStyle(color = Colors.secondary.value, fontSize = 18.sp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Switch(
            switchStateMap[config.key]!!,
            modifier = Modifier.align(Alignment.CenterVertically),
            onCheckedChange = {
                config.toggle()
                switchStateMap[config.key] = config.get()
            },
            colors = SwitchDefaults.colors(
                uncheckedThumbColor = Colors.surfaceDark.value,
                checkedThumbColor = Colors.secondary.value
            )
        )
    }
}