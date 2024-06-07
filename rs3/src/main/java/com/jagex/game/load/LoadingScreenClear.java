package com.jagex.game.load;

import com.jagex.game.client.GameShell;

import rs2.client.Client;

public class LoadingScreenClear implements LoadingScreenElement {

    public final LoadingScreenClearConfig field3048;

	public LoadingScreenClear(LoadingScreenClearConfig arg0) {
		this.field3048 = arg0;
	}

    public void method5105(boolean arg0) {
		if (arg0) {
			Client.toolkit.fillRectangle(0, 0, GameShell.canvasWid, GameShell.canvasHei, this.field3048.field3147, 0);
		}
	}

    public void method5104() {
	}

    public boolean method5106() {
		return true;
	}
}
