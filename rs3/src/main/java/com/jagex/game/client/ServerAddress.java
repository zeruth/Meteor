package com.jagex.game.client;

import com.jagex.core.io.AbstractSocket;
import deob.ObfuscatedName;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ServerAddress {

    public int node;

    public String host;

    public int port;

    public int port2;

    public boolean useSecondaryPort = true;

    public boolean useProxy = false;

    public Socket getSocket() throws IOException {
		return this.useProxy ? AbstractSocket.createProxySocket(this.host, this.useSecondaryPort ? this.port2 : this.port).getSocket() : new Socket(InetAddress.getByName(this.host), this.useSecondaryPort ? this.port2 : this.port);
	}

    public void configureSocketType() {
		if (!this.useSecondaryPort) {
			this.useSecondaryPort = true;
			this.useProxy = true;
		} else if (this.useProxy) {
			this.useProxy = false;
		} else {
			this.useSecondaryPort = false;
		}
	}

    public boolean isAddressInUse(ServerAddress serverAddress) {
		if (serverAddress == null) {
			return false;
		} else {
			return this.node == serverAddress.node && this.host.equals(serverAddress.host) && this.port == serverAddress.port && this.port2 == serverAddress.port2;
		}
	}
}
