package meteor.input

import meteor.Main
import net.runelite.rs.api.RSGameShell
import java.awt.event.KeyEvent
import java.awt.event.KeyListener

object KeyListener : KeyListener {
    val client = Main.client as RSGameShell

    override fun keyTyped(e: KeyEvent?) {
        client.keyTyped(e)
    }

    override fun keyPressed(e: KeyEvent) {
        client.keyPressed(e)
    }

    override fun keyReleased(e: KeyEvent?) {
        client.keyReleased(e)
    }
}