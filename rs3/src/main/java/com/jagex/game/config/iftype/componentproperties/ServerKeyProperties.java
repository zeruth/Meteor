package com.jagex.game.config.iftype.componentproperties;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

public final class ServerKeyProperties extends Node {

    public static final ServerKeyProperties field11386 = new ServerKeyProperties(0, -1);

    public final int field11385;

    public final int field11381;

	public ServerKeyProperties(int arg0, int arg1) {
		this.field11385 = arg0;
		this.field11381 = arg1;
	}

    public final boolean method17689() {
		return (this.field11385 & 0x1) != 0;
	}

    public final boolean method17690(int arg0) {
		return (this.field11385 >> arg0 + 1 & 0x1) != 0;
	}

    public final int method17691() {
		return method16667(this.field11385);
	}

    public static final int method16667(int arg0) {
		return arg0 >> 11 & 0x7F;
	}

    public final int method17710() {
		return this.field11385 >> 18 & 0x7;
	}

    public final boolean method17693() {
		return (this.field11385 >> 21 & 0x1) != 0;
	}

    public final boolean method17708() {
		return (this.field11385 >> 22 & 0x1) != 0;
	}

    public final boolean method17701() {
		return (this.field11385 >> 23 & 0x1) != 0;
	}
}
