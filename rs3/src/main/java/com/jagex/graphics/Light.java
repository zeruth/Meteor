package com.jagex.graphics;

import com.jagex.core.datastruct.Node;
import com.jagex.core.utils.ColourUtils;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.math.Vector3;


public class Light extends Node {

    public Vector3 field11331 = new Vector3();

    public int field11321;

    public int field11322;

    public float field11323;

    public int field11332;

    public int field11334;

    public int field11326;

    public int field11327;

    public long field11328;

    public int field11335;

    public float field11330;

    public float field11325;

    public float field11329;

    public int field11333;

    public long field11324;

    public int field11320;

	public Light(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		this.field11331.setTo((float) arg0, (float) arg1, (float) arg2);
		this.field11321 = arg3;
		this.field11322 = arg4;
		this.field11326 = this.field11322;
		this.field11334 = this.field11322;
		this.field11332 = this.field11322;
		this.field11323 = arg5;
		this.field11329 = 1.0F;
		this.field11325 = 1.0F;
		this.field11330 = 1.0F;
	}

    public final int method17605() {
		return (int) this.field11331.x;
	}

    public final int method17606() {
		return (int) this.field11331.y;
	}

    public final int method17607() {
		return (int) this.field11331.z;
	}

    public final int method17608() {
		return this.field11321;
	}

    public final int method17624() {
		return this.field11326;
	}

    public final float method17610() {
		return this.field11323;
	}

    public final float method17652() {
		return this.field11329;
	}

    public void method17612(float arg0) {
		this.field11323 = arg0;
	}

    public void method17628(int arg0, int arg1, int arg2) {
		this.field11331.setTo((float) arg0, (float) arg1, (float) arg2);
	}

    public int method17656() {
		return this.field11332;
	}

    public int method17615() {
		return this.field11327;
	}

    public float method17629() {
		return this.field11330;
	}

    public int method17617() {
		return this.field11333;
	}

    public void method17618(int arg0) {
		this.field11326 = arg0;
	}

    public void method17636(float arg0) {
		this.field11329 = arg0;
	}

    public void method17620(int arg0, int arg1) {
		this.field11332 = arg0;
		this.field11334 = this.field11326;
		this.field11335 = arg1;
		if (this.field11332 == -1) {
			this.field11332 = this.field11322;
		}
		this.field11327 = arg1;
		this.field11328 = MonotonicTime.get();
	}

    public void method17621(float arg0, int arg1) {
		this.field11330 = arg0;
		this.field11325 = this.field11329;
		this.field11320 = arg1;
		if (this.field11330 < 0.0F) {
			this.field11330 = 1.0F;
		}
		this.field11333 = arg1;
		this.field11324 = MonotonicTime.get();
	}

    public void method17622() {
		if (this.field11332 != this.field11326) {
			long var1 = MonotonicTime.get();
			long var3 = var1 - this.field11328;
			this.field11327 = (int) ((long) (this.field11327) - var3);
			if (this.field11327 > 0) {
				this.field11326 = ColourUtils.interpolateColours(this.field11334, this.field11332, (float) (this.field11335 - this.field11327) / (float) this.field11335 * 255.0F);
			} else {
				this.field11326 = this.field11332;
			}
			this.field11328 = var1;
		}
		if (this.field11330 == this.field11329) {
			return;
		}
		long var5 = MonotonicTime.get();
		long var7 = var5 - this.field11324;
		this.field11333 = (int) ((long) (this.field11333) - var7);
		if (this.field11333 > 0) {
			this.field11329 = (float) (this.field11320 - this.field11333) / (float) this.field11320 * (this.field11330 - this.field11325) + this.field11325;
		} else {
			this.field11329 = this.field11330;
		}
		this.field11324 = var5;
	}
}
