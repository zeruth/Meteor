package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.ScriptVarType;

import rs2.client.Client;
import rs2.client.logic.clans.ClanSettings;

public class VarClanSettingsDomain implements VarDomain {

    public ClanSettings field8193;

	public VarClanSettingsDomain(ClanSettings arg0) {
		this.field8193 = arg0;
	}

    public int getVarValueInt(VarType arg0) {
		Integer var2 = this.field8193.getSettingInt(Client.modegame.game << 16 | arg0.id);
		return var2 == null ? (Integer) arg0.getDefaultValue() : var2;
	}

    public long getVarValueLong(VarType arg0) {
		Long var2 = this.field8193.getSettingLong(Client.modegame.game << 16 | arg0.id);
		return var2 == null ? (Long) arg0.getDefaultValue() : var2;
	}

    public Object getVarValue(VarType arg0) {
		if (ScriptVarType.STRING != arg0.dataType) {
			throw new IllegalArgumentException("");
		}
		return this.field8193.getSettingString(Client.modegame.game << 16 | arg0.id);
	}

    public int getVarBitValue(VarBitType arg0) {
		return arg0.getVarbitValue(this.getVarValueInt(arg0.baseVar));
	}

    public void setVarValueInt(VarType arg0, int arg1) {
		throw new UnsupportedOperationException();
	}

    public void setVarValueLong(VarType arg0, long arg1) {
		throw new UnsupportedOperationException();
	}

    public void setVarValue(VarType arg0, Object arg1) {
		throw new UnsupportedOperationException();
	}

    public void setVarbitValue(VarBitType arg0, int arg1) {
		throw new UnsupportedOperationException();
	}
}
