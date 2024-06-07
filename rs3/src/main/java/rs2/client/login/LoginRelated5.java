package rs2.client.login;

import com.jagex.core.io.Packet;
import com.jagex.game.load.LoadingScreenElementConfig;
import com.jagex.game.load.LoadingScreenElementType;
import deob.ObfuscatedName;

public class LoginRelated5 implements LoadingScreenElementConfig {

    public final int field3200;

	public LoginRelated5(int arg0) {
		this.field3200 = arg0;
	}

    public static LoginRelated5 method8975(Packet arg0) {
		int var1 = arg0.gSmart2or4null();
		return new LoginRelated5(var1);
	}

    public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3195;
	}
}
