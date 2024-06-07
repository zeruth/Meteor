package com.jagex.game.client;

import deob.ObfuscatedName;

import java.io.*;

public final class FileOnDisk {

    public RandomAccessFile file;

    public final long maxLength;

    public long pos;

	public FileOnDisk(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.file = new RandomAccessFile(arg0, arg1);
		this.maxLength = arg2;
		this.pos = 0L;
		int var5 = this.file.read();
		if (var5 != -1 && !arg1.equals("r")) {
			this.file.seek(0L);
			this.file.write(var5);
		}
		this.file.seek(0L);
	}

    public final void seek(long arg0) throws IOException {
		this.file.seek(arg0);
		this.pos = arg0;
	}

    public final void write(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.pos + (long) arg2 > this.maxLength) {
			this.file.seek(this.maxLength);
			this.file.write(1);
			throw new EOFException();
		} else {
			this.file.write(arg0, arg1, arg2);
			this.pos += arg2;
		}
	}

    public final void close() throws IOException {
		this.close(false);
	}

    public final void close(boolean flush) throws IOException {
		if (this.file == null) {
			return;
		}
		if (flush) {
			try {
				this.file.getFD().sync();
			} catch (SyncFailedException var3) {
			}
		}
		this.file.close();
		this.file = null;
	}

    public final long length() throws IOException {
		return this.file.length();
	}

    public final int read(byte[] arg0, int arg1, int arg2) throws IOException {
		int var4 = this.file.read(arg0, arg1, arg2);
		if (var4 > 0) {
			this.pos += var4;
		}
		return var4;
	}

	public void finalize() throws Throwable {
		if (this.file != null) {
			// string taken from rev 550
			System.out.println("Warning! fileondisk " + this.file + " not closed correctly using close(). Auto-closing instead. ");
			this.close();
		}
	}
}
