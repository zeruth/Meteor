package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;


public class SparseVarDomain implements VarDomain {

    public final VarContainer field1708;

	public SparseVarDomain(VarTypeList arg0) {
		this(arg0, new VarContainerSparse(arg0));
	}

	public SparseVarDomain(VarTypeList arg0, VarContainerSparse arg1) {
		this(arg0.variableDomain, arg1);
	}

	public SparseVarDomain(VarDomainType arg0, VarContainerSparse arg1) {
		this.field1708 = arg1;
	}

    public int getVarValueInt(VarType arg0) {
		return this.field1708.getVarValueInt(arg0.id);
	}

    public void setVarValueInt(VarType arg0, int arg1) {
		this.field1708.setVarValueInt(arg0.id, arg1);
	}

    public long getVarValueLong(VarType arg0) {
		return this.field1708.getVarValueLong(arg0.id);
	}

    public void setVarValueLong(VarType arg0, long arg1) {
		this.field1708.setVarValueLong(arg0.id, arg1);
	}

    public Object getVarValue(VarType arg0) {
		return this.field1708.getVarValue(arg0.id);
	}

    public void setVarValue(VarType arg0, Object arg1) {
		this.field1708.setVarValue(arg0.id, arg1);
	}

    public int getVarBitValue(VarBitType arg0) {
		return arg0.getVarbitValue(this.getVarValueInt(arg0.baseVar));
	}

    public void setVarbitValue(VarBitType arg0, int arg1) throws VarBitOverflowException {
		this.setVarValueInt(arg0.baseVar, arg0.setVarbitValue(this.getVarValueInt(arg0.baseVar), arg1));
	}
}
