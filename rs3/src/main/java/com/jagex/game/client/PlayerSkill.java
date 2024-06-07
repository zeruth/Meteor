package com.jagex.game.client;

import deob.ObfuscatedName;

public class PlayerSkill {

    public final int id;

    public final int maxLevel;

    public boolean members;

    public final int cappedXP;

    public final int cappedLevel;

    public final PlayerSkillXPTable table;

    public final int baseLevel;

	public PlayerSkill(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, PlayerSkillXPTable arg5, int arg6) {
		this.id = arg0;
		this.maxLevel = arg1;
		this.members = arg2;
		this.table = arg5;
		this.baseLevel = arg6;
		if (arg2) {
			this.cappedLevel = arg4;
			this.cappedXP = this.getXPRaw(arg4);
		} else {
			this.cappedLevel = -1;
			this.cappedXP = -1;
		}
	}

    public int getId() {
		return this.id;
	}

    public boolean isMembers() {
		return this.members;
	}

    public int getCappedXP() {
		return this.cappedXP;
	}

    public int getCappedLevel() {
		return this.cappedLevel;
	}

    public boolean isCapped() {
		return this.cappedXP != -1;
	}

    public int getLevel(int arg0) {
		int var2 = this.table.getLevel(arg0) + this.baseLevel;
		return var2 > this.maxLevel ? this.maxLevel : var2;
	}

    public int getLevelRaw(int arg0) {
		int var2 = arg0 / 10;
		return this.getLevel(var2);
	}

    public int getXP(int arg0) {
		if (arg0 > this.maxLevel) {
			arg0 = this.maxLevel;
		}
		return this.table.getXP(arg0 - this.baseLevel);
	}

    public int getXPRaw(int arg0) {
		return this.getXP(arg0) * 10;
	}
}
