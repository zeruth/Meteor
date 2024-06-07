package com.jagex.game.config;

import deob.ObfuscatedName;

public class Js5Archive {

    public static final Js5Archive ANIMS = new Js5Archive(0, "", false, false, false);

    public static final Js5Archive BASES = new Js5Archive(1, "", false, false, false);

    public static final Js5Archive CONFIG = new Js5Archive(2, "", true, false, false);

    public static final Js5Archive INTERFACES = new Js5Archive(3, "", true, false, false);

    public static final Js5Archive MAPS = new Js5Archive(5, "", false, false, false);

    public static final Js5Archive MODELS = new Js5Archive(7, "", false, false, false);

    public static final Js5Archive SPRITES = new Js5Archive(8, "", false, false, false);

    public static final Js5Archive BINARY = new Js5Archive(10, "", false, false, false);

    public static final Js5Archive CLIENTSCRIPTS = new Js5Archive(12, "", true, false, false);

    public static final Js5Archive FONTMETRICS = new Js5Archive(13, "", false, false, false);

    public static final Js5Archive VORBIS = new Js5Archive(14, "", false, false, false);

    public static final Js5Archive CONFIG_LOC = new Js5Archive(16, "", true, false, false);

    public static final Js5Archive CONFIG_ENUM = new Js5Archive(17, "", true, false, false);

    public static final Js5Archive CONFIG_NPC = new Js5Archive(18, "", true, false, false);

    public static final Js5Archive CONFIG_OBJ = new Js5Archive(19, "", true, false, false);

    public static final Js5Archive CONFIG_SEQ = new Js5Archive(20, "", true, false, false);

    public static final Js5Archive CONFIG_SPOT = new Js5Archive(21, "", true, false, false);

    public static final Js5Archive CONFIG_STRUCT = new Js5Archive(22, "", true, false, false);

    public static final Js5Archive WORLDMAP = new Js5Archive(23, "", true, false, false);

    public static final Js5Archive QUICKCHAT = new Js5Archive(24, "", true, false, false);

    public static final Js5Archive QUICKCHAT_GLOBAL = new Js5Archive(25, "", true, false, false);

    public static final Js5Archive MATERIALS = new Js5Archive(26, "", false, false, false);

    public static final Js5Archive CONFIG_PARTICLE = new Js5Archive(27, "", false, false, false);

    public static final Js5Archive DEFAULTS = new Js5Archive(28, "", false, false, false);

    public static final Js5Archive CONFIG_BILLBOARD = new Js5Archive(29, "", false, false, false);

    public static final Js5Archive DLLS = new Js5Archive(30, "", false, false, false);

    public static final Js5Archive SHADERS = new Js5Archive(31, "", false, false, false);

    public static final Js5Archive LOADING_SPRITES = new Js5Archive(32, "", false, false, false);

    public static final Js5Archive LOADING_SCREENS = new Js5Archive(33, "", true, false, false);

    public static final Js5Archive LOADING_SPRITES_RAW = new Js5Archive(34, "", false, false, false);

    public static final Js5Archive CUTSCENES = new Js5Archive(35, "", true, false, false);

    public static final Js5Archive AUDIOSTREAMS = new Js5Archive(40, "", false, false, true);

    public static final Js5Archive WORLDMAPAREADATA = new Js5Archive(41, "", false, false, false);

    public static final Js5Archive WORLDMAPLABELS = new Js5Archive(42, "", false, false, false);

    public static final Js5Archive MODELSRT7 = new Js5Archive(47, "", false, true, false);

    public static final Js5Archive ANIMSRT7 = new Js5Archive(48, "", false, true, false);

    public static final Js5Archive DBTABLEINDEX = new Js5Archive(49, "", true, true, false);

    public static final Js5Archive TEXTURES_DXT = new Js5Archive(52, "", false, true, false);

    public static final Js5Archive TEXTURES_PNG = new Js5Archive(53, "", false, true, false);

    public static final Js5Archive TEXTURES_PNG_MIPPED = new Js5Archive(54, "", false, true, false);

    public static final Js5Archive TEXTURES_ETC = new Js5Archive(55, "", false, true, false);

    public static final Js5Archive ANIMS_KEYFRAMES = new Js5Archive(56, "", false, false, false);

    public final int archiveId;

    public final boolean field8841;

    public static int requiredArrayLength = -1;

    public static Js5Archive[] values() {
		return new Js5Archive[] {ANIMS, BASES, CONFIG, INTERFACES, MAPS, MODELS, SPRITES, BINARY, CLIENTSCRIPTS, FONTMETRICS, VORBIS, CONFIG_LOC, CONFIG_ENUM, CONFIG_NPC, CONFIG_OBJ, CONFIG_SEQ, CONFIG_SPOT, CONFIG_STRUCT, WORLDMAP, QUICKCHAT, QUICKCHAT_GLOBAL, MATERIALS, CONFIG_PARTICLE, DEFAULTS, CONFIG_BILLBOARD, DLLS, SHADERS, LOADING_SPRITES, LOADING_SCREENS, LOADING_SPRITES_RAW, CUTSCENES, AUDIOSTREAMS, WORLDMAPAREADATA, WORLDMAPLABELS, MODELSRT7, ANIMSRT7, DBTABLEINDEX, TEXTURES_DXT, TEXTURES_PNG, TEXTURES_PNG_MIPPED, TEXTURES_ETC, ANIMS_KEYFRAMES};
	}

	public Js5Archive(int arg0, String arg1, boolean arg2, boolean arg3, boolean arg4) {
		this.archiveId = arg0;
		this.field8841 = arg4;
	}

    public int getArchiveId() {
		return this.archiveId;
	}

    public boolean method14918() {
		return this.field8841;
	}

    public static int getRequiredArrayLength() {
		if (requiredArrayLength == -1) {
			Js5Archive[] var0 = values();
			for (int var1 = 0; var1 < var0.length; var1++) {
				Js5Archive var2 = var0[var1];
				if (var2.archiveId > requiredArrayLength) {
					requiredArrayLength = var2.archiveId;
				}
			}
			requiredArrayLength++;
		}
		return requiredArrayLength;
	}
}
