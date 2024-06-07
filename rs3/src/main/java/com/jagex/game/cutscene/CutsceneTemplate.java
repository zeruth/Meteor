package com.jagex.game.cutscene;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public class CutsceneTemplate extends Node {

    public final int field11344;

    public final int field11337;

    public final int field11338;

    public final int field11339;

    public final int field11336;

    public final int field11341;

    public final int field11340;

    public final int field11343;

    public final int field11342;

	public CutsceneTemplate(Packet arg0) {
		int var2 = arg0.g4s();
		this.field11344 = var2 >>> 28;
		this.field11337 = var2 >>> 14 & 0x3FFF;
		this.field11338 = var2 & 0x3FFF;
		this.field11340 = arg0.g1();
		this.field11343 = arg0.g1();
		this.field11339 = arg0.g1();
		this.field11336 = arg0.g1();
		this.field11341 = arg0.g1();
		this.field11342 = arg0.g1();
	}
}
