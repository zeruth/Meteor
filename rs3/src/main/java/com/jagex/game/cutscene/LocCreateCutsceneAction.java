package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;


public class LocCreateCutsceneAction extends CutsceneAction {

    public final int field10306;

    public final int field10307;

    public final int field10308;

    public final int field10309;

    public final int field10310;

	public LocCreateCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10306 = arg0.g2();
		int var2 = arg0.g4s();
		this.field10307 = var2 >>> 16;
		this.field10308 = var2 & 0xFFFF;
		this.field10309 = arg0.g1();
		this.field10310 = arg0.g1();
	}

    public void method2890() {
		CutsceneManager.field7317[this.field10306].method2847(this.field10309, this.field10307, this.field10308, this.field10310);
	}
}
