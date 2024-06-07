package com.jagex.js5;

import com.jagex.game.client.LoadableResourceType;
import com.jagex.game.client.ResourceLoader;


public class Js5GroupResourceLoader implements ResourceLoader {

    public final Js5 js5;

    public final int group;

	public Js5GroupResourceLoader(Js5 js5, int group) {
		this.js5 = js5;
		this.group = group;
	}

    public int getPercentageComplete() {
		return this.js5.isGroupReady(this.group) ? 100 : this.js5.getPercentageComplete(this.group);
	}

    public LoadableResourceType getLoadableResourceType() {
		return LoadableResourceType.JS5_GROUP;
	}
}
