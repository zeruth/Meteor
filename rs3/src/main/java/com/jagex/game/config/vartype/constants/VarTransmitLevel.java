package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;


public class VarTransmitLevel implements SerializableEnum {

    public static final VarTransmitLevel NEVER = new VarTransmitLevel(0);

    public static final VarTransmitLevel ON_SET_DIFFERENT = new VarTransmitLevel(1);

    public static final VarTransmitLevel ON_SET_ALWAYS = new VarTransmitLevel(2);

    public final int serialID;

    public static VarTransmitLevel[] values() {
		return new VarTransmitLevel[] {ON_SET_ALWAYS, NEVER, ON_SET_DIFFERENT};
	}

	public VarTransmitLevel(int serialID) {
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
