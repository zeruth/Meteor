package com.jagex.game.client;

import com.jagex.core.datastruct.Link;
import com.jagex.core.datastruct.LinkQueue;
import deob.ObfuscatedName;
import rs2.client.scene.entities.PathingEntity;

public class CoverMarkerClickbox extends Link {

    public static LinkQueue field11198 = new LinkQueue();

    public static int field11196 = 0;

    public PathingEntity field11197;

    public int field11199;

    public int field11195;

    public int field11200;

    public int field11201;

    public static CoverMarkerClickbox method14429() {
		CoverMarkerClickbox var0 = (CoverMarkerClickbox) field11198.pollFront();
		if (var0 == null) {
			return new CoverMarkerClickbox();
		} else {
			field11196--;
			return var0;
		}
	}

    public static void method3032(CoverMarkerClickbox arg0) {
		arg0.field11197 = null;
		if (field11196 < 20) {
			field11198.pushBack(arg0);
			field11196++;
		}
	}
}
