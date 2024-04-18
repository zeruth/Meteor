package meteor.input

import meteor.Main
import java.awt.event.KeyEvent
import java.awt.event.KeyListener

object KeyListener : KeyListener {
    override fun keyTyped(e: KeyEvent?) {
        Main.client.keyTyped(e)
    }

    override fun keyPressed(e: KeyEvent) {
        Main.client.keyPressed(e)
    }

    override fun keyReleased(e: KeyEvent?) {
        Main.client.keyReleased(e)
    }
}