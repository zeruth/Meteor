package com.jagex.core.utils;

import deob.ObfuscatedName;
import jaclib.ping.Ping;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PingProvider implements Runnable {

    public String host;

    public InetAddress inetAddress;

    public volatile long pingedAddress = -1L;

    public volatile boolean running = true;

    public void setPingHost(String host) {
		this.host = host;
		this.inetAddress = null;
		this.pingedAddress = -1L;
		if (this.host != null) {
			try {
				this.inetAddress = InetAddress.getByName(this.host);
			} catch (UnknownHostException exception) {
			}
		}
	}

    public long getPingedAddress() {
		return this.pingedAddress;
	}

    public void stop() {
		this.running = false;
	}

	public void run() {
		while (this.running) {
			this.ping();
		}
	}

    public void ping() {
		if (this.inetAddress != null) {
			try {
				byte[] var1 = this.inetAddress.getAddress();
				this.pingedAddress = Ping.method110(var1[0], var1[1], var1[2], var1[3], 10000L);
			} catch (Throwable var3) {
			}
		}
		PreciseSleep.sleep(1000L);
	}
}
