package com.jagex.game.config.invtype;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import deob.ObfuscatedName;

public class InvType extends SecondaryNode implements ConfigType, MutableConfig {

    public int stockLength = 0;

    public int[] stockobj;

    public int[] stockcount;

    public int size = 0;

    public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

    public void decode(Packet buf, int code) {
		if (code == 2) {
			this.size = buf.g2();
		} else if (code == 4) {
			this.stockLength = buf.g1();
			this.stockobj = new int[this.stockLength];
			this.stockcount = new int[this.stockLength];
			for (int var3 = 0; var3 < this.stockLength; var3++) {
				this.stockobj[var3] = buf.g2();
				this.stockcount[var3] = buf.g2();
			}
		}
	}

    public void postDecode() {
	}

    public void setId(int arg0) {
	}
}
