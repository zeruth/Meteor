package com.jagex.game.config.defaults;

import com.jagex.game.client.KeyboardEvent;
import com.jagex.game.client.MouseEvent;
import com.jagex.game.shared.framework.input.Keyboard;


public interface Binding {

    boolean test(MouseEvent arg0, KeyboardEvent[] arg1, int arg2, Keyboard arg3);
}
