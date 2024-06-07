package com.jagex.game.client;



public abstract class MapBuildStuck {

    public final int field8870;

    public final int field8863;

    public final int field8864;

    public final int field8865;

    public final int field8866;

    public final int field8862;

    public final boolean field8867;

    public final boolean field8869;

    public final int field8868;

	public MapBuildStuck(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8) {
		this.field8870 = arg0;
		this.field8863 = arg1;
		this.field8864 = arg2 > 65535 ? 65535 : arg2;
		this.field8865 = arg3;
		this.field8866 = arg4 > 255 ? 255 : arg4;
		this.field8862 = arg5;
		this.field8867 = arg6;
		this.field8869 = arg7;
		this.field8868 = arg8;
	}
}
