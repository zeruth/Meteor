package com.jagex.game;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelUnlit;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;
import rs2.client.Client;

public class HintArrow {

    public int hintType;

    public int field751;

    public int field744;

    public int field749;

    public int hintOffsetX;

    public int hintOffsetZ;

    public int field742;

    public int field750 = -1;

    public int field748;

    public int field743;

    public static SoftLruHashTable modelCache = new SoftLruHashTable(4);

    public static int field753;

    public static Model method5210(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = (long) arg5;
		Model var8 = (Model) modelCache.get(var6);
		short var9 = 2055;
		if (var8 == null) {
			ModelUnlit var10 = ModelUnlit.get(Client.modelsJs5, arg5, 0);
			if (var10 == null) {
				return null;
			}
			if (var10.version < 13) {
				var10.scaleByPowerOfTwo(2);
			}
			var8 = arg0.createModel(var10, var9, field753, 64, 768);
			modelCache.put(var8, var6);
		}
		Model var11 = var8.method1773((byte) 6, var9, true);
		if (arg1 != 0) {
			var11.method1693(arg1);
		}
		if (arg2 != 0) {
			var11.rotateX(arg2);
		}
		if (arg3 != 0) {
			var11.rotateZ(arg3);
		}
		if (arg4 != 0) {
			var11.translate(0, arg4, 0);
		}
		return var11;
	}

    public static void resetModelCache(int arg0) {
		field753 = arg0;
		modelCache.reset();
	}

    public static void cacheReset() {
		modelCache.reset();
	}

    public static void cacheClean(int arg0) {
		modelCache.clean(arg0);
	}

    public static void cacheRemoveSoftReferences() {
		modelCache.clear();
	}
}
