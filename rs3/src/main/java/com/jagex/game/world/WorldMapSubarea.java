package com.jagex.game.world;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

public class WorldMapSubarea extends Node {

    public int field11458;

    public int field11453;

    public int field11454;

    public int field11455;

    public int field11457;

    public int field11456;

    public int field11459;

    public int field11460;

    public int field11461;

	public WorldMapSubarea(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		this.field11458 = arg0;
		this.field11453 = arg1;
		this.field11454 = arg2;
		this.field11455 = arg3;
		this.field11457 = arg4;
		this.field11456 = arg5;
		this.field11459 = arg6;
		this.field11460 = arg7;
		this.field11461 = arg8;
	}

    public boolean method17818(int arg0, int arg1) {
		return arg0 >= this.field11453 && arg0 <= this.field11455 && arg1 >= this.field11454 && arg1 <= this.field11457;
	}

    public boolean method17815(int arg0, int arg1, int arg2) {
		return arg0 >= this.field11458 && arg1 >= this.field11453 && arg1 <= this.field11455 && arg2 >= this.field11454 && arg2 <= this.field11457;
	}

    public boolean method17814(int arg0, int arg1) {
		return arg0 >= this.field11456 && arg0 <= this.field11460 && arg1 >= this.field11459 && arg1 <= this.field11461;
	}

    public void method17812(int arg0, int arg1, int[] arg2) {
		arg2[0] = this.field11458;
		arg2[1] = this.field11453 - this.field11456 + arg0;
		arg2[2] = this.field11454 - this.field11459 + arg1;
	}

    public void method17816(int arg0, int arg1, int[] arg2) {
		arg2[0] = 0;
		arg2[1] = this.field11456 - this.field11453 + arg0;
		arg2[2] = this.field11459 - this.field11454 + arg1;
	}
}
