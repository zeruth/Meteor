package com.jagex.game.compression.huffman;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.Cp1252;
import deob.ObfuscatedName;

public class WordPack {

    public static Huffman huffman;

	public WordPack() throws Throwable {
		throw new Error();
	}

    public static void setHuffman(Huffman huffman) {
		WordPack.huffman = huffman;
	}

    public static int encode(Packet packet, String arg1) {
		int var2 = packet.pos;
		byte[] var3 = Cp1252.method3064(arg1);
		packet.pSmart1or2s(var3.length);
		packet.pos += huffman.compress(var3, 0, var3.length, packet.data, packet.pos);
		return packet.pos - var2;
	}

    public static String method5939(Packet arg0) {
		return decode(arg0, 32767);
	}

    public static String decode(Packet arg0, int arg1) {
		try {
			int var2 = arg0.gSmart1or2();
			if (var2 > arg1) {
				var2 = arg1;
			}
			byte[] var3 = new byte[var2];
			arg0.pos += huffman.decompress(arg0.data, arg0.pos, var3, 0, var2);
			return Cp1252.method9199(var3, 0, var2);
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}
