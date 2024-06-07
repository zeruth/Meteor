package com.jagex.js5;



public class Js5MapFile {

    public static final Js5MapFile LOC = new Js5MapFile(0);

    public static final Js5MapFile UNDERWATER_LOC = new Js5MapFile(1);

    public static final Js5MapFile NPC = new Js5MapFile(2);

    public static final Js5MapFile LAND = new Js5MapFile(3);

    public static final Js5MapFile UNDERWATER_LAND = new Js5MapFile(4);

    public static final Js5MapFile NXT_LOC = new Js5MapFile(5);

    public static final Js5MapFile ENVIRONMENT = new Js5MapFile(6);

    public static final Js5MapFile STATIC_POINTLIGHTS = new Js5MapFile(7);

    public static final Js5MapFile WATER = new Js5MapFile(8);

    public final int id;

	public Js5MapFile(int id) {
		this.id = id;
	}
}
