package com.jagex.core.datastruct;



import java.lang.ref.SoftReference;

public class SoftReferenceNode extends ReferenceNode {

    public SoftReference value;

	public SoftReferenceNode(Object arg0, int arg1) {
		super(arg1);
		this.value = new SoftReference(arg0);
	}

    public Object getValue() {
		return this.value.get();
	}

    public boolean isSoft() {
		return true;
	}
}
