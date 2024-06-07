package com.jagex.game.config.vartype;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class VarTypeEncodingKey implements SerializableEnum {

    public static final VarTypeEncodingKey DEBUGNAME = new VarTypeEncodingKey(2, 1);

    public static final VarTypeEncodingKey DOMAIN = new VarTypeEncodingKey(4, 2);

    public static final VarTypeEncodingKey TYPE = new VarTypeEncodingKey(1, 3);

    public static final VarTypeEncodingKey LIFETIME = new VarTypeEncodingKey(6, 4);

    public static final VarTypeEncodingKey TRANSMITLEVEL = new VarTypeEncodingKey(3, 5);

    public static final VarTypeEncodingKey VARNAME_HASH32 = new VarTypeEncodingKey(5, 6);

    public static final VarTypeEncodingKey field1698 = new VarTypeEncodingKey(0, 7);

    public final int index;

    public final int serialID;

    public static VarTypeEncodingKey[] values() {
		return new VarTypeEncodingKey[] {LIFETIME, DOMAIN, TRANSMITLEVEL, VARNAME_HASH32, field1698, DEBUGNAME, TYPE};
	}

	public VarTypeEncodingKey(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
