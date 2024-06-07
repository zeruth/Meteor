package com.jagex.game.script;

import com.jagex.game.world.entity.LocReference;
import com.jagex.game.world.entity.Location;

import rs2.client.clientscript.ScriptRunner;

public class SubInterfaceActiveLoc extends SubInterface {

    public final LocReference field12429;

	public SubInterfaceActiveLoc(int arg0, int arg1, LocReference arg2) {
		super(arg0, arg1);
		this.field12429 = arg2;
	}

    public boolean method18183() {
		Location var1 = this.field12429.method10760();
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.executeTriggeredScriptLoc(ClientTriggerType.IF_PROCESS_ACTIVE_LOC, this.field11571, -1, var1);
			return true;
		}
	}
}
