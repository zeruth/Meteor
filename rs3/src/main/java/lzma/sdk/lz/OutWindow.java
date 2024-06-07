package lzma.sdk.lz;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.OutputStream;

public class OutWindow {

    public byte[] _buffer;

    public int _pos;

    public int _windowSize = 0;

    public int _streamPos;

    public OutputStream _stream;

    public void create(int windowSize) {
		if (this._buffer == null || this._windowSize != windowSize) {
			this._buffer = new byte[windowSize];
		}
		this._windowSize = windowSize;
		this._pos = 0;
		this._streamPos = 0;
	}

    public void setStream(OutputStream stream) throws IOException {
		this.releaseStream();
		this._stream = stream;
	}

    public void releaseStream() throws IOException {
		this.flush();
		this._stream = null;
	}

    public void init(boolean solid) {
		if (!solid) {
			this._streamPos = 0;
			this._pos = 0;
		}
	}

    public void flush() throws IOException {
		int size = this._pos - this._streamPos;
		if (size == 0) {
			return;
		}
		this._stream.write(this._buffer, this._streamPos, size);
		if (this._pos >= this._windowSize) {
			this._pos = 0;
		}
		this._streamPos = this._pos;
	}

    public void copyBlock(int distance, int len) throws IOException {
		int pos = this._pos - distance - 1;
		if (pos < 0) {
			pos += this._windowSize;
		}
		for (; len != 0; len--) {
			if (pos >= this._windowSize) {
				pos = 0;
			}
			this._buffer[++this._pos - 1] = this._buffer[pos++];
			if (this._pos >= this._windowSize) {
				this.flush();
			}
		}
	}

    public void putByte(byte b) throws IOException {
		this._buffer[++this._pos - 1] = b;
		if (this._pos >= this._windowSize) {
			this.flush();
		}
	}

    public byte getByte(int distance) {
		int pos = this._pos - distance - 1;
		if (pos < 0) {
			pos += this._windowSize;
		}
		return this._buffer[pos];
	}
}
