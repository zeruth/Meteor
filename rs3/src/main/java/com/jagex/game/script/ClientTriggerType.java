package com.jagex.game.script;

import com.jagex.game.config.vartype.constants.ScriptVarType;


public class ClientTriggerType implements TriggerType {

    public static final ClientTriggerType OPWORLDMAPELEMENT1 = new ClientTriggerType("", 10, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

    public static final ClientTriggerType OPWORLDMAPELEMENT2 = new ClientTriggerType("", 11, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

    public static final ClientTriggerType OPWORLDMAPELEMENT3 = new ClientTriggerType("", 12, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

    public static final ClientTriggerType OPWORLDMAPELEMENT4 = new ClientTriggerType("", 13, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

    public static final ClientTriggerType OPWORLDMAPELEMENT5 = new ClientTriggerType("", 14, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

    public static final ClientTriggerType WORLDMAPELEMENTMOUSEOVER = new ClientTriggerType("", 15, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

    public static final ClientTriggerType WORLDMAPELEMENTMOUSELEAVE = new ClientTriggerType("", 16, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

    public static final ClientTriggerType WORLDMAPELEMENTMOUSEREPEAT = new ClientTriggerType("", 17, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

    public static final ClientTriggerType VIDEO_END = new ClientTriggerType("", 18);

    public static final ClientTriggerType JCOINS_UPDATED = new ClientTriggerType("", 19);

    public static final ClientTriggerType CUTSCENE_SUBTITLE = new ClientTriggerType("", 20, new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.INT}, null);

    public static final ClientTriggerType LOYALTY_UPDATED = new ClientTriggerType("", 21);

    public static final ClientTriggerType PROCESS_NPC = new ClientTriggerType("", 22);

    public static final ClientTriggerType PROCESS_PLAYER = new ClientTriggerType("", 23, new ScriptVarType[] { ScriptVarType.PLAYER_UID}, null);

    public static final ClientTriggerType IF_PROCESS_ACTIVE_NPC = new ClientTriggerType("", 24);

    public static final ClientTriggerType IF_PROCESS_ACTIVE_PLAYER = new ClientTriggerType("", 25);

    public static final ClientTriggerType IF_PROCESS_ACTIVE_LOC = new ClientTriggerType("", 26);

    public static final ClientTriggerType IF_PROCESS_ACTIVE_OBJ = new ClientTriggerType("", 27);

    public static final ClientTriggerType CUTSCENE_END = new ClientTriggerType("", 28);

    public static final ClientTriggerType TWITCH = new ClientTriggerType_Sub2("", 29, true, false);

    public static final ClientTriggerType field7268 = new ClientTriggerType_Sub1("", 30, true, false);

    public static final ClientTriggerType PROC = new ClientTriggerType("", 73, true, true);

    public static final ClientTriggerType CLIENTSCRIPT = new ClientTriggerType("", 76, true, false);

    public final int id;

	// $FF: synthetic method
	public ClientTriggerType(String arg0, int arg1, boolean arg2, boolean arg3, ClientTriggerType_Sub2 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	public ClientTriggerType(String arg0, int arg1) {
		this(arg0, arg1, false, (ScriptVarType[]) null, false, (ScriptVarType[]) null);
	}

	public ClientTriggerType(String arg0, int arg1, boolean arg2, boolean arg3) {
		this(arg0, arg1, arg2, (ScriptVarType[]) null, arg3, (ScriptVarType[]) null);
	}

	public ClientTriggerType(String arg0, int arg1, ScriptVarType[] arg2, ScriptVarType[] arg3) {
		this(arg0, arg1, arg2 != null, arg2, arg3 != null, arg3);
	}

	public ClientTriggerType(String arg0, int arg1, boolean arg2, ScriptVarType[] arg3, boolean arg4, ScriptVarType[] arg5) {
		this.id = arg1;
	}

    public int getId() {
		return this.id;
	}
}
