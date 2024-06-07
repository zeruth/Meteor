package com.jagex.game.world.entity;

import com.jagex.graphics.AnimationNode;

import rs2.client.scene.entities.PathingEntity;

public class EntitySpotAnim {

    public final AnimationNode field6659;

    public int field6657 = -1;

    public int field6661;

    public int field6660;

    public int field6658;

	public EntitySpotAnim(PathingEntity arg0) {
		this.field6659 = new EntityAnimationNode(arg0, false);
	}
}
