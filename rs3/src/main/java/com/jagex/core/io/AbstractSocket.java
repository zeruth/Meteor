package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

public abstract class AbstractSocket {

    public String host;

    public int port;

    public static AbstractSocket createProxySocket(String host, int port) {
		ProxySocket socket = new ProxySocket();
		socket.host = host;
		socket.port = port;
		return socket;
	}

    public Socket createSocket() throws IOException {
		return new Socket(this.host, this.port);
	}

    public abstract Socket getSocket() throws IOException;
}
