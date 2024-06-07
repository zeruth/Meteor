package com.jagex.game.load;

import com.jagex.core.io.Packet;


public class LoadingScreenClearConfig implements LoadingScreenElementConfig {

    public final int field3147;

	public LoadingScreenClearConfig(int arg0) {
		this.field3147 = arg0;
	}

    public static LoadingScreenClearConfig method17440(Packet arg0) {
		int var1 = arg0.g4s();
		return new LoadingScreenClearConfig(var1);
	}

    public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3190;
	}
}
