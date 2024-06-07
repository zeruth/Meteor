package com.jagex.game.client;



import java.io.File;
import java.io.IOException;

public class RuneScapeSetup {

    public static final String field519 = GameShell.method3068() + "\\RuneScape-Setup.exe";

    public static Process field520;

    public static RuneScapeSetupStatus field521 = RuneScapeSetupStatus.field689;

	public RuneScapeSetup() throws Throwable {
		throw new Error();
	}

    public static void method4589() throws RuntimeException {
		if (!NativeLibraryConfig.osName.startsWith("win")) {
			return;
		}
		method18310();
		Object var0 = null;
		String var1 = field519;
		File var2 = new File(var1);
		if (!var2.isFile()) {
			throw new RuntimeException();
		}
		if (!var2.canRead()) {
			throw new RuntimeException();
		}
		if (RuneScapeSetupStatus.field690 == field521) {
			throw new RuntimeException();
		}
		try {
			field520 = (new ProcessBuilder(new String[] { var1 })).start();
			field521 = RuneScapeSetupStatus.field690;
		} catch (IOException var4) {
			throw new RuntimeException();
		}
	}

    public static int method312() {
		method18310();
		return field521.field693;
	}

    public static void method18310() {
		if (method10283()) {
			field521 = field520.exitValue() == 0 ? RuneScapeSetupStatus.field691 : RuneScapeSetupStatus.field692;
			field520 = null;
		}
	}

    public static boolean method10283() {
		if (field520 == null) {
			return false;
		}
		try {
			field520.exitValue();
			return true;
		} catch (IllegalThreadStateException var1) {
			return false;
		}
	}
}
