package com.jagex.game.client;


import jaclib.ping.IcmpService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NativeMouse extends IcmpService {

	public static volatile NativeMouse field11719;

	public final List field11718 = new ArrayList();

	public static void method17426(NativeMouseListener arg0) {
		if (field11719 == null) {
			throw new IllegalStateException("");
		}
		field11719.field11718.add(arg0);
	}

	public static boolean method5216() {
		try {
			if (!available()) {
				return false;
			}
		} catch (Throwable var2) {
			return false;
		}
		if (field11719 != null) {
			throw new IllegalStateException("");
		}
		field11719 = new NativeMouse();
		Thread var1 = new Thread(new NativeMouseTask());
		var1.setDaemon(true);
		var1.start();
		return true;
	}

	public static void method13850() {
		if (field11719 == null) {
			return;
		}
		try {
			field11719.quit();
		} catch (Throwable var1) {
		}
		field11719 = null;
	}

    public void notify(int arg0) {
		Iterator var2 = this.field11718.iterator();
		while (var2.hasNext()) {
			NativeMouseListener var3 = (NativeMouseListener) var2.next();
			var3.method10225(arg0 == 0);
		}
	}

	public void notify(int arg0, int arg1, int arg2) {
		Iterator var4 = this.field11718.iterator();
		while (var4.hasNext()) {
			NativeMouseListener var5 = (NativeMouseListener) var4.next();
			var5.method10226(arg0, arg1, arg2);
		}
	}
}
