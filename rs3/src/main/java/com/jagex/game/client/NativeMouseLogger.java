package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.util.LinkedList;
import java.util.Queue;

public class NativeMouseLogger extends MouseLogger {

    public final Queue field11710 = new LinkedList();

    public void method18343(NativeMouseEvent arg0) {
		this.field11710.add(arg0);
		if (this.field11710.size() > 10) {
			this.field11710.poll();
		}
	}

    public void method10270() {
		NativeMouseEvent var1 = (NativeMouseEvent) this.field11710.poll();
		if (var1 == null) {
			return;
		}
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.EVENT_NATIVE_MOUSE_CLICK, Client.gameConnection.randomOut);
		var2.buf.p4(var1.getMouseClickX() | var1.getMouseClickY() << 16);
		var2.buf.p2_alt1(this.method10262(var1, 65535));
		var2.buf.p1_alt1(var1.method19539() << 1 | var1.method19537() & 0x1);
		Client.gameConnection.queue(var2);
		var1.release();
	}

    public boolean method10272() {
		return !this.field11710.isEmpty() || this.field7953 < MonotonicTime.get() - 2000L;
	}

    public ClientMessage method10267() {
		return ClientMessage.createMessage(ClientProt.EVENT_NATIVE_MOUSE_MOVE, Client.gameConnection.randomOut);
	}

    public void method18345(Packet arg0, NativeMouseEvent arg1) {
		arg0.p1(arg1.method19537());
	}

    public int method10263() {
		return 1;
	}

    public void method10264(Packet arg0, MouseEvent arg1) {
		this.method18345(arg0, (NativeMouseEvent) arg1);
	}
}
