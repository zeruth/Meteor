package com.jagex.game.world;



public class WorldMapUpperLevelTileData {

    public byte field6774;

    public byte field6769;

    public int field6770;

    public short field6768;

    public byte field6772;

    public int[] field6773;

    public byte[] field6771;

	public WorldMapUpperLevelTileData(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6) {
		this.field6774 = (byte) arg0;
		this.field6769 = (byte) arg1;
		this.field6770 = arg2;
		this.field6768 = (short) arg3;
		this.field6772 = (byte) arg4;
		this.field6773 = arg5;
		this.field6771 = arg6;
	}
}
