package com.jagex.game.client;

import deob.ObfuscatedName;

public class PrimitiveType {

    public static final PrimitiveType LINELIST = new PrimitiveType(5);

    public static final PrimitiveType LINESTRIP = new PrimitiveType(2);

    public static final PrimitiveType POINTLIST = new PrimitiveType(4);

    public static final PrimitiveType TRIANGLELIST = new PrimitiveType(1);

    public static final PrimitiveType TRIANGLEFAN = new PrimitiveType(3);

    public static final PrimitiveType TRIANGLESTRIP = new PrimitiveType(0);

    public final int index;

	public PrimitiveType(int index) {
		this.index = index;
	}
}
