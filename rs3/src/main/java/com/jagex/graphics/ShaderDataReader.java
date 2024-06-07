package com.jagex.graphics;



public class ShaderDataReader {

    public byte[] bytes;

    public int pos;

	public ShaderDataReader(byte[] bytes) {
		this.bytes = bytes;
		this.pos = 0;
	}

    public int g2() {
		short value = 0;
		for (int index = 0; index < 2; index++) {
			value = (short) (value | (this.bytes[++this.pos - 1] & 0xFF) << index * 8);
		}
		return value;
	}

    public String gstr() {
		int length = this.g2();
		if (length == -1) {
			return null;
		} else if (length > 256) {
			throw new ShaderDataReaderException();
		} else {
			String value = new String(this.bytes, this.pos, length);
			this.pos += length;
			return value;
		}
	}
}
