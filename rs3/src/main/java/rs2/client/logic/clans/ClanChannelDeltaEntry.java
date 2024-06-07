package rs2.client.logic.clans;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;


public abstract class ClanChannelDeltaEntry extends Node {

    public abstract void apply(ClanChannel channel);

    public abstract void decode(Packet buf);
}
