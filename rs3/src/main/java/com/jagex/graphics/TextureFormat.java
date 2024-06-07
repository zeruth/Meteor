package com.jagex.graphics;

import deob.ObfuscatedName;

public class TextureFormat {

    public static final TextureFormat RGB = new TextureFormat(2, 3);

    public static final TextureFormat RGBA = new TextureFormat(4, 4);

    public static final TextureFormat ALPHA = new TextureFormat(6, 1);

    public static final TextureFormat LUMINANCE = new TextureFormat(7, 1);

    public static final TextureFormat ALPHA_LUMINANCE = new TextureFormat(3, 2);

    public static final TextureFormat DEPTH = new TextureFormat(0, 1);

    public static final TextureFormat field1274 = new TextureFormat(9, 3);

    public static final TextureFormat field1269 = new TextureFormat(5, 4);

    public static final TextureFormat COMPRESSED_RGBA_S3TC_DXT1 = new TextureFormat(1, 1);

    public static final TextureFormat COMPRESSED_RGBA_S3TC_DXT5 = new TextureFormat(8, 1);

    public final int index;

    public final int id;

	public TextureFormat(int index, int id) {
		this.index = index;
		this.id = id;
	}
}
