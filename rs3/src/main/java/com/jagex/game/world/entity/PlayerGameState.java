package com.jagex.game.world.entity;

import com.jagex.core.constants.ModeAccountType;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarPlayerDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.config.vartype.player.VarPlayerTypeListClient;

import rs2.client.Client;

public class PlayerGameState implements VarIntDomain, VariableTypeProvider, PlayerStatProvider {

    public final VarPlayerDomain varps;

    public final VarPlayerTypeListClient varPlayerTypeList;

    public final VarBitTypeList varBitTypeList;

    public final PlayerStat[] stats;

	public PlayerGameState(VarPlayerTypeListClient varPlayerTypeList, VarBitTypeList varBitTypeList, int numStats) {
		this.stats = new PlayerStat[numStats];
		this.varps = new VarPlayerDomain();
		this.varPlayerTypeList = varPlayerTypeList;
		this.varBitTypeList = varBitTypeList;
	}

    public int getStatXP(int stat) {
		return this.stats[stat].getCappedXP(Client.loggedInMembers ? ModeAccountType.MEMBERS : ModeAccountType.FREE);
	}

    public int getStatLevel(int stat) {
		return this.stats[stat].getLevel();
	}

    public int getStatLevelMax(int stat) {
		return this.stats[stat].getCappedXPLevel(Client.loggedInMembers ? ModeAccountType.MEMBERS : ModeAccountType.FREE);
	}

    public int getStatXPActual(int stat) {
		return this.stats[stat].getXP();
	}

    public int getStatLevelMaxActual(int stat) {
		return this.stats[stat].getXPLevel();
	}

    public VarType getVarType(VarDomainType domainType, int id) {
		return VarDomainType.PLAYER == domainType ? (VarType) this.varPlayerTypeList.list(id) : null;
	}

    public VarBitType getVarBitType(int id) {
		VarBitType varBitType = (VarBitType) this.varBitTypeList.list(id);
		return VarDomainType.PLAYER == varBitType.baseVar.domain ? varBitType : null;
	}

    public int getVarValueInt(VarType arg0) {
		return this.varps.getVarValueInt(arg0);
	}

    public int getVarBitValue(VarBitType arg0) {
		return this.varps.getVarBitValue(arg0);
	}
}
