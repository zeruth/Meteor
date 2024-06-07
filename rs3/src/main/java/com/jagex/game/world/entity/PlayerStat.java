package com.jagex.game.world.entity;

import com.jagex.core.constants.ModeAccountType;
import com.jagex.game.client.PlayerSkill;


public class PlayerStat {

    public final PlayerSkill skill;

    public final boolean raw;

    public int xp = 0;

    public int xpLevel = 1;

    public int level = 1;

	public PlayerStat(PlayerSkill arg0, boolean arg1) {
		this.skill = arg0;
		this.raw = arg1;
	}

    public int getXP() {
		return this.xp;
	}

    public int getCappedXP(ModeAccountType arg0) {
		if (ModeAccountType.FREE == arg0 && this.skill.isMembers() && this.skill.isCapped()) {
			int var2 = this.skill.getCappedXP();
			if (!this.raw) {
				var2 /= 10;
			}
			if (this.xp > var2) {
				return var2;
			}
		}
		return this.xp;
	}

    public void setXP(int arg0) {
		this.xp = arg0;
		if (this.xp < 0) {
			this.xp = 0;
		} else if (this.raw && this.xp > 2000000000) {
			this.xp = 2000000000;
		} else if (!this.raw && this.xp > 200000000) {
			this.xp = 200000000;
		}
		this.recalculateXPLevel();
	}

    public int getXPLevel() {
		return this.xpLevel;
	}

    public int getCappedXPLevel(ModeAccountType arg0) {
		if (ModeAccountType.FREE == arg0 && this.skill.isMembers() && this.skill.isCapped()) {
			int var2 = this.skill.getCappedLevel();
			if (this.xpLevel > var2) {
				return var2;
			}
		}
		return this.xpLevel;
	}

    public int getLevel() {
		return this.level;
	}

    public void setLevel(int arg0) {
		this.level = arg0;
	}

    public void recalculateXPLevel() {
		if (this.raw) {
			this.xpLevel = this.skill.getLevelRaw(this.xp);
		} else {
			this.xpLevel = this.skill.getLevel(this.xp);
		}
	}
}
