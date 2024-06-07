package com.jagex.game.config.vartype.bit;

import com.jagex.core.constants.SerializableEnum;


public class VarBitTypeEncodingKey implements SerializableEnum {

    public static final VarBitTypeEncodingKey BASEVAR = new VarBitTypeEncodingKey(14, 1);

    public static final VarBitTypeEncodingKey BITS = new VarBitTypeEncodingKey(7, 2);

    public static final VarBitTypeEncodingKey WARNONDECREASE = new VarBitTypeEncodingKey(3, 3);

    public static final VarBitTypeEncodingKey MASTERQUEST = new VarBitTypeEncodingKey(8, 4);

    public static final VarBitTypeEncodingKey QUESTPOINTS = new VarBitTypeEncodingKey(11, 5);

    public static final VarBitTypeEncodingKey WEALTHEQUIVALENT = new VarBitTypeEncodingKey(1, 6);

    public static final VarBitTypeEncodingKey SETVARALLOWED = new VarBitTypeEncodingKey(5, 7);

    public static final VarBitTypeEncodingKey SENDTOGAMELOGWORLD = new VarBitTypeEncodingKey(13, 8);

    public static final VarBitTypeEncodingKey TRANSMITLEVEL = new VarBitTypeEncodingKey(2, 9);

    public static final VarBitTypeEncodingKey TRANSMITLEVELOTHER = new VarBitTypeEncodingKey(4, 10);

    public static final VarBitTypeEncodingKey DEBUGNAME = new VarBitTypeEncodingKey(12, 11);

    public static final VarBitTypeEncodingKey IGNOREOVERLAP = new VarBitTypeEncodingKey(6, 12);

    public static final VarBitTypeEncodingKey VARBITNAME_HASH32 = new VarBitTypeEncodingKey(9, 13);

    public static final VarBitTypeEncodingKey field3061 = new VarBitTypeEncodingKey(10, 14);

    public static final VarBitTypeEncodingKey field3071 = new VarBitTypeEncodingKey(0, 15);

    public final int index;

    public final int serialID;

	public VarBitTypeEncodingKey(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public static VarBitTypeEncodingKey[] values() {
        return new VarBitTypeEncodingKey[] {IGNOREOVERLAP, DEBUGNAME, VARBITNAME_HASH32, TRANSMITLEVELOTHER, field3071, QUESTPOINTS, BITS, WEALTHEQUIVALENT, WARNONDECREASE, TRANSMITLEVEL, BASEVAR, MASTERQUEST, SETVARALLOWED, field3061, SENDTOGAMELOGWORLD};
    }

    public int getId() {
		return this.serialID;
	}
}
