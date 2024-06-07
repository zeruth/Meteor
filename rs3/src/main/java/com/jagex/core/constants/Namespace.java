package com.jagex.core.constants;

import deob.ObfuscatedName;

public class Namespace implements SerializableEnum {

    public static final Namespace RUNESCAPE = new Namespace(0, 0, "", "");

    public static final Namespace FUNORB = new Namespace(5, 1, "", "");

    public static final Namespace WAR_OF_LEGENDS = new Namespace(6, 2, "", "");

    public static final Namespace STELLAR_DAWN = new Namespace(8, 3, "", "");

    public static final Namespace EIGHT_REALMS = new Namespace(7, 4, "", "");

    public static final Namespace TRANSFORMERS = new Namespace(2, 5, "", "");

    public static final Namespace SCRATCH = new Namespace(3, 6, "", "");

    public static final Namespace field9194 = new Namespace(4, 7, "", "");

    public static final Namespace LEGACY = new Namespace(1, -1, "", "", true, new Namespace[] {RUNESCAPE, FUNORB, WAR_OF_LEGENDS, EIGHT_REALMS, STELLAR_DAWN});

    public final int index;

    public final int serialID;

    public final String field9198;

	public Namespace(int index, int serialID, String arg2, String arg3) {
		this.index = index;
		this.serialID = serialID;
		this.field9198 = arg3;
	}

	public Namespace(int index, int serialID, String arg2, String arg3, boolean arg4, Namespace[] arg5) {
		this.index = index;
		this.serialID = serialID;
		this.field9198 = arg3;
	}

    public int getId() {
		return this.serialID;
	}

	public String toString() {
		return this.field9198;
	}
}
