package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;


public class NativeLibraryFailureType implements SerializableEnum {

    public static final NativeLibraryFailureType field8907 = new NativeLibraryFailureType(0);

    public static final NativeLibraryFailureType field8908 = new NativeLibraryFailureType(1);

    public final int serialID;

	public NativeLibraryFailureType(int serialID) {
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
