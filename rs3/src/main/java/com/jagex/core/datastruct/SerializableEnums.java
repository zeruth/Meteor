package com.jagex.core.datastruct;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.io.Packet;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SerializableEnums {

    public static Map cache = new HashMap();

	public SerializableEnums() throws Throwable {
		throw new Error();
	}

    public static SerializableEnum decode(Class arg0, int arg1) {
		Map var2 = cache;
		synchronized (cache) {
			Map var3 = (Map) cache.get(arg0);
			if (var3 == null) {
				var3 = new HashMap();
				SerializableEnum[] var4 = (SerializableEnum[]) arg0.getEnumConstants();
				for (int var5 = 0; var5 < var4.length; var5++) {
					SerializableEnum var6 = var4[var5];
					var3.put(var6.getId(), var6);
				}
				cache.put(arg0, var3);
			}
			return (SerializableEnum) var3.get(arg1);
		}
	}

    public static SerializableEnum decode(SerializableEnum[] arg0, int arg1) {
		SerializableEnum[] var2 = arg0;
		for (int var3 = 0; var3 < var2.length; var3++) {
			SerializableEnum var4 = var2[var3];
			if (arg1 == var4.getId()) {
				return var4;
			}
		}
		return null;
	}

    public static void encodeSet(Iterable arg0, Packet arg1) {
		int var2 = computeSetSize(arg0);
		arg1.pSmart1or2s(var2);
		if (var2 == 0) {
			return;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			arg1.data[arg1.pos + var3] = 0;
		}
		Iterator var4 = arg0.iterator();
		while (var4.hasNext()) {
			SerializableEnum var5 = (SerializableEnum) var4.next();
			int var6 = var5.getId();
			int var7 = var6 / 8;
			arg1.data[arg1.pos + var7] = (byte) (arg1.data[arg1.pos + var7] | 0x1 << (var6 & 0x7));
		}
		arg1.pos += var2;
	}

    public static int computeSetSize(Iterable arg0) {
		int var1 = -1;
		Iterator var2 = arg0.iterator();
		while (var2.hasNext()) {
			SerializableEnum var3 = (SerializableEnum) var2.next();
			if (var3.getId() > var1) {
				var1 = var3.getId();
			}
		}
		return (var1 + 8) / 8;
	}
}
