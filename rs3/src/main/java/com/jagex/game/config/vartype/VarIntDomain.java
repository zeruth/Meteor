package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitType;


public interface VarIntDomain {

    int getVarBitValue(VarBitType arg0);

    int getVarValueInt(VarType arg0);
}
