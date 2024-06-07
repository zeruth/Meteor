package com.jagex.game.config.quickchatphrasetype;

import com.jagex.core.io.Packet;

import rs2.client.Client;

public class QuickChatPhrase {

    public int id;

    public QuickChatPhraseType quickChatPhraseType;

    public int[] dynamics;

    public static QuickChatPhrase createQuickChatPhrase(Packet buf) {
		QuickChatPhrase quickChatPhrase = new QuickChatPhrase();
		quickChatPhrase.id = buf.g2();
		quickChatPhrase.quickChatPhraseType = Client.quickChatPhraseTypeList.list(quickChatPhrase.id);
		return quickChatPhrase;
	}
}
