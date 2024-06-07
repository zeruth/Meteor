package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class MoveSpeed implements SerializableEnum {

    public static final MoveSpeed STATIONARY = new MoveSpeed(0, (byte) -1);

    public static final MoveSpeed CRAWL = new MoveSpeed(1, (byte) 0);

    public static final MoveSpeed WALK = new MoveSpeed(2, (byte) 1);

    public static final MoveSpeed RUN = new MoveSpeed(3, (byte) 2);

    public static final MoveSpeed INSTANT = new MoveSpeed(4, (byte) 3);

    public final int index;

    public byte serialID;

    public static MoveSpeed[] values() {
		return new MoveSpeed[] {STATIONARY, CRAWL, WALK, RUN, INSTANT};
	}

	public MoveSpeed(int index, byte serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}

    public int method13906() {
		return this.serialID + 1;
	}
}
