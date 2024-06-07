package com.jagex.game.load;

import com.jagex.game.client.GameShell;
import deob.ObfuscatedName;

public class LoadingScreenAlignmentX {

    public static final LoadingScreenAlignmentX field3186 = new LoadingScreenAlignmentX();

    public static final LoadingScreenAlignmentX field3184 = new LoadingScreenAlignmentX();

    public static final LoadingScreenAlignmentX field3185 = new LoadingScreenAlignmentX();

    public static LoadingScreenAlignmentX[] method13948() {
		return new LoadingScreenAlignmentX[] { field3186, field3184, field3185 };
	}

    public int computeX(int arg0, int arg1) {
		int var3 = GameShell.canvasWid > arg1 ? GameShell.canvasWid : arg1;
		if (field3186 == this) {
			return 0;
		} else if (field3185 == this) {
			return var3 - arg0;
		} else if (field3184 == this) {
			return (var3 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
