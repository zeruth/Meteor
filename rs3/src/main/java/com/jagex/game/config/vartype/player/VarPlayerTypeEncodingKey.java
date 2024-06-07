package com.jagex.game.config.vartype.player;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class VarPlayerTypeEncodingKey implements SerializableEnum {

    public static final VarPlayerTypeEncodingKey PROTECTEDACCESSREQUIRED = new VarPlayerTypeEncodingKey(2, 100);

    public static final VarPlayerTypeEncodingKey SETVARALLOWED = new VarPlayerTypeEncodingKey(16, 101);

    public static final VarPlayerTypeEncodingKey WEALTHEQUIVALENT = new VarPlayerTypeEncodingKey(8, 102);

    public static final VarPlayerTypeEncodingKey SENDTOGAMELOGWORLD = new VarPlayerTypeEncodingKey(5, 103);

    public static final VarPlayerTypeEncodingKey WARNONDECREASE = new VarPlayerTypeEncodingKey(3, 104);

    public static final VarPlayerTypeEncodingKey HISCOREDATA = new VarPlayerTypeEncodingKey(1, 105);

    public static final VarPlayerTypeEncodingKey PLOGDATA = new VarPlayerTypeEncodingKey(11, 106);

    public static final VarPlayerTypeEncodingKey CLANDATA = new VarPlayerTypeEncodingKey(7, 107);

    public static final VarPlayerTypeEncodingKey TRANSMITLEVELOTHER = new VarPlayerTypeEncodingKey(6, 108);

    public static final VarPlayerTypeEncodingKey GENERALPURPOSE = new VarPlayerTypeEncodingKey(14, 109);

    public static final VarPlayerTypeEncodingKey CLIENTCODE = new VarPlayerTypeEncodingKey(0, 110);

    public static final VarPlayerTypeEncodingKey MASTERQUEST = new VarPlayerTypeEncodingKey(4, 111);

    public static final VarPlayerTypeEncodingKey QUESTPOINTS = new VarPlayerTypeEncodingKey(12, 112);

    public static final VarPlayerTypeEncodingKey LEGACYID = new VarPlayerTypeEncodingKey(13, 113);

    public static final VarPlayerTypeEncodingKey field1990 = new VarPlayerTypeEncodingKey(17, 114);

    public static final VarPlayerTypeEncodingKey field1999 = new VarPlayerTypeEncodingKey(15, 115);

    public static final VarPlayerTypeEncodingKey field1984 = new VarPlayerTypeEncodingKey(10, 116);

    public static final VarPlayerTypeEncodingKey field1993 = new VarPlayerTypeEncodingKey(9, 117);

    public final int index;

    public final int serialID;

    public static VarPlayerTypeEncodingKey[] values() {
		return new VarPlayerTypeEncodingKey[] { field1999, WARNONDECREASE, field1984, LEGACYID, field1993, SETVARALLOWED, CLIENTCODE, HISCOREDATA, SENDTOGAMELOGWORLD, field1990, TRANSMITLEVELOTHER, CLANDATA, WEALTHEQUIVALENT, QUESTPOINTS, PLOGDATA, MASTERQUEST, PROTECTEDACCESSREQUIRED, GENERALPURPOSE};
	}

	public VarPlayerTypeEncodingKey(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
