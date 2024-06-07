package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

public class SocketStream extends Stream {

    public Socket socket;

    public SocketStreamReader in;

    public SocketStreamWriter out;

	public SocketStream(Socket socket, int inLimit, int outLimit) throws IOException {
		this.socket = socket;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.in = new SocketStreamReader(this.socket.getInputStream(), inLimit);
		this.out = new SocketStreamWriter(this.socket.getOutputStream(), outLimit);
	}

    public boolean hasAvailable(int amount) throws IOException {
		return this.in.hasAvailable(amount);
	}

    public int available() throws IOException {
		return this.in.available();
	}

    public int read(byte[] bytes, int off, int len) throws IOException {
		return this.in.read(bytes, off, len);
	}

    public void write(byte[] bytes, int off, int len) throws IOException {
		this.out.write(bytes, off, len);
	}

    public void closeGracefully() {
		this.out.closeGracefully();
		try {
			this.socket.close();
		} catch (IOException exception) {
		}
		this.in.closeGracefully();
	}

    public void closeForcefully() {
		this.in.closeForcefully();
		this.out.closeForcefully();
	}

	public void finalize() {
		this.closeGracefully();
	}
}
