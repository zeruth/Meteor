package com.jagex.js5.network;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5CompressionType;
import deob.ObfuscatedName;

public class JS5CompressionHeader {

    public final Js5CompressionType compressionType;

    public final int packedLength;

    public final int unpackedLength;

	public JS5CompressionHeader(Packet buf) {
		this.compressionType = (Js5CompressionType) SerializableEnums.decode(Js5CompressionType.values(), buf.g1());
		this.packedLength = buf.g4s();

		if (Js5CompressionType.UNCOMPRESSED == this.compressionType) {
			this.unpackedLength = this.packedLength;
		} else {
			this.unpackedLength = buf.g4s();
		}
	}

    public Js5CompressionType getCompressionType() {
		return this.compressionType;
	}

    public int getPackedLength() {
		return this.packedLength;
	}

    public int getUnpackedLength() {
		return this.unpackedLength;
	}
}
