package com.jagex.js5.network;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public abstract class Js5TcpClient {

    public SecondaryLinkedList urgent = new SecondaryLinkedList();

    public SecondaryLinkedList urgentRequested = new SecondaryLinkedList();

    public SecondaryLinkedList prefetch = new SecondaryLinkedList();

    public SecondaryLinkedList prefetchRequested = new SecondaryLinkedList();

    public int delay;

    public long lastTimestamp;

    public Packet out = new Packet(6);

    public byte xorcode = 0;

    public volatile int errorCount = 0;

    public volatile int js5State = 0;

    public volatile int archive = -1;

    public volatile int group = -1;

    public Packet client = new Packet(5);

    public Packet server = new Packet(5);

    public int outPos = 0;

    public Js5NetRequest currentRequest = null;

    public Js5NetRequest queueRequest(int archive, int group, byte off, boolean urgent) {
		long uid = ((long) archive << 32) + (long) group;
		Js5NetRequest request = new Js5NetRequest();
		request.secondaryNodeId = uid;
		request.offset = off;
		request.urgent = urgent;

		if (urgent) {
			if (this.getTotalUrgents() >= 500) {
				throw new RuntimeException("Urgent list exceeded max limit of 500");
			}

			this.urgent.pushBack(request);
		} else if (this.getTotalPrefetches() < 500) {
			this.prefetch.pushBack(request);
		} else {
			throw new RuntimeException("Prefetch list exceeded max limit of 500");
		}

		return request;
	}

    public boolean isPrefetchesFull() {
		return this.getTotalPrefetches() >= 500;
	}

    public boolean isUrgentsFull() {
		return this.getTotalUrgents() >= 500;
	}

    public int getTotalPrefetches() {
		return this.prefetch.length() + this.prefetchRequested.length();
	}

    public int getTotalUrgents() {
		return this.urgent.length() + this.urgentRequested.length();
	}

    public abstract void sendLoginStatus(boolean isLoggedIn);

    public abstract void sendCloseStream();

    public abstract void error(int archive, int group);

    public abstract boolean process();

    public abstract void createNewJs5Stream(Object stream, boolean isLoggedIn);

    public abstract void closeGracefully();

    public abstract void closeForcefully();
}
