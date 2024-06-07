package com.jagex.twitchtv;

import com.jagex.game.client.TwitchEventSubject;
import deob.ObfuscatedName;

public class TwitchEventChatMessage extends TwitchEvent {

	public String name;

	public String message;

	public int nameColourARGB;

	public int modes;

	public int subscriptions;

	public boolean isAction;

	public TwitchEventChatMessage(int arg0, String arg1, String arg2, int arg3, int arg4, int arg5, boolean arg6) {
		super(arg0);
		this.name = arg1;
		this.message = arg2;
		this.nameColourARGB = arg3;
		this.modes = arg4;
		this.subscriptions = arg5;
		this.isAction = arg6;
	}

    public void method12(int[] arg0, long[] arg1, Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}

    public TwitchEventSubject method11() {
		return TwitchEventSubject.CHAT_MESSAGE;
	}
}
