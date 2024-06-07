package com.jagex.game.script;

import com.jagex.game.world.entity.ObjectNode;

import rs2.client.Client;
import rs2.client.clientscript.ScriptRunner;
import rs2.client.scene.entities.PathingEntity;

public class SubInterfaceActiveNpc extends SubInterface {

    public final int field12428;

	public SubInterfaceActiveNpc(int arg0, int arg1, int arg2) {
		super(arg0, arg1);
		this.field12428 = arg2;
	}

    public boolean method18183() {
		ObjectNode var1 = (ObjectNode) Client.npcs.get((long) this.field12428);
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.executeTriggeredScriptPathingEntity(ClientTriggerType.IF_PROCESS_ACTIVE_NPC, this.field11571, -1, (PathingEntity) var1.value, this.field12428);
			return true;
		}
	}
}
