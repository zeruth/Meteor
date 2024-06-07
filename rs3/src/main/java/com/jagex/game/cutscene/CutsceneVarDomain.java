package com.jagex.game.cutscene;

import com.jagex.core.datastruct.IntNode;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitType;

import rs2.client.Client;

public final class CutsceneVarDomain implements VarIntDomain {

    public int getVarValueInt(VarType arg0) {
		IntNode var2 = (IntNode) CutsceneManager.varPlayerOverrides.get((long) arg0.id);
		return var2 == null ? Client.localPlayerGameState.getVarValueInt(arg0) : var2.value;
	}

    public int getVarBitValue(VarBitType arg0) {
		IntNode var2 = (IntNode) CutsceneManager.varPlayerOverrides.get((long) arg0.id | 0x100000000L);
		return var2 == null ? Client.localPlayerGameState.getVarBitValue(arg0) : var2.value;
	}
}
