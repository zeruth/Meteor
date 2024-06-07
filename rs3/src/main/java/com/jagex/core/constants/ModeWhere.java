package com.jagex.core.constants;



import java.util.HashSet;
import java.util.Set;

public class ModeWhere implements SerializableEnum {

	public static final ModeWhere LIVE = new ModeWhere("", 0, new ModeWhereProperty[] { ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	public static final ModeWhere WTRC = new ModeWhere("", 1, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	public static final ModeWhere WTQA = new ModeWhere("", 2, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.QA, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	public static final ModeWhere WTWIP = new ModeWhere("", 3, new ModeWhereProperty[] { ModeWhereProperty.OFFICE});

	public static final ModeWhere LOCAL = new ModeWhere("", 4);

	public static final ModeWhere WTI = new ModeWhere("", 5, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	public static final ModeWhere INTBETA = new ModeWhere("", 6, new ModeWhereProperty[] { ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	public static final ModeWhere WTITU = new ModeWhere("", 8, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	public static final ModeWhere WTQA2 = new ModeWhere("", 9, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.QA});

	public static final ModeWhere field8276 = new ModeWhere("", 10, new ModeWhereProperty[] { ModeWhereProperty.OFFICE});

	public static final ModeWhere field8267 = new ModeWhere("", 11, new ModeWhereProperty[] { ModeWhereProperty.OFFICE});

	public static final ModeWhere field8278 = new ModeWhere("", 12, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	public static final ModeWhere field8271 = new ModeWhere("", 13, new ModeWhereProperty[] { ModeWhereProperty.OFFICE});

	public final int serialID;

	public final Set modes = new HashSet();

	static {
		values();
	}

	public static ModeWhere[] values() {
		return new ModeWhere[] {WTRC, field8271, WTQA2, LOCAL, INTBETA, WTQA, field8276, LIVE, field8267, WTI, field8278, WTWIP, WTITU};
	}

	public ModeWhere(String arg0, int serialID) {
		this.serialID = serialID;
	}

	public ModeWhere(String arg0, int serialID, ModeWhereProperty[] modes) {
		this.serialID = serialID;
        for (int index = 0; index < modes.length; index++) {
			ModeWhereProperty var6 = modes[index];
			this.modes.add(var6);
		}
	}

	public int getId() {
		return this.serialID;
	}

	public boolean hasMode(ModeWhereProperty mode) {
		return this.modes.contains(mode);
	}
}
