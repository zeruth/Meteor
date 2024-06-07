package com.jagex.game.group;

import com.jagex.core.io.Packet;


public class PlayerGroupBanned {

    public String displayName;

	public PlayerGroupBanned(Packet buf, boolean hasUid, boolean hasDisplayName) {
		if (hasUid) {
			buf.g8();
		}
		if (hasDisplayName) {
			this.displayName = buf.fastgstr();
		} else {
			this.displayName = null;
		}
	}

    public String getDisplayName() {
		return this.displayName;
	}
}
