package com.jagex.js5;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.ArchiveUtil;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ConfigTypeListPreload implements ConfigTypeList {

    public final ConfigTypeFactory factory;

    public final Js5ConfigGroup configGroup;

    public final Js5 configClient;

    public int num;

    public ConfigType field8844;

    public ConfigType[] preloaded;

	public ConfigTypeListPreload(ModeGame arg0, Language arg1, Js5ConfigGroup configGroup, Js5 configClient, ConfigTypeFactory factory, boolean preload) {
		this.factory = factory;
		this.configGroup = configGroup;
		this.configClient = configClient;
		this.num = ArchiveUtil.getArchiveSize(this.configClient, this.configGroup);
		this.preloaded = (ConfigType[]) Array.newInstance(this.factory.type(), this.num);
		if (preload) {
			for (int index = 0; index < this.num; index++) {
				this.list_uncached(index);
			}
		}
	}

    public ConfigType list(int id) {
		if (id < 0) {
			if (this.field8844 == null) {
				this.field8844 = this.factory.create(-1, this);
			}
			return this.field8844;
		} else {
			if (this.preloaded[id] == null) {
				this.list_uncached(id);
			}
			return this.preloaded[id];
		}
	}

    public void list_uncached(int id) {
		if (this.preloaded[id] != null) {
			return;
		}
		try {
			this.preloaded[id] = this.factory.create(id, this);
		} catch (Exception var5) {
			var5.printStackTrace();
			return;
		}
		Object var3 = null;
		byte[] bytes = ArchiveUtil.getFile(this.configClient, this.configGroup, id);
		if (bytes != null) {
			this.preloaded[id].decode(new Packet(bytes));
		}
		this.preloaded[id].postDecode();
	}

	// line 59
    public int length() {
		return this.preloaded.length;
	}

	// line 63
	public Iterator iterator() {
		return new ConfigTypeListPreloadIterator(this);
	}

    public static class ConfigTypeListPreloadIterator implements Iterator {

		// $FF: synthetic field
		public final ConfigTypeListPreload this$0;

        public int field8850;

		// line 63
		public ConfigTypeListPreloadIterator(ConfigTypeListPreload arg0) {
			this.this$0 = arg0;
		}

		public boolean hasNext() {
			return this.field8850 < this.this$0.preloaded.length;
		}

		public Object next() {
			return this.this$0.preloaded[++this.field8850 - 1];
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
