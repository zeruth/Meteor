package com.jagex.game.world.entity;

import com.jagex.game.client.RebuildRequest;
import com.jagex.game.client.RebuildType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.scene.World;

import rs2.client.Client;

import java.util.LinkedList;

public class AsyncRebuild implements Runnable {

    public volatile boolean field5002 = false;

    public LinkedList field5003 = new LinkedList();

    public World field5004 = new World(true);

    public void method7674(LocTypeList arg0) {
		this.field5004.method7733(arg0);
	}

    public void method7680(RebuildRequest arg0) {
		LinkedList var2 = this.field5003;
		synchronized (this.field5003) {
			this.field5003.add(arg0);
			this.field5003.notify();
		}
	}

    public boolean method7676() {
		return this.field5002;
	}

    public World method7677() {
		return this.field5004;
	}

    public void method7678(World arg0) {
		this.field5004 = arg0;
	}

	public void run() {
		while (true) {
			this.method7688();
		}
	}

    public void method7688() {
		Object var1 = null;
		LinkedList var2 = this.field5003;
		RebuildRequest var4;
		synchronized (this.field5003) {
			try {
				this.field5003.wait();
			} catch (InterruptedException var14) {
			}
			var4 = (RebuildRequest) this.field5003.pollFirst();
		}
		try {
			if (var4 != null) {
				this.field5002 = true;
				this.method7689(var4);
			}
		} catch (Exception var12) {
		} finally {
			this.field5002 = false;
		}
	}

    public void method7689(RebuildRequest arg0) {
		if (RebuildType.field5070 == arg0.rebuildType) {
			this.field5004.rebuild();
		} else {
			this.field5004.rebuildMap(arg0);
		}
		for (boolean var2 = this.field5004.rebuildScene(); !var2; var2 = this.field5004.rebuildScene()) {
		}
		this.field5004.completeRebuild();
		Client.world.completeRebuild();
	}
}
