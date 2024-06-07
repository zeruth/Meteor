package com.jagex.graphics;

import deob.ObfuscatedName;

public class TextureTramsformType {

    public static final TextureTramsformType DISABLE = new TextureTramsformType(5);

    public static final TextureTramsformType COUNT1 = new TextureTramsformType(3);

    public static final TextureTramsformType COUNT2 = new TextureTramsformType(0);

    public static final TextureTramsformType COUNT3 = new TextureTramsformType(1);

    public static final TextureTramsformType COUNT4 = new TextureTramsformType(2);

    public static final TextureTramsformType PROJECTED = new TextureTramsformType(4);

    public final int index;

	public TextureTramsformType(int index) {
		this.index = index;
	}
}
