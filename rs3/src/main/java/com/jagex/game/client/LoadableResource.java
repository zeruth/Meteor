package com.jagex.game.client;

import deob.ObfuscatedName;

public class LoadableResource {

    public static final LoadableResource JS5_DEFAULTS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource DLL_JACLIB = new LoadableResource(LoadableResourceType.DLL);

    public static final LoadableResource DLL_JAGGL = new LoadableResource(LoadableResourceType.DLL);

    public static final LoadableResource DLL_JAGDX = new LoadableResource(LoadableResourceType.DLL);

    public static final LoadableResource DLL_SW3D = new LoadableResource(LoadableResourceType.DLL);

    public static final LoadableResource DLL_SETUP_EXE = new LoadableResource(LoadableResourceType.DLL);

    public static final LoadableResource DLL_HW3D = new LoadableResource(LoadableResourceType.DLL);

    public static final LoadableResource JS5_SHADERS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_MATERIALS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_LOC = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_ENUM = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_NPC = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_OBJ = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_SEQ = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_SPOT = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_STRUCT = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_DBTABLE_INDEX = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_QUICK_CHAT = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_QUICK_CHAT_GLOBAL = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_PARTICLE = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CONFIG_BILLBOARD = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_BINARY_HUFFMAN = new LoadableResource(LoadableResourceType.JS5_FILE);

    public static final LoadableResource JS5_INTERFACES = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_CLIENTSCRIPTS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_FONT_METRICS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

    public static final LoadableResource JS5_WORLD_MAP_DATA = new LoadableResource(LoadableResourceType.JS5_GROUP);

    public final LoadableResourceType resourceType;

    public int length;

    public ResourceLoader resourceLoader;

    public static LoadableResource[] values() {
		return new LoadableResource[] {JS5_DEFAULTS, DLL_JACLIB, DLL_JAGGL, DLL_JAGDX, DLL_SW3D, DLL_SETUP_EXE, DLL_HW3D, JS5_SHADERS, JS5_MATERIALS, JS5_CONFIG, JS5_CONFIG_LOC, JS5_CONFIG_ENUM, JS5_CONFIG_NPC, JS5_CONFIG_OBJ, JS5_CONFIG_SEQ, JS5_CONFIG_SPOT, JS5_CONFIG_STRUCT, JS5_DBTABLE_INDEX, JS5_QUICK_CHAT, JS5_QUICK_CHAT_GLOBAL, JS5_CONFIG_PARTICLE, JS5_CONFIG_BILLBOARD, JS5_BINARY_HUFFMAN, JS5_INTERFACES, JS5_CLIENTSCRIPTS, JS5_FONT_METRICS, JS5_WORLD_MAP_DATA};
	}

	public LoadableResource(LoadableResourceType resourceType) {
		this.resourceType = resourceType;
		this.length = 1;
	}

    public int getLength() {
		return this.length;
	}

    public void setLength(int length) {
		this.length = length;
	}

    public ResourceLoader getResourceLoader() {
		return this.resourceLoader;
	}

    public void setResourceLoader(ResourceLoader resourceLoader) {
		if (resourceLoader.getLoadableResourceType() != this.resourceType) {
			throw new IllegalArgumentException();
		}
		this.resourceLoader = resourceLoader;
	}
}
