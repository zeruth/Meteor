package com.jagex.game.group;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class PlayerGroupDeltaEncodingKey implements SerializableEnum {

    public static final PlayerGroupDeltaEncodingKey ADD_MEMBER = new PlayerGroupDeltaEncodingKey(1, 1);

    public static final PlayerGroupDeltaEncodingKey DELETE_MEMBER = new PlayerGroupDeltaEncodingKey(9, 2);

    public static final PlayerGroupDeltaEncodingKey ADD_BANNED = new PlayerGroupDeltaEncodingKey(6, 3);

    public static final PlayerGroupDeltaEncodingKey DELETE_BANNED = new PlayerGroupDeltaEncodingKey(10, 4);

    public static final PlayerGroupDeltaEncodingKey SET_MEMBER_RANK = new PlayerGroupDeltaEncodingKey(7, 5);

    public static final PlayerGroupDeltaEncodingKey SET_MEMBER_ONLINE = new PlayerGroupDeltaEncodingKey(2, 6);

    public static final PlayerGroupDeltaEncodingKey SET_MEMBER_OFFLINE = new PlayerGroupDeltaEncodingKey(11, 7);

    public static final PlayerGroupDeltaEncodingKey SET_MEMBER_READY = new PlayerGroupDeltaEncodingKey(4, 8);

    public static final PlayerGroupDeltaEncodingKey SET_GAME_LOADING = new PlayerGroupDeltaEncodingKey(13, 9);

    public static final PlayerGroupDeltaEncodingKey START_GAME = new PlayerGroupDeltaEncodingKey(5, 10);

    public static final PlayerGroupDeltaEncodingKey UPDATE_MEMBER_BASE = new PlayerGroupDeltaEncodingKey(0, 11);

    public static final PlayerGroupDeltaEncodingKey SET_VAR_VALUE = new PlayerGroupDeltaEncodingKey(8, 12);

    public static final PlayerGroupDeltaEncodingKey SET_VARBIT_VALUE = new PlayerGroupDeltaEncodingKey(3, 13);

    public static final PlayerGroupDeltaEncodingKey SET_MEMBER_TEAM = new PlayerGroupDeltaEncodingKey(12, 14);

    public final int index;

    public final int serialID;

    public static PlayerGroupDeltaEncodingKey[] values() {
		return new PlayerGroupDeltaEncodingKey[] {UPDATE_MEMBER_BASE, ADD_MEMBER, SET_MEMBER_ONLINE, SET_VARBIT_VALUE, SET_MEMBER_READY, START_GAME, ADD_BANNED, SET_MEMBER_RANK, SET_VAR_VALUE, DELETE_MEMBER, DELETE_BANNED, SET_MEMBER_OFFLINE, SET_MEMBER_TEAM, SET_GAME_LOADING};
	}

	public PlayerGroupDeltaEncodingKey(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
