package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;


public interface VarDomain extends VarIntDomain {

    void setVarValueInt(VarType arg0, int arg1);

    long getVarValueLong(VarType arg0);

    void setVarValueLong(VarType arg0, long arg1);

    Object getVarValue(VarType arg0);

    void setVarValue(VarType arg0, Object arg1);

    void setVarbitValue(VarBitType arg0, int arg1) throws VarBitOverflowException;

    int getVarValueInt(VarType arg0);

    int getVarBitValue(VarBitType arg0);
}
