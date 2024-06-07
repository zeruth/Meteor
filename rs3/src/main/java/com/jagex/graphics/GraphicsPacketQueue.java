package com.jagex.graphics;

import com.jagex.core.io.SendablePacket;
import com.jagex.game.client.*;

import rs2.client.Client;

import java.util.LinkedList;

public class GraphicsPacketQueue {

    public static LinkedList field7279 = new LinkedList();

	public GraphicsPacketQueue() throws Throwable {
		throw new Error();
	}

    public static void method4995(ClientAutoSetupResult arg0) {
		method4922(arg0);
	}

    public static void sendDirectXFailure(int arg0) {
		method4922(new ClientDirectXFailure(arg0));
	}

    public static void method6971(ToolkitType arg0) {
		method4922(new SimpleToolkitChange(arg0));
	}

    public static void method5144(int arg0, int arg1, int arg2) {
		method4922(new ClientMapBuildStuck(arg0, arg1, arg2, Client.js5ConnectState, Client.js5TcpClient.errorCount, Client.js5TcpClient.js5State, Client.js5TcpClient.isUrgentsFull(), Client.js5TcpClient.isPrefetchesFull(), Client.js5DiskCache.getPendingRequests()));
	}

    public static void method18474(NativeLibraryFailureType arg0, String arg1, int arg2, Throwable arg3) {
		method4922(new ClientNativeLibraryFailure(arg0, arg1, arg2, arg3));
	}

    public static void method4922(SendablePacket arg0) {
		while (field7279.size() > 10) {
			field7279.remove();
		}
		field7279.add(arg0);
	}

    public static void flush() {
		if (Client.state != 18 && Client.state != 3 || Client.gameConnection == null) {
			return;
		}
		while (true) {
			SendablePacket var0 = (SendablePacket) field7279.poll();
			if (var0 == null) {
				return;
			}
			var0.method9201();
		}
	}
}
