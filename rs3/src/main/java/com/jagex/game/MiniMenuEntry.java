package com.jagex.game;

import com.jagex.core.datastruct.SecondaryNode;
import deob.ObfuscatedName;

public class MiniMenuEntry extends SecondaryNode {

    public final String field12301;

    public final String field12297;

    public final boolean field12308;

    public final int field12298;

    public final int field12303;

    public final long field12300;

    public final int sceneBaseTileX;

    public final int sceneBaseTileZ;

    public final boolean field12299;

    public final long field12305;

    public final boolean field12306;

    public int menuAction;

    public String field12296;

	public MiniMenuEntry(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
		this.field12301 = arg1;
		this.field12297 = arg0;
		this.field12298 = arg2;
		this.menuAction = arg3;
		this.field12303 = arg4;
		this.field12300 = arg5;
		this.sceneBaseTileX = arg6;
		this.sceneBaseTileZ = arg7;
		this.field12308 = arg8;
		this.field12299 = arg9;
		this.field12305 = arg10;
		this.field12306 = arg11;
	}

    public long method19370() {
		return this.field12300;
	}

    public long method19368() {
		return this.field12305;
	}
}
