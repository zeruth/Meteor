package com.jagex.game.client;

import deob.ObfuscatedName;

public class RebuildType {

    public static final RebuildType field5063 = new RebuildType(false, false);

    public static final RebuildType CUTSCENE = new RebuildType(true, false);

    public static final RebuildType REBUILD_NORMAL = new RebuildType(false, false);

    public static final RebuildType REBUILD_REGION = new RebuildType(true, false);

    public static final RebuildType field5067 = new RebuildType(true, false);

    public static final RebuildType field5068 = new RebuildType(true, true);

    public static final RebuildType field5069 = new RebuildType(true, true);

    public static final RebuildType field5070 = new RebuildType(false, false);

    public boolean regionType;

    public boolean field5065;

	public RebuildType(boolean regionType, boolean arg1) {
		this.regionType = regionType;
		this.field5065 = arg1;
	}

    public boolean isRegionType() {
		return this.regionType;
	}

    public boolean method7888() {
		return this.field5065;
	}
}
