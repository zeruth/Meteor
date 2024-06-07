package com.jagex.game.load;

import com.jagex.core.io.Packet;


public class LoadingScreenSpriteConfig implements LoadingScreenElementConfig {

    public final int field3218;

    public final LoadingScreenAlignmentX field3215;

    public final LoadingScreenAlignmentY field3214;

    public final int field3216;

    public final int field3217;

	public LoadingScreenSpriteConfig(int arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4) {
		this.field3218 = arg0;
		this.field3215 = arg1;
		this.field3214 = arg2;
		this.field3216 = arg3;
		this.field3217 = arg4;
	}

    public static LoadingScreenSpriteConfig method6073(Packet arg0) {
		int var1 = arg0.gSmart2or4null();
		LoadingScreenAlignmentX var2 = LoadingScreenAlignmentX.method13948()[arg0.g1()];
		LoadingScreenAlignmentY var3 = LoadingScreenAlignmentY.method2774()[arg0.g1()];
		int var4 = arg0.g2s();
		int var5 = arg0.g2s();
		return new LoadingScreenSpriteConfig(var1, var2, var3, var4, var5);
	}

    public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3194;
	}
}
