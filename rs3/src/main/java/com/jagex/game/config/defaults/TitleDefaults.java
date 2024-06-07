package com.jagex.game.config.defaults;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;


public class TitleDefaults {

    public int field7671 = -1;

    public int field7670 = -1;

	public TitleDefaults(Js5 arg0) {
		byte[] var2 = arg0.fetchFile(DefaultsGroup.TITLE.js5GroupId);
		this.method9831(new Packet(var2));
	}

    public void method9831(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			switch(var2) {
				case 0:
					return;
				case 1:
					this.field7671 = arg0.gSmart2or4null();
					this.field7670 = arg0.gSmart2or4null();
					break;
				default:
					return;
			}
		}
	}
}
