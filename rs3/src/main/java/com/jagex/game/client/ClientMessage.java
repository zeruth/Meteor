package com.jagex.game.client;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.PacketBit;
import com.jagex.encryption.Isaac;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;

public class ClientMessage extends Node {

    public ClientProt prot;

    public int size;

    public PacketBit buf;

    public int pos;

    public static ClientMessage[] messages = new ClientMessage[300];

    public static int messageIndex = 0;

    public static ClientMessage popMessage() {
		return messageIndex == 0 ? new ClientMessage() : messages[--messageIndex];
	}

    public static ClientMessage createMessage(ClientProt prot, Isaac isaac) {
		ClientMessage message = popMessage();
		message.prot = prot;
		message.size = prot.size;
		if (message.size == -1) {
			message.buf = new PacketBit(260);
		} else if (message.size == -2) {
			message.buf = new PacketBit(10000);
		} else if (message.size <= 18) {
			message.buf = new PacketBit(20);
		} else if (message.size <= 98) {
			message.buf = new PacketBit(100);
		} else {
			message.buf = new PacketBit(260);
		}
		message.buf.setIsaac(isaac);
		message.buf.pIsaac1(message.prot.id);
		message.pos = 0;
		return message;
	}

    public static ClientMessage createMessage() {
		ClientMessage message = popMessage();
		message.prot = null;
		message.size = 0;
		message.buf = new PacketBit(5000);
		return message;
	}

    public void pushMessage() {
		if (messageIndex < messages.length) {
			messages[++messageIndex - 1] = this;
		}
	}
}
