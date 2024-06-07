package com.jagex.game.client;

import com.jagex.core.datastruct.CacheKey;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public class IconCacheKey implements CacheKey {

    public int field8607;

    public int field8602;

    public int field8604;

    public int field8605;

    public int field8606;

    public int field8603;

    public boolean field8608;

    public long hash() {
		long[] var1 = Packet.crc64table;
		long var2 = -1L;
		long var4 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) this.field8607) & 0xFFL)];
		long var6 = var4 >>> 8 ^ var1[(int) ((var4 ^ (long) (this.field8602 >> 8)) & 0xFFL)];
		long var8 = var6 >>> 8 ^ var1[(int) ((var6 ^ (long) this.field8602) & 0xFFL)];
		long var10 = var8 >>> 8 ^ var1[(int) ((var8 ^ (long) (this.field8604 >> 24)) & 0xFFL)];
		long var12 = var10 >>> 8 ^ var1[(int) ((var10 ^ (long) (this.field8604 >> 16)) & 0xFFL)];
		long var14 = var12 >>> 8 ^ var1[(int) ((var12 ^ (long) (this.field8604 >> 8)) & 0xFFL)];
		long var16 = var14 >>> 8 ^ var1[(int) ((var14 ^ (long) this.field8604) & 0xFFL)];
		long var18 = var16 >>> 8 ^ var1[(int) ((var16 ^ (long) this.field8605) & 0xFFL)];
		long var20 = var18 >>> 8 ^ var1[(int) ((var18 ^ (long) (this.field8606 >> 24)) & 0xFFL)];
		long var22 = var20 >>> 8 ^ var1[(int) ((var20 ^ (long) (this.field8606 >> 16)) & 0xFFL)];
		long var24 = var22 >>> 8 ^ var1[(int) ((var22 ^ (long) (this.field8606 >> 8)) & 0xFFL)];
		long var26 = var24 >>> 8 ^ var1[(int) ((var24 ^ (long) this.field8606) & 0xFFL)];
		long var28 = var26 >>> 8 ^ var1[(int) ((var26 ^ (long) this.field8603) & 0xFFL)];
		return var28 >>> 8 ^ var1[(int) ((var28 ^ (long) (this.field8608 ? 1 : 0)) & 0xFFL)];
	}

    public boolean equal(CacheKey arg0) {
		if (!(arg0 instanceof IconCacheKey)) {
			return false;
		}
		IconCacheKey var2 = (IconCacheKey) arg0;
		if (this.field8607 != var2.field8607) {
			return false;
		} else if (this.field8602 != var2.field8602) {
			return false;
		} else if (this.field8604 != var2.field8604) {
			return false;
		} else if (this.field8605 != var2.field8605) {
			return false;
		} else if (this.field8606 != var2.field8606) {
			return false;
		} else if (this.field8603 == var2.field8603) {
			return this.field8608 == var2.field8608;
		} else {
			return false;
		}
	}
}
