package com.jagex.graphics;

import com.jagex.game.world.entity.Scene;
import deob.ObfuscatedName;

public class Occluder {

    public final byte type;

    public final byte level;

    public final short minTileX;

    public final short maxTileX;

    public final short minTileZ;

    public final short maxTileZ;

    public final int[] x;

    public final int[] y;

    public final int[] z;

    public final short[] field7063;

    public final short[] field7076;

    public final short[] field7077;

	public Occluder(Scene arg0, int type, int level, int minX, int arg4, int maxX, int arg6, int minY, int arg8, int maxY, int arg10, int minZ, int arg12, int maxZ, int arg14) {
		this.type = (byte) type;
		this.level = (byte) level;
		this.x = new int[4];
		this.y = new int[4];
		this.z = new int[4];
		this.x[0] = minX;
		this.x[1] = arg4;
		this.x[2] = maxX;
		this.x[3] = arg6;
		this.y[0] = minY;
		this.y[1] = arg8;
		this.y[2] = maxY;
		this.y[3] = arg10;
		this.z[0] = minZ;
		this.z[1] = arg12;
		this.z[2] = maxZ;
		this.z[3] = arg14;
		this.minTileX = (short) (minX >> arg0.size);
		this.maxTileX = (short) (maxX >> arg0.size);
		this.minTileZ = (short) (minZ >> arg0.size);
		this.maxTileZ = (short) (maxZ >> arg0.size);
		this.field7063 = new short[4];
		this.field7076 = new short[4];
		this.field7077 = new short[4];
	}
}
