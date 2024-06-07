package com.jagex.game.world.entity;

import com.jagex.graphics.scenegraph.GroundDecorLayerEntity;
import com.jagex.graphics.scenegraph.ObjLayerEntity;
import com.jagex.graphics.scenegraph.WallDecorLayerEntity;
import com.jagex.graphics.scenegraph.WallLayerEntity;
import deob.ObfuscatedName;

public class Tile {

    public byte level;

    public Tile bridge;

    public WallLayerEntity wall;

    public WallLayerEntity dynamicWall;

    public WallDecorLayerEntity wallDecoration;

    public WallDecorLayerEntity dynamicWallDecoration;

    public GroundDecorLayerEntity groundDecoration;

    public ObjLayerEntity objStack;

    public PrimaryLayerEntityList entities;

    public short field6973;

    public short field6969;

    public short field6975;

    public short field6972;

	public Tile(int level) {
		this.level = (byte) level;
	}
}
