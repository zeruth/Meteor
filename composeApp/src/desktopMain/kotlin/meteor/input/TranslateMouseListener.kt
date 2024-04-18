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

import jagex2.client.Client
import meteor.Configuration
import meteor.Main
import meteor.ui.swing.PostProcessGamePanel.Companion.padding
import java.awt.Dimension
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

object TranslateMouseListener : MouseListener, MouseMotionListener {
    val client = Main.client
    override fun mouseClicked(mouseEvent: MouseEvent) {
        Main.client.mouseClicked(translateEvent(mouseEvent))
    }

    override fun mousePressed(mouseEvent: MouseEvent) {
        Main.client.mousePressed(translateEvent(mouseEvent))
    }

    override fun mouseReleased(mouseEvent: MouseEvent) {
        Main.client.mouseReleased(translateEvent(mouseEvent))
    }

    override fun mouseEntered(mouseEvent: MouseEvent) {
        Main.client.mouseEntered(translateEvent(mouseEvent))
    }

    override fun mouseExited(mouseEvent: MouseEvent) {
        Main.client.mouseExited(translateEvent(mouseEvent))
    }

    override fun mouseDragged(mouseEvent: MouseEvent) {
        Main.client.mouseDragged(translateEvent(mouseEvent))
    }

    override fun mouseMoved(mouseEvent: MouseEvent) {
        Main.client.mouseMoved(translateEvent(mouseEvent))
    }

    private fun translateEvent(e: MouseEvent): MouseEvent {
        val x = e.x - padding
        val stretchedDimensions = Dimension(Main.gamePanel.width, Main.gamePanel.height)
        val modX: Float = (stretchedDimensions.width.toFloat() / Client.gamePanel.width)
        val modY: Float = (stretchedDimensions.height.toFloat() / 531)
        var newX = (x.toFloat() / modX);
        if (!Configuration.STRETCH_TO_FILL)
            newX = (x.toFloat() / modY);
        val newY = (e.y.toFloat() / modY);
        val mouseEvent = MouseEvent(
            client, e.id, e.getWhen(),
            e.modifiersEx,
            newX.toInt(), newY.toInt(), e.clickCount, e.isPopupTrigger, e.button
        )
        if (e.isConsumed) {
            mouseEvent.consume()
        }
        return mouseEvent
    }
}