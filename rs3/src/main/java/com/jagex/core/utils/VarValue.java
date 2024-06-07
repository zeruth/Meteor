package com.jagex.core.utils;



public class VarValue {

    public final int var;

    public Object value;

	public VarValue(int arg0) {
		this.var = arg0;
	}

	public VarValue(int arg0, Object arg1) {
		this.var = arg0;
		this.value = arg1;
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof VarValue)) {
			return false;
		}
		VarValue var2 = (VarValue) arg0;
		if (var2.value == null && this.value != null) {
			return false;
		} else if (this.value == null && var2.value != null) {
			return false;
		} else {
			return this.var == var2.var && var2.value.equals(this.value);
		}
	}
}
