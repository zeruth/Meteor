package com.jagex.game.script.activepointers;

import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.iftype.Interface;
import deob.ObfuscatedName;

public class ActiveComponent {

    public Component com;

    public Interface itf;

    public Component method13790() {
		return this.itf.getComponent(this.com.parentlayer);
	}

    public boolean method13787(int arg0, int arg1) {
		Component var3 = Component.method16682(arg0, arg1);
		if (var3 == null) {
			this.method13788();
			return false;
		} else {
			this.itf = Component.interfaces[arg0 >> 16];
			this.com = var3;
			return true;
		}
	}

    public void method13788() {
		this.itf = null;
		this.com = null;
	}
}
