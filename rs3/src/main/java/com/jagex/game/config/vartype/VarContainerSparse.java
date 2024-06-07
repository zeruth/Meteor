package com.jagex.game.config.vartype;

import com.jagex.core.utils.VarValue;
import com.jagex.game.client.DefaultVarValueProvider;
import deob.ObfuscatedName;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VarContainerSparse implements VarContainer {

    public Map field8740;

    public final DefaultVarValueProvider field8739;

	public VarContainerSparse(DefaultVarValueProvider arg0) {
		this.field8739 = arg0;
	}

    public int getVarValueInt(int id) {
		if (this.field8740 != null) {
			VarValue var2 = (VarValue) this.field8740.get(id);
			if (var2 != null) {
				return (Integer) var2.value;
			}
		}
		return (Integer) this.field8739.getDefaultValue(id);
	}

    public void setVarValueInt(int id, int value) {
		if (this.field8740 == null) {
			this.field8740 = new HashMap();
			this.field8740.put(id, new VarValue(id, value));
			return;
		}
		VarValue var3 = (VarValue) this.field8740.get(id);
		if (var3 == null) {
			this.field8740.put(id, new VarValue(id, value));
		} else {
			var3.value = value;
		}
	}

    public long getVarValueLong(int id) {
		if (this.field8740 != null) {
			VarValue var2 = (VarValue) this.field8740.get(id);
			if (var2 != null) {
				return (Long) var2.value;
			}
		}
		return (Long) this.field8739.getDefaultValue(id);
	}

    public void setVarValueLong(int id, long value) {
		if (this.field8740 == null) {
			this.field8740 = new HashMap();
			this.field8740.put(id, new VarValue(id, value));
			return;
		}
		VarValue var4 = (VarValue) this.field8740.get(id);
		if (var4 == null) {
			this.field8740.put(id, new VarValue(id, value));
		} else {
			var4.value = value;
		}
	}

    public Object getVarValue(int id) {
		if (this.field8740 != null) {
			VarValue var2 = (VarValue) this.field8740.get(id);
			if (var2 != null) {
				return var2.value;
			}
		}
		return this.field8739.getDefaultValue(id);
	}

    public void setVarValue(int id, Object value) {
		if (this.field8740 == null) {
			this.field8740 = new HashMap();
			this.field8740.put(id, new VarValue(id, value));
			return;
		}
		VarValue var3 = (VarValue) this.field8740.get(id);
		if (var3 == null) {
			this.field8740.put(id, new VarValue(id, value));
		} else {
			var3.value = value;
		}
	}

    public void clear() {
		if (this.field8740 != null) {
			this.field8740.clear();
		}
	}

    public void method14734(int id) {
		if (this.field8740 != null) {
			this.field8740.remove(id);
		}
	}

	public Iterator iterator() {
		return this.field8740 == null ? Collections.emptyList().iterator() : this.field8740.values().iterator();
	}
}
