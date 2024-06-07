package rs2.client.logic.clans;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public abstract class ClanSettingsDeltaEntry extends Node {

    public abstract void decode(Packet buf);

    public abstract void apply(ClanSettings settings);

}
