package com.jagex.audio.api;



public class SubBussType {

    public static final SubBussType SFX_SUB = new SubBussType(8);

    public static final SubBussType MUSIC_SUB = new SubBussType(0);

    public static final SubBussType DIALOG_SUB = new SubBussType(1);

    public static final SubBussType PLAYER_ANIMATION_SUB = new SubBussType(4);

    public static final SubBussType NPC_ANIMATION_SUB = new SubBussType(7);

    public static final SubBussType LOCATION_ANIMATION_SUB = new SubBussType(6);

    public static final SubBussType GENERAL_ANIMATION_SUB = new SubBussType(9);

    public static final SubBussType LOCATIONS_SUB = new SubBussType(2);

    public static final SubBussType LOCATION_RANDOM_SUB = new SubBussType(5);

    public static final SubBussType LOCATION_GENERIC_SUB = new SubBussType(3);

    public final int ordinal;

	public SubBussType(int arg0) {
		this.ordinal = arg0;
	}

    public int getId() {
		return this.ordinal | 0x2000000;
	}
}
