package com.jagex.game.config.enumtype;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.Cp1252;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

import java.util.*;
import java.util.Map.Entry;

public class EnumType implements ConfigType, MutableConfig {

    public ScriptVarType inputtype;

    public ScriptVarType outputtype;

    public String defaultString = "null";

    public int defaultInt;

    public Map values;

    public Object[] field8780;

    public int valuesCount = 0;

    public java.util.HashMap field8782;

    public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

    public void decode(Packet buf, int code) {
		if (code == 1) {
			char var3 = Cp1252.byteToCp1252Char(buf.g1b());
			this.inputtype = ScriptVarType.getByLegacyChar(var3);
		} else if (code == 2) {
			char var4 = Cp1252.byteToCp1252Char(buf.g1b());
			this.outputtype = ScriptVarType.getByLegacyChar(var4);
		} else if (code == 3) {
			this.defaultString = buf.gjstr();
		} else if (code == 4) {
			this.defaultInt = buf.g4s();
		} else if (code == 5 || code == 6) {
			this.valuesCount = buf.g2();
			this.values = new java.util.HashMap(this.valuesCount);
			for (int var8 = 0; var8 < this.valuesCount; var8++) {
				int var9 = buf.g4s();
				Object var10;
				if (code == 5) {
					var10 = buf.gjstr();
				} else {
					var10 = Integer.valueOf(buf.g4s());
				}
				this.values.put(Integer.valueOf(var9), var10);
			}
		} else if (code == 7 || code == 8) {
			int var5 = buf.g2();
			this.valuesCount = buf.g2();
			this.field8780 = new Object[var5];
			for (int var6 = 0; var6 < this.valuesCount; var6++) {
				int var7 = buf.g2();
				if (code == 7) {
					this.field8780[var7] = buf.gjstr();
				} else {
					this.field8780[var7] = Integer.valueOf(buf.g4s());
				}
			}
		} else if (code == 101) {
			this.inputtype = (ScriptVarType) SerializableEnums.decode(ScriptVarType.values(), buf.gSmart1or2());
		} else if (code == 102) {
			this.outputtype = (ScriptVarType) SerializableEnums.decode(ScriptVarType.values(), buf.gSmart1or2());
		}
	}

    public int getValueInt(int arg0) {
		Object var2 = this.method14850(arg0);
		return var2 == null ? this.defaultInt : (Integer) var2;
	}

    public String getValueString(int arg0) {
		Object var2 = this.method14850(arg0);
		return var2 == null ? this.defaultString : (String) var2;
	}

    public Object method14850(int arg0) {
		if (this.field8780 == null) {
			return this.values == null ? null : this.values.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.field8780.length) {
			return this.field8780[arg0];
		} else {
			return null;
		}
	}

    public boolean hasOutputString(Object arg0) {
		if (this.valuesCount == 0) {
			return false;
		} else {
			if (this.field8782 == null) {
				this.method14853();
			}
			return this.field8782.containsKey(arg0);
		}
	}

    public int[] method14867(Object arg0) {
		if (this.valuesCount == 0) {
			return null;
		} else {
			if (this.field8782 == null) {
				this.method14853();
			}
			return (int[]) this.field8782.get(arg0);
		}
	}

    public int getOutputCount() {
		return this.valuesCount;
	}

    public void method14853() {
		java.util.HashMap var1 = new java.util.HashMap();
		if (this.field8780 == null) {
			if (this.values == null) {
				throw new IllegalStateException();
			}
			Iterator var5 = this.values.entrySet().iterator();
			while (var5.hasNext()) {
				Entry var6 = (Entry) var5.next();
				Object var7 = var6.getValue();
				List var8 = (List) var1.get(var7);
				if (var8 == null) {
					var8 = new LinkedList();
					var1.put(var7, var8);
				}
				var8.add(var6.getKey());
			}
		} else {
			for (int var2 = 0; var2 < this.field8780.length; var2++) {
				if (this.field8780[var2] != null) {
					Object var3 = this.field8780[var2];
					List var4 = (List) var1.get(var3);
					if (var4 == null) {
						var4 = new LinkedList();
						var1.put(var3, var4);
					}
					var4.add(Integer.valueOf(var2));
				}
			}
		}
		this.field8782 = new java.util.HashMap();
		Iterator var9 = var1.entrySet().iterator();
		while (var9.hasNext()) {
			Entry var10 = (Entry) var9.next();
			List var11 = (List) var10.getValue();
			int[] var12 = new int[var11.size()];
			int var13 = 0;
			Iterator var14 = var11.iterator();
			while (var14.hasNext()) {
				Integer var15 = (Integer) var14.next();
				var12[var13++] = var15;
			}
			if (this.field8780 == null) {
				Arrays.sort(var12);
			}
			this.field8782.put(var10.getKey(), var12);
		}
	}

    public void postDecode() {
	}

    public void setId(int arg0) {
	}
}
