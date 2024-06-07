package com.jagex.twitchtv;

import com.jagex.game.client.TwitchEventSubject;


public class TwitchEventResult extends TwitchEvent {

	public int result;

	public TwitchEventResult(int arg0, int arg1) {
		super(arg0);
		this.result = arg1;
	}

    public void method12(int[] arg0, long[] arg1, Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

    public TwitchEventSubject method11() {
		return TwitchEventSubject.RESULT;
	}
}
