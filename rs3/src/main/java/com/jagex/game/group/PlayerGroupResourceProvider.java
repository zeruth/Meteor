package com.jagex.game.group;

import com.jagex.game.config.defaults.SkillDefaults;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import deob.ObfuscatedName;

public interface PlayerGroupResourceProvider {

    VarTypeList getVarPlayerGroupTypeList();

    VarBitTypeList getVarBitTypeList();

    SkillDefaults getSkillDefaults();

    VarTypeList getVarPlayerTypeList();
}
