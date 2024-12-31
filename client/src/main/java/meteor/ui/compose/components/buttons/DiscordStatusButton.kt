package meteor.ui.compose.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.CompressArrowsAltSolid
import compose.icons.lineawesomeicons.Discord
import compose.icons.lineawesomeicons.ExpandArrowsAltSolid
import compose.icons.lineawesomeicons.WindowCloseSolid
import meteor.DiscordPresence
import meteor.Main
import meteor.Main.fixedState
import meteor.Main.fullscreenState
import meteor.Main.updatingDiscordState
import meteor.Main.version
import meteor.Main.windowState
import meteor.config.ConfigManager
import meteor.ui.compose.Colors
import meteor.ui.compose.components.sidebar.SidebarButton
import kotlin.system.exitProcess

class DiscordStatusButton : SidebarButton(
    icon = LineAwesomeIcons.Discord,
    actionButton = true) {

    companion object {
        var state = mutableStateOf("")

        @Composable
        fun showDiscordStatusWindow() {
            val focusRequester = remember { FocusRequester() }
            state.value = ConfigManager.get<String>("DiscordRPCStatus", "")
            Window(onCloseRequest = { updatingDiscordState.value = false },
                title = "Update Discord status",
                state = WindowState(placement = WindowPlacement.Floating, position = WindowPosition.Aligned(Alignment.Center), size = DpSize(800.dp, 150.dp)),
                undecorated = false,
                resizable = false,
                alwaysOnTop = true,
                icon = painterResource("Meteor.ico")
            ) {
                Box(Modifier.fillMaxSize().background(Colors.surfaceColor)) {
                    Row(Modifier.fillMaxSize()) {
                        Column(Modifier.fillMaxSize()) {
                            TextField(state.value, {
                                state.value = it
                            }, maxLines = 1, modifier = Modifier.fillMaxWidth().height(60.dp).focusRequester(focusRequester), colors = TextFieldDefaults.textFieldColors(textColor = Colors.secondary.value, cursorColor = Colors.secondary.value, focusedIndicatorColor = Colors.secondary.value), keyboardActions = KeyboardActions(
                                onDone = {
                                    confirm()
                                }
                            ),  keyboardOptions = KeyboardOptions.Default.copy(
                                imeAction = ImeAction.Done
                            ))
                            Button(onClick = {
                                confirm()
                            }, colors = ButtonDefaults.buttonColors(backgroundColor = Colors.secondary.value),
                                modifier = Modifier.align(Alignment.CenterHorizontally)) {
                                Text("Confirm", color = Color.Black)
                            }
                        }
                    }
                }

                LaunchedEffect(Unit) {
                    focusRequester.requestFocus()
                }
            }
        }

        fun confirm() {
            updatingDiscordState.value = false
            sendUpdate()
        }

        fun sendUpdate() {
            DiscordPresence.update(state.value)
            ConfigManager.set("DiscordRPCStatus", state.value)
        }
    }

    override fun onClick() {
        updatingDiscordState.value = !updatingDiscordState.value
    }
}