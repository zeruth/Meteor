package com.jagex.game.client;



import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameProvider implements Runnable {

    public InetAddress field588;

    public volatile String field587;

	public HostNameProvider(int arg0) throws UnknownHostException {
		this.field588 = InetAddress.getByAddress(new byte[] { (byte) (arg0 >> 24 & 0xFF), (byte) (arg0 >> 16 & 0xFF), (byte) (arg0 >> 8 & 0xFF), (byte) (arg0 & 0xFF) });
	}

    public String method544() {
		return this.field587;
	}

	public void run() {
		this.field587 = this.field588.getHostName();
	}
}
