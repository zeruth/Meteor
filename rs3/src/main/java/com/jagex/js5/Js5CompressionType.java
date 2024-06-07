package com.jagex.js5;

import com.jagex.core.constants.SerializableEnum;


public class Js5CompressionType implements SerializableEnum {

    public static final Js5CompressionType UNCOMPRESSED = new Js5CompressionType("UNCOMPRESSED", 0);

    public static final Js5CompressionType BZIP2 = new Js5CompressionType("BZIP2", 1);

    public static final Js5CompressionType GZIP = new Js5CompressionType("GZIP", 2);

    public static final Js5CompressionType LZMA = new Js5CompressionType("LZMA", 3);

    public final String name;

    public final int id;

    public static Js5CompressionType[] values() {
		return new Js5CompressionType[] { GZIP, LZMA, BZIP2, UNCOMPRESSED };
	}

	public Js5CompressionType(String name, int id) {
		this.name = name;
		this.id = id;
	}

    public int getId() {
		return this.id;
	}
}
