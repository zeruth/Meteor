package com.jagex.core.constants;



public class ModeWhat {

    public static final ModeWhat LIVE = new ModeWhat("LIVE", 0);

    public static final ModeWhat BUILDLIVE = new ModeWhat("BUILDLIVE", 3);

    public static final ModeWhat RC = new ModeWhat("RC", 1);

    public static final ModeWhat WIP = new ModeWhat("WIP", 2);

    public static final ModeWhat INTBETA = new ModeWhat("INTBETA", 4);

    public final String field8478;

    public final int field8477;

    public static ModeWhat[] method7705() {
		return new ModeWhat[] {WIP, BUILDLIVE, LIVE, RC, INTBETA};
	}

	public ModeWhat(String arg0, int arg1) {
		this.field8478 = arg0;
		this.field8477 = arg1;
	}

    public static ModeWhat method8146(int arg0) {
		ModeWhat[] var1 = method7705();
		for (int var2 = 0; var2 < var1.length; var2++) {
			ModeWhat var3 = var1[var2];
			if (var3.field8477 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
