package com.jagex.game.client;

import com.jagex.game.config.defaults.SkillDefaults;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.group.PlayerGroupResourceProvider;

import rs2.client.Client;

public final class ClientPlayerGroupResourceProvider implements PlayerGroupResourceProvider {

    public VarTypeList getVarPlayerTypeList() {
		return Client.varPlayerTypeList;
	}

    public VarTypeList getVarPlayerGroupTypeList() {
		return Client.varPlayerGroupTypeList;
	}

    public VarBitTypeList getVarBitTypeList() {
		return Client.varBitTypeList;
	}

    public SkillDefaults getSkillDefaults() {
		return Client.skillDefaults;
	}
}
