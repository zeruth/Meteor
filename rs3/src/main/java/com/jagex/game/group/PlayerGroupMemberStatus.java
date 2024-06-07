package com.jagex.game.group;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class PlayerGroupMemberStatus implements SerializableEnum {

    public static final PlayerGroupMemberStatus TELEPORTED = new PlayerGroupMemberStatus(3, 0);

    public static final PlayerGroupMemberStatus NOT_READY = new PlayerGroupMemberStatus(0, 1);

    public static final PlayerGroupMemberStatus GAME_LOADING = new PlayerGroupMemberStatus(2, 2);

    public static final PlayerGroupMemberStatus READY = new PlayerGroupMemberStatus(1, 3);

    public final int index;

    public final int serialID;

    public static PlayerGroupMemberStatus[] values() {
		return new PlayerGroupMemberStatus[] {NOT_READY, READY, GAME_LOADING, TELEPORTED};
	}

	public PlayerGroupMemberStatus(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
