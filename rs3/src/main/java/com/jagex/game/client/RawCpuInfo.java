package com.jagex.game.client;



public class RawCpuInfo {

    public final int rawCpuInfo0;

    public final int rawCpuInfo1;

    public final int rawCpuInfo2;

    public final int rawCpuInfo3;

    public final int rawCpuInfo4;

	public RawCpuInfo(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.rawCpuInfo0 = arg0;
		this.rawCpuInfo1 = arg1;
		this.rawCpuInfo2 = arg2;
		this.rawCpuInfo3 = arg3;
		this.rawCpuInfo4 = arg4;
	}

	public int hashCode() {
		return this.rawCpuInfo0;
	}
}
