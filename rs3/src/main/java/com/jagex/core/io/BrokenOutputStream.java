package com.jagex.core.io;



import java.io.IOException;
import java.io.OutputStream;

public class BrokenOutputStream extends OutputStream {

	public void write(int arg0) throws IOException {
		throw new IOException();
	}
}
