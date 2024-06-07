package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

public interface VariableTypeProvider {

    VarBitType getVarBitType(int id);

    VarType getVarType(VarDomainType domainType, int id);
}
