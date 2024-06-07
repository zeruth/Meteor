package com.jagex.game.telemetry.grid;

import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.List;

public class TelemetryGrid {

    public final List field1879 = new ArrayList();

    public int getGroupCount() {
		return this.field1879.size();
	}

    public int getGroupIndex(int arg0) {
		for (int var2 = 0; var2 < this.field1879.size(); var2++) {
			if (((TelemetryGroup) this.field1879.get(var2)).id == arg0) {
				return var2;
			}
		}
		return -1;
	}

    public TelemetryGroup getGroup(int arg0) {
		return (TelemetryGroup) this.field1879.get(arg0);
	}

    public int method3270(TelemetryGroup arg0) {
		return this.addGroup(arg0, -1);
	}

    public int addGroup(TelemetryGroup arg0, int arg1) {
		if (this.field1879.size() == 5) {
			throw new RuntimeException("");
		} else if (this.getGroupIndex(arg0.id) == -1) {
			if (arg1 == -1) {
				arg1 = this.field1879.size();
			}
			this.field1879.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

    public void removeGroup(int arg0) {
		this.field1879.remove(arg0);
	}

    public void method3273() {
		this.field1879.clear();
	}
}
