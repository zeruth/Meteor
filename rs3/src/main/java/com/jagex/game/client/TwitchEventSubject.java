package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.game.config.vartype.constants.ScriptVarType;


public class TwitchEventSubject implements SerializableEnum, TwitchVar {

    public static final TwitchEventSubject REPORT = new TwitchEventSubject(0, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.STRING});

    public static final TwitchEventSubject RESULT = new TwitchEventSubject(1, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT});

    public static final TwitchEventSubject CHAT_MESSAGE = new TwitchEventSubject(2, "", new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.STRING});

    public static final TwitchEventSubject WEBCAM_DEVICE_INFO = new TwitchEventSubject(3, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT, ScriptVarType.STRING});

    public final int serialID;

    public final ScriptVarType[] types;

	public TwitchEventSubject(int serialID, String arg1, ScriptVarType[] types) {
		this.serialID = serialID;
		this.types = types;
		ScriptVarType[] varTypes = this.types;
		int index = 0;
		while (index < varTypes.length) {
			ScriptVarType scriptType = varTypes[index];
			switch(scriptType.baseType.index) {
				case 1:
				case 2:
				case 3:
				case 4:
				default:
					index++;
			}
		}
	}

    public int getId() {
		return this.serialID;
	}
}
