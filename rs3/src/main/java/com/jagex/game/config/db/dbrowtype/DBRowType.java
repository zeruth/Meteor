package com.jagex.game.config.db.dbrowtype;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.db.DBUtils;
import com.jagex.game.config.vartype.constants.ScriptVarType;


public class DBRowType implements ConfigType, MutableConfig {

    public Object[][] columnValues;

    public ScriptVarType[][] types;

    public int tableId;

    public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

    public Object[] method14711(int arg0) {
		return this.columnValues == null ? null : this.columnValues[arg0];
	}

    public void decode(Packet buf, int code) {
		if (code == 3) {
			int numColumns = buf.g1();
			if (this.columnValues == null) {
				this.columnValues = new Object[numColumns][];
				this.types = new ScriptVarType[numColumns][];
			}
			for (int var4 = buf.g1(); var4 != 255; var4 = buf.g1()) {
				int columnsLength = buf.g1();
				ScriptVarType[] columnTypes = new ScriptVarType[columnsLength];
				for (int var7 = 0; var7 < columnsLength; var7++) {
					columnTypes[var7] = (ScriptVarType) SerializableEnums.decode(ScriptVarType.values(), buf.gSmart1or2());
				}
				this.columnValues[var4] = DBUtils.decodeValues(buf, columnTypes);
				this.types[var4] = columnTypes;
			}
		} else if (code == 4) {
			this.tableId = buf.gVarInt2();
		}
	}

    public void postDecode() {
	}

    public void setId(int arg0) {
	}
}
