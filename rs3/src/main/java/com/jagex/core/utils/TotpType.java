package com.jagex.core.utils;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class TotpType implements SerializableEnum {

    public static final TotpType AUTH_FOUND = new TotpType(0, 0);

    public static final TotpType AUTH_DONT_TRUST = new TotpType(3, 1);

    public static final TotpType AUTH_NOT_FOUND = new TotpType(2, 2);

    public static final TotpType AUTH_TRUST = new TotpType(1, 3);

    public final int index;

    public final int serialID;

	public TotpType(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
