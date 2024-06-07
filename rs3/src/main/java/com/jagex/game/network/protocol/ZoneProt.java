package com.jagex.game.network.protocol;

import deob.ObfuscatedName;

public class ZoneProt {

    public static final ZoneProt LOC_PREFETCH = new ZoneProt(5);

    public static final ZoneProt MAP_ANIM = new ZoneProt(10);

    public static final ZoneProt TEXT_COORD = new ZoneProt(-1);

    public static final ZoneProt OBJ_COUNT = new ZoneProt(7);

    public static final ZoneProt LOC_ANIM = new ZoneProt(7);

    public static final ZoneProt LOC_DEL = new ZoneProt(2);

    public static final ZoneProt field3618 = new ZoneProt(9);

    public static final ZoneProt MAP_PROJANIM = new ZoneProt(18);

    public static final ZoneProt OBJ_REVEAL = new ZoneProt(7);

    public static final ZoneProt OBJ_DEL = new ZoneProt(3);

    public static final ZoneProt LOC_ADD_CHANGE = new ZoneProt(-1);

    public static final ZoneProt LOC_CUSTOMISE = new ZoneProt(-1);

    public static final ZoneProt MAP_PROJANIM_HALFSQ = new ZoneProt(21);

    public static final ZoneProt OBJ_ADD = new ZoneProt(5);

    public static final ZoneProt SOUND_AREA = new ZoneProt(8);

    public static ZoneProt[] values() {
		return new ZoneProt[] {LOC_PREFETCH, MAP_ANIM, TEXT_COORD, OBJ_COUNT, LOC_ANIM, LOC_DEL, field3618, MAP_PROJANIM, OBJ_REVEAL, OBJ_DEL, LOC_ADD_CHANGE, LOC_CUSTOMISE, MAP_PROJANIM_HALFSQ, OBJ_ADD, SOUND_AREA};
	}

	public ZoneProt(int arg0) {
	}
}
