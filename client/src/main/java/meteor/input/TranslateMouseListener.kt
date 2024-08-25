/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package meteor.input

import meteor.Constants.RS_DIMENSIONS
import meteor.Main
import meteor.ui.config.AspectMode
import net.runelite.rs.api.RSGameShell
import java.applet.Applet
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

object TranslateMouseListener : MouseListener, MouseMotionListener {
    val client = (Main.client as RSGameShell)
    override fun mouseClicked(mouseEvent: MouseEvent) {
        client.mouseClicked(translateEvent(mouseEvent))
    }

    override fun mousePressed(mouseEvent: MouseEvent) {
        client.mousePressed(translateEvent(mouseEvent))
    }

    override fun mouseReleased(mouseEvent: MouseEvent) {
        client.mouseReleased(translateEvent(mouseEvent))
    }

    override fun mouseEntered(mouseEvent: MouseEvent) {
        client.mouseEntered(translateEvent(mouseEvent))
    }

    override fun mouseExited(mouseEvent: MouseEvent) {
        client.mouseExited(translateEvent(mouseEvent))
    }

    override fun mouseDragged(mouseEvent: MouseEvent) {
        client.mouseDragged(translateEvent(mouseEvent))
    }

    override fun mouseMoved(mouseEvent: MouseEvent) {
        client.mouseMoved(translateEvent(mouseEvent))
    }

    private fun translateEvent(e: MouseEvent): MouseEvent {
        val xPadding = Main.client.xPadding
        val yPadding = Main.client.yPadding
        val x = e.x - xPadding
        val y = e.y - yPadding
        val fitScaling = if (xPadding > yPadding) (Main.gamePanel.height.toFloat() / RS_DIMENSIONS.height) else (Main.gamePanel.width.toFloat() / RS_DIMENSIONS.width)

        val modY = if (Main.windowState.value == Main.fixedState) {
            1f
        } else {
            when (Main.client.aspectMode) {
                AspectMode.FIT -> fitScaling
                AspectMode.FILL -> (Main.gamePanel.height.toFloat() / Main.client.gamePanel.height)
                else -> 1f
            }
        }
        val modX = if (Main.windowState.value == Main.fixedState) {
            1f
        } else {
            when (Main.client.aspectMode) {
                AspectMode.FIT -> fitScaling
                AspectMode.FILL -> (Main.gamePanel.width.toFloat() / Main.client.gamePanel.width)
                else -> 1f
            }
        }
        var newX = x / modX
        var newY = y / modY
        if (Main.client.aspectMode == AspectMode.FIT) {
            if (xPadding > yPadding)
                newY = y / modX
            else
                newX = x / modY
        }

        val mouseEvent = MouseEvent(
            client as Applet, e.id, e.getWhen(),
            e.modifiersEx,
            newX.toInt(), newY.toInt(), e.clickCount, e.isPopupTrigger, e.button
        )
        if (e.isConsumed) {
            mouseEvent.consume()
        }
        return mouseEvent
    }
}