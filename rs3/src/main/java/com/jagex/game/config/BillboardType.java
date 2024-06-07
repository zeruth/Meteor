package com.jagex.game.config;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public class BillboardType {

    public int field3455 = -1;

    public int field3451 = 64;

    public int field3452 = 64;

    public int field3453 = 2;

    public int field3450 = 1;

    public boolean field3449 = false;

    public boolean field3456 = false;

    public void method5954(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}
			this.method5953(arg0, var3, arg1);
		}
	}

    public void method5953(Packet arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			this.field3455 = arg0.g2();
			if (this.field3455 == 65535) {
				this.field3455 = -1;
			}
		} else if (arg1 == 2) {
			this.field3451 = arg0.g2() + 1;
			this.field3452 = arg0.g2() + 1;
		} else if (arg1 == 3) {
			arg0.g1b();
		} else if (arg1 == 4) {
			this.field3453 = arg0.g1();
		} else if (arg1 == 5) {
			this.field3450 = arg0.g1();
		} else if (arg1 == 6) {
			this.field3449 = true;
		} else if (arg1 == 7) {
			this.field3456 = true;
		}
	}
}
