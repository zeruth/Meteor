package com.jagex.game.config.defaults;



public class DefaultsGroup {

    public static final DefaultsGroup MAP = new DefaultsGroup(1);

    public static final DefaultsGroup UNKNOWN = new DefaultsGroup(2);

    public static final DefaultsGroup GRAPHICS = new DefaultsGroup(3);

    public static final DefaultsGroup AUDIO = new DefaultsGroup(4);

    public static final DefaultsGroup MICROTRANSACTION = new DefaultsGroup(5);

    public static final DefaultsGroup WEARPOS = new DefaultsGroup(6);

    public static final DefaultsGroup MENU = new DefaultsGroup(7);

    public static final DefaultsGroup CUTSCENE = new DefaultsGroup(8);

    public static final DefaultsGroup SKILL = new DefaultsGroup(9);

    public static final DefaultsGroup WORLDMAP = new DefaultsGroup(10);

    public static final DefaultsGroup TITLE = new DefaultsGroup(12);

    public final int js5GroupId;

	public DefaultsGroup(int id) {
		this.js5GroupId = id;
	}
}
