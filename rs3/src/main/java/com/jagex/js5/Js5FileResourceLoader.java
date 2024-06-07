package com.jagex.js5;

import com.jagex.game.client.LoadableResourceType;
import com.jagex.game.client.ResourceLoader;


public class Js5FileResourceLoader implements ResourceLoader {

    public final Js5 js5;

    public final String fileName;

	public Js5FileResourceLoader(Js5 js5, String fileName) {
		this.js5 = js5;
		this.fileName = fileName;
	}

    public int getPercentageComplete() {
		return this.js5.method6908(this.fileName) ? 100 : 0;
	}

    public LoadableResourceType getLoadableResourceType() {
		return LoadableResourceType.JS5_FILE;
	}
}
