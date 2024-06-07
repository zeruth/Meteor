package com.jagex.game.shared.framework.input;

import com.jagex.game.client.BasicMouseEvent;
import com.jagex.game.client.JavaMouse;
import com.jagex.game.client.MouseEvent;


public abstract class Mouse {

    public static Mouse create(java.awt.Component arg0, boolean arg1) {
		return new JavaMouse(arg0, arg1);
	}

    public static void method7232(int arg0) {
		BasicMouseEvent.method14915(arg0);
	}

    public boolean method9090() {
		return this.method9101() || this.method9121() || this.method9125();
	}

    public abstract int getX();

    public abstract void method9087();

    public abstract int getY();

    public abstract MouseEvent pollEvent();

    public abstract boolean method9101();

    public abstract void unbind();

    public abstract boolean method9121();

    public abstract boolean method9125();
}
