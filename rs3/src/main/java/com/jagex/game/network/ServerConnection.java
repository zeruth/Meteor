package com.jagex.game.network;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.io.Stream;
import com.jagex.core.utils.PingProvider;
import com.jagex.encryption.Isaac;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.network.protocol.ServerProt;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.io.IOException;

public class ServerConnection {

    public Stream stream;

    public LinkList writeQueue = new LinkList();

    public int writePos = 0;

    public Packet out = new Packet(1700);

    public Isaac randomOut;

    public PacketBit in = new PacketBit(40000);

    public Isaac randomIn;

    public ServerProt packetType = null;

    public int packetSize = 0;

    public boolean field799 = true;

    public int idleNetCycles = 0;

    public int numConnections = 0;

    public int totalBytesSent;

    public int readPos;

    public int outBytesPerSecond;

    public int inBytesPerSecond;

    public ServerProt lastPacketType0;

    public ServerProt lastPacketType1;

    public ServerProt lastPacketType2;

    public boolean disconnected = false;

    public PingProvider pingProvider = new PingProvider();

	public ServerConnection() {
		Thread thread = new Thread(this.pingProvider);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

    public final void clearWriteQueue() {
		this.writeQueue.removeAll();
		this.writePos = 0;
	}

    public final void flush() throws IOException {
		if (this.stream == null || this.writePos <= 0) {
			return;
		}
		this.out.pos = 0;
		while (true) {
			ClientMessage message = (ClientMessage) this.writeQueue.head();
			if (message == null || message.pos > this.out.data.length - this.out.pos) {
				this.stream.write(this.out.data, 0, this.out.pos);
				this.totalBytesSent += this.out.pos;
				this.numConnections = 0;
				break;
			}
			this.out.pdata(message.buf.data, 0, message.pos);
			this.writePos -= message.pos;
			message.unlink();
			message.buf.release();
			message.pushMessage();
		}
	}

    public final void queue(ClientMessage message) {
		this.writeQueue.addTail(message);
		message.pos = message.buf.pos;
		message.buf.pos = 0;
		this.writePos += message.pos;
	}

    public void refreshNetStats() {
		if (Client.loopCycle % 50 == 0) {
			this.outBytesPerSecond = this.totalBytesSent;
			this.totalBytesSent = 0;
			this.inBytesPerSecond = this.readPos;
			this.readPos = 0;
		}
	}

    public void setStream(Stream stream, String host) {
		this.stream = stream;
		this.pingProvider.setPingHost(host);
	}

    public void closeGracefully() {
		if (this.stream != null) {
			this.stream.closeGracefully();
			this.stream = null;
		}
		this.pingProvider.setPingHost(null);
	}

    public void closeForcefully() {
		this.stream = null;
		this.pingProvider.setPingHost(null);
	}

    public Stream getStream() {
		return this.stream;
	}
}
