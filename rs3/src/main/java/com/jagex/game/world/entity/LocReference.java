package com.jagex.game.world.entity;

import com.jagex.game.shared.movement.CoordGrid;

import rs2.client.Client;

public class LocReference {

    public final CoordGrid field8196;

    public final int shape;

    public final int field8197;

	public LocReference(CoordGrid arg0, int shape, int angle, int arg3) {
		this.field8196 = arg0;
		this.shape = shape;
		this.field8197 = arg3;
	}

    public int getLocLayer() {
		return Client.locShapeToLayer[this.shape];
	}

    public Location method10760() {
		Location var1 = this.method10761();
		if (var1 == null) {
			return null;
		} else if (var1.getId() == this.field8197) {
			return var1;
		} else {
			return null;
		}
	}

    public Location method10761() {
		int var1 = this.field8196.level;
		CoordGrid var2 = Client.world.getBase();
		int var3 = this.field8196.x - var2.x;
		int var4 = this.field8196.z - var2.z;
		if (var3 < 0 || var4 < 0 || var3 >= Client.world.getSizeX() || var4 >= Client.world.getSizeZ() || Client.world.getScene() == null) {
			return null;
		}
		switch(this.getLocLayer()) {
			case 0:
				return (Location) Client.world.getScene().getWall(var1, var3, var4);
			case 1:
				return (Location) Client.world.getScene().getWallDecoration(var1, var3, var4);
			case 2:
				return (Location) Client.world.getScene().getEntity(var1, var3, var4, Client.field11001);
			case 3:
				return (Location) Client.world.getScene().getGroundDecoration(var1, var3, var4);
			default:
				return null;
		}
	}
}
