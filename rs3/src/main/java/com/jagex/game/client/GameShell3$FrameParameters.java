package com.jagex.game.client;

import deob.ObfuscatedName;

public class GameShell3$FrameParameters {

    public int width;

    public int height;

    public int xMargin;

    public int yMargin;

    public String title;

	public GameShell3$FrameParameters(int arg0, int arg1, int arg2, int arg3, String arg4) {
		this.width = arg0;
		this.height = arg1;
		this.xMargin = arg2;
		this.yMargin = arg3;
		this.title = arg4;
	}

    public int getWidth() {
		return this.width;
	}

    public int getHeight() {
		return this.height;
	}

    public int getXMargin() {
		return this.xMargin;
	}

    public int getYMargin() {
		return this.yMargin;
	}

    public String getTitle() {
		return this.title;
	}
}
