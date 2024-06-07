package com.jagex.game.client;

import com.jagex.core.utils.MonotonicTime;


import java.awt.*;

public class NativeMouseEvent extends MouseEvent {

	public int field12424;

	public static NativeMouseEvent[] field12413 = new NativeMouseEvent[0];

	public static int field2364;

	public static int field7658;

	public int field12420;

	public int field12407;

	public long field12422;

	public int field12419;

	public static void method18259(int arg0) {
		field2364 = arg0;
		field12413 = new NativeMouseEvent[arg0];
		field7658 = 0;
	}

	public static NativeMouseEvent method17446(int arg0, int arg1, int arg2, int arg3) {
		NativeMouseEvent[] var4 = field12413;
		synchronized (field12413) {
			NativeMouseEvent var5;
			if (field7658 == 0) {
				var5 = new NativeMouseEvent();
			} else {
				var5 = field12413[--field7658];
			}
			var5.field12419 = arg0;
			var5.field12424 = arg1;
			var5.field12420 = arg2;
			var5.field12407 = arg3;
			var5.field12422 = MonotonicTime.get();
			return var5;
		}
	}

	public void release() {
		NativeMouseEvent[] var1 = field12413;
		synchronized (field12413) {
			if (field7658 < field2364 - 1) {
				field12413[++field7658 - 1] = this;
			}
		}
	}

	public int method19537() {
		return this.field12407;
	}

	public int method19539() {
		return this.field12420;
	}

	public boolean method19540() {
		switch(this.field12420) {
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 672:
			case 674:
				return true;
			default:
				return false;
		}
	}

	public int getCount() {
		switch(this.field12420) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	public int getButtonAction() {
		switch(this.field12420) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	public void method19541(Point arg0) {
		this.field12419 -= arg0.x;
		this.field12424 -= arg0.y;
	}

	public long method17834() {
		return this.field12422;
	}

	public int getMouseClickX() {
		return this.field12419;
	}

	public int getMouseClickY() {
		return this.field12424;
	}
}
