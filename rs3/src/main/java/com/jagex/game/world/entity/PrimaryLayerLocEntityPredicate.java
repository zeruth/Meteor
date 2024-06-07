package com.jagex.game.world.entity;

import com.jagex.graphics.scenegraph.PrimaryLayerEntity;


public final class PrimaryLayerLocEntityPredicate implements PrimaryLayerEntityPredicate {

    public boolean method478(PrimaryLayerEntity arg0) {
		return arg0 instanceof Location && ((Location) arg0).method8207();
	}
}
