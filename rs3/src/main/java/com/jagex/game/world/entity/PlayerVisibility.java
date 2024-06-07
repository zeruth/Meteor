package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;


public class PlayerVisibility implements SerializableEnum {

    public static final PlayerVisibility VISIBLE = new PlayerVisibility(0);

    public static final PlayerVisibility HIDDEN = new PlayerVisibility(1);

    public static final PlayerVisibility MINIMAP = new PlayerVisibility(2);

    public final int serialID;

    public static PlayerVisibility[] values() {
		return new PlayerVisibility[] {VISIBLE, HIDDEN, MINIMAP};
	}

	public PlayerVisibility(int serialID) {
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}

    public boolean isHidden() {
		return HIDDEN == this;
	}

    public boolean isNotVisible() {
		return VISIBLE != this;
	}
}
