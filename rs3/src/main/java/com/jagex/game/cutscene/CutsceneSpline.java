package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;

import rs2.client.Client;

public class CutsceneSpline {

    public final int[] field1727;

    public final int[] field1728;

    public final int[] field1729;

    public final int[] field1730;

    public final int[] field1731;

    public final int[] field1732;

    public final int[] field1733;

	public CutsceneSpline(Packet arg0) {
		int var2 = arg0.gSmart1or2();
		this.field1727 = new int[var2];
		this.field1728 = new int[var2];
		this.field1729 = new int[var2];
		this.field1730 = new int[var2];
		this.field1731 = new int[var2];
		this.field1732 = new int[var2];
		this.field1733 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			this.field1727[var3] = arg0.g2() - 5120;
			this.field1729[var3] = arg0.g2() - 5120;
			this.field1728[var3] = arg0.g2s();
			this.field1731[var3] = arg0.g2() - 5120;
			this.field1733[var3] = arg0.g2() - 5120;
			this.field1732[var3] = arg0.g2s();
			this.field1730[var3] = arg0.g2s();
		}
	}

    public void method2840(int arg0) {
		int[][] var2 = new int[this.field1727.length << 1][4];
		for (int var3 = 0; var3 < this.field1727.length; var3++) {
			var2[var3 * 2][0] = this.field1727[var3];
			var2[var3 * 2][1] = this.field1728[var3];
			var2[var3 * 2][2] = this.field1729[var3];
			var2[var3 * 2][3] = this.field1730[var3];
			var2[var3 * 2 + 1][0] = this.field1731[var3];
			var2[var3 * 2 + 1][1] = this.field1732[var3];
			var2[var3 * 2 + 1][2] = this.field1733[var3];
			var2[var3 * 2 + 1][3] = this.field1730[var3];
		}
		Client.cutsceneSpline[arg0] = var2;
	}
}
