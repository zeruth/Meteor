package com.jagex.game.config.skydecortype;

import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;


public class SkyDecorType implements ConfigType, MutableConfig {

    public int field2780;

    public int field2776 = 0;

    public int field2783;

    public int field2779;

    public int field2777;

    public boolean field2781;

    public int field2782 = 16777216;

    public int field2778;

    public int field2784;

    public int field2785;

    public int field2786;

    public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			this.method4593(buf, var2);
		}
	}

    public void method4593(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field2776 = arg0.g2();
		} else if (arg1 == 2) {
			this.field2781 = true;
		} else if (arg1 == 3) {
			this.field2783 = arg0.g2s();
			this.field2779 = arg0.g2s();
			this.field2777 = arg0.g2s();
		} else if (arg1 == 4) {
			this.field2780 = arg0.g1();
		} else if (arg1 == 5) {
			this.field2778 = arg0.gSmart2or4null();
		} else if (arg1 == 6) {
			this.field2782 = arg0.g3();
		} else if (arg1 == 7) {
			this.field2784 = arg0.g2s();
			this.field2785 = arg0.g2s();
			this.field2786 = arg0.g2s();
		}
	}

    public void setId(int arg0) {
	}

    public void postDecode() {
	}
}
