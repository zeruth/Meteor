package com.jagex.core.constants;



public class ModeAccountType implements SerializableEnum {

    public static final ModeAccountType FREE = new ModeAccountType(0, "");

    public static final ModeAccountType MEMBERS = new ModeAccountType(1, "");

    public final int serialID;

	public ModeAccountType(int serialID, String arg1) {
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
