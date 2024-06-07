package com.jagex.twitchtv;

import com.jagex.game.client.TwitchEventSubject;


public abstract class TwitchEvent {

	public int eventType;

	public TwitchEvent(int arg0) {
		this.eventType = arg0;
	}

    public abstract void method12(int[] arg0, long[] arg1, Object[] arg2);

    public abstract TwitchEventSubject method11();
}
