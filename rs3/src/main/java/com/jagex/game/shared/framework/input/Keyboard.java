package com.jagex.game.shared.framework.input;

import com.jagex.game.client.JavaKeyboard;
import com.jagex.game.client.KeyboardEvent;


public abstract class Keyboard {

    public static Keyboard create(java.awt.Component arg0) {
		return new JavaKeyboard(arg0);
	}

    public abstract void method9069();

    public abstract void unbind();

    public abstract KeyboardEvent method9075();

    public abstract boolean keyheld(int arg0);
}
