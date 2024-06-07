package com.jagex.game.client;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

public abstract class MouseEvent extends Node {

    public static boolean method15143(int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

    public abstract int getMouseClickX();

    public abstract int getMouseClickY();

    public abstract int getCount();

    public abstract long method17834();

    public abstract void release();

    public abstract int getButtonAction();
}
