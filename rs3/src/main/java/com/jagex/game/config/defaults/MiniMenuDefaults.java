package com.jagex.game.config.defaults;

import com.jagex.core.io.Packet;
import com.jagex.game.client.KeyHeldBinding;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

public class MiniMenuDefaults {

    public Binding field7667;

    public Binding field7660;

    public Binding field7666;

    public Binding field7662;

    public KeyHeldBinding field7663;

    public KeyHeldBinding ctrlrunning;

    public KeyHeldBinding shiftteleport;

    public int members_colour;

    public int free_colour;

    public boolean field7668;

	public MiniMenuDefaults(Js5 arg0) {
		byte[] var2 = arg0.fetchFile(DefaultsGroup.MENU.js5GroupId);
		this.method9825(new Packet(var2));
	}

    public void method9825(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field7667 = Bindings.method4055(arg0);
			} else if (var2 == 2) {
				this.field7660 = Bindings.method4055(arg0);
			} else if (var2 == 3) {
				this.field7666 = Bindings.method4055(arg0);
			} else if (var2 == 4) {
				this.field7662 = Bindings.method4055(arg0);
			} else if (var2 == 5) {
				this.field7663 = KeyHeldBinding.method6037(arg0);
			} else if (var2 == 6) {
				this.ctrlrunning = KeyHeldBinding.method6037(arg0);
			} else if (var2 == 7) {
				this.shiftteleport = KeyHeldBinding.method6037(arg0);
			} else if (var2 == 8) {
				Bindings.method4055(arg0);
			} else if (var2 == 9) {
				Bindings.method4055(arg0);
			} else if (var2 == 10) {
				Bindings.method4055(arg0);
			} else if (var2 == 11) {
				this.field7668 = true;
			} else if (var2 == 12) {
				this.members_colour = arg0.g4s();
			} else if (var2 == 13) {
				this.free_colour = arg0.g4s();
			}
		}
	}
}
