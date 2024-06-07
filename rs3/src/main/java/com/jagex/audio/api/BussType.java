package com.jagex.audio.api;



public class BussType {

    public static final BussType MASTER = new BussType(1);

    public static final BussType SFX = new BussType(0);

    public static final BussType MUSIC = new BussType(5);

    public static final BussType MUSIC_LOGIN = new BussType(3);

    public static final BussType AMBIENT = new BussType(2);

    public static final BussType VOICEOVER = new BussType(4);

    public final int ordinal;

	public BussType(int arg0) {
		this.ordinal = arg0;
	}

    public int getId() {
		return MASTER == this ? -1 : this.ordinal | 0x1000000;
	}
}
