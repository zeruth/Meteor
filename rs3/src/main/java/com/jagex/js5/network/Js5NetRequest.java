package com.jagex.js5.network;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5Request;


public class Js5NetRequest extends Js5Request {

    public Packet buf;

    public byte offset;

    public byte[] getBytes() {
		if (this.incomplete || this.buf.pos < this.buf.data.length - this.offset) {
			throw new RuntimeException("Not ready!");
		}

		return this.buf.data;
	}

    public int getPercentageComplete() {
		return this.buf == null ? 0 : this.buf.pos / (this.buf.data.length - this.offset);
	}
}
