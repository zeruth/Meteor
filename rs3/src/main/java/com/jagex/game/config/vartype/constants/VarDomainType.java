package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.game.config.vartype.*;


public class VarDomainType implements SerializableEnum {

    public static final VarDomainType PLAYER = new VarDomainTypePlayer(Js5ConfigGroup.VAR_PLAYER, 0, true, true);

    public static final VarDomainType NPC = new VarDomainTypeNpc(Js5ConfigGroup.VAR_NPC, 1, false, true);

    public static final VarDomainType CLIENT = new VarDomainTypeClient(Js5ConfigGroup.VAR_CLIENT, 2, true, true);

    public static final VarDomainType WORLD = new VarDomainTypeWorld(Js5ConfigGroup.VAR_WORLD, 3, false, false);

    public static final VarDomainType REGION = new VarDomainType(Js5ConfigGroup.VAR_REGION, 4, false, false);

    public static final VarDomainType OBJECT = new VarDomainType(Js5ConfigGroup.VAR_OBJECT, 5, true, true);

    public static final VarDomainType CLAN = new VarDomainType(Js5ConfigGroup.VAR_CLAN, 6, true, true);

    public static final VarDomainType CLAN_SETTING = new VarDomainType(Js5ConfigGroup.VAR_CLAN_SETTING, 7, true, false);

    public static final VarDomainType CONTROLLER = new VarDomainTypeController(Js5ConfigGroup.VAR_CONTROLLER, 8, false, false);

    public static final VarDomainType PLAYER_GROUP = new VarDomainType(Js5ConfigGroup.VAR_PLAYER_GROUP, 9, false, true);

    public static final VarDomainType GLOBAL = new VarDomainType(Js5ConfigGroup.VAR_GLOBAL, 10, false, false);

    public final Js5ConfigGroup js5GroupID;

    public final int serialID;

	// $FF: synthetic method
	public VarDomainType(Js5ConfigGroup js5GroupID, int serialID, boolean arg2, boolean arg3, VarDomainTypePlayer arg4) {
		this(js5GroupID, serialID, arg2, arg3);
	}

    public static VarDomainType[] values() {
		return new VarDomainType[] {PLAYER_GROUP, CLAN_SETTING, CONTROLLER, GLOBAL, PLAYER, CLIENT, REGION, OBJECT, WORLD, NPC, CLAN};
	}

	public VarDomainType(Js5ConfigGroup js5GroupID, int serialID, boolean arg2, boolean arg3) {
		this.js5GroupID = js5GroupID;
		this.serialID = serialID;
	}

    public final Js5ConfigGroup getJs5GroupID() {
		return this.js5GroupID;
	}

    public int getId() {
		return this.serialID;
	}

    public Object method7211(VarType arg0) {
		return arg0.field1703 ? this.getDefaultValue(arg0) : arg0.dataType.getDefaultValue();
	}

    public Object getDefaultValue(VarType arg0) {
		return arg0.dataType.getDefaultValue();
	}
}
