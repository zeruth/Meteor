package com.jagex.game.client;

import deob.ObfuscatedName;

import java.awt.*;

public final class GameCanvas extends Canvas {

    public java.awt.Component field12487;

	public GameCanvas(java.awt.Component arg0) {
		this.field12487 = arg0;
	}

	public final void update(Graphics arg0) {
		this.field12487.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.field12487.paint(arg0);
	}
}
