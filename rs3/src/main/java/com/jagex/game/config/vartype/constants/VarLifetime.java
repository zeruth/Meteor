package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class VarLifetime implements SerializableEnum {

    public static final VarLifetime TEMPORARY = new VarLifetime(0);

    public static final VarLifetime PERMANENT = new VarLifetime(1);

    public static final VarLifetime SERVER_PERMANENT = new VarLifetime(2);

    public final int serialID;

    public static VarLifetime[] values() {
		return new VarLifetime[] {PERMANENT, TEMPORARY, SERVER_PERMANENT};
	}

	public VarLifetime(int serialID) {
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
