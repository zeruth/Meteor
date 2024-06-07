package com.jagex.game.world.entity;

import com.jagex.game.config.vartype.VarDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;
import deob.ObfuscatedName;
import rs2.client.scene.entities.PathingEntity;

public class PathingEntityVarDomain implements VarDomain {

    public PathingEntity pathingEntity;

	public PathingEntityVarDomain(PathingEntity pathingEntity) {
		this.pathingEntity = pathingEntity;
	}

    public int getVarValueInt(VarType varType) {
		return this.pathingEntity.vars.getVarValueInt(varType.id);
	}

    public long getVarValueLong(VarType varType) {
		return this.pathingEntity.vars.getVarValueLong(varType.id);
	}

    public Object getVarValue(VarType varType) {
		return this.pathingEntity.vars.getVarValue(varType.id);
	}

    public int getVarBitValue(VarBitType varBitType) {
		return varBitType.getVarbitValue(this.getVarValueInt(varBitType.baseVar));
	}

    public void setVarValueInt(VarType varType, int arg1) {
		this.pathingEntity.vars.setVarValueInt(varType.id, arg1);
	}

    public void setVarValueLong(VarType varType, long arg1) {
		this.pathingEntity.vars.setVarValueLong(varType.id, arg1);
	}

    public void setVarValue(VarType varType, Object arg1) {
		this.pathingEntity.vars.setVarValue(varType.id, arg1);
	}

    public void setVarbitValue(VarBitType varBitType, int arg1) throws VarBitOverflowException {
		this.setVarValueInt(varBitType.baseVar, varBitType.setVarbitValue(this.getVarValueInt(varBitType.baseVar), arg1));
	}
}
