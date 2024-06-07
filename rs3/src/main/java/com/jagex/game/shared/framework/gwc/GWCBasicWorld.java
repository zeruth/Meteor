package com.jagex.game.shared.framework.gwc;

import deob.ObfuscatedName;

public abstract class GWCBasicWorld {

    public int field7639;

    public int field7640;

    public int field7641;

    public boolean method9744() {
		return (this.field7639 & 0x1) != 0;
	}

    public boolean method9750() {
		return (this.field7639 & 0x2) != 0;
	}

    public boolean method9746() {
		return (this.field7639 & 0x4) != 0;
	}

    public boolean method9747() {
		return (this.field7639 & 0x8) != 0;
	}
}
