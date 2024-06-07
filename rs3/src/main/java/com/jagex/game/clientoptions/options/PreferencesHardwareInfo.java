package com.jagex.game.clientoptions.options;



public class PreferencesHardwareInfo {

    public int maxmemory;

    public int cpucount;

    public boolean osArchArm;

    public boolean osArchWindows;

    public boolean unused;

	public PreferencesHardwareInfo(int maxmemory, int cpucount, boolean osArchArm, boolean osArchWindows, boolean unused) {
		this.maxmemory = maxmemory;
		this.cpucount = cpucount;
		this.osArchArm = osArchArm;
		this.osArchWindows = osArchWindows;
		this.unused = unused;
	}

    public int maxmemory() {
		return this.maxmemory;
	}

    public int cpucount() {
		return this.cpucount;
	}

    public boolean osArchArm() {
		return this.osArchArm;
	}

    public boolean osArchWindows() {
		return this.osArchWindows;
	}

    public boolean unused() {
		return this.unused;
	}
}
