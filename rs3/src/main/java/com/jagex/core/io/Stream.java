package com.jagex.core.io;



import java.io.IOException;
import java.net.Socket;

public abstract class Stream {

    public static Stream createStream(Socket socket, int inLimit) throws IOException {
		return createStream(socket, inLimit, inLimit);
	}

    public static Stream createStream(Socket socket, int inLimit, int outLimit) throws IOException {
		return new SocketStream(socket, inLimit, outLimit);
	}

    public abstract int read(byte[] bytes, int off, int len) throws IOException;

    public abstract void write(byte[] bytes, int off, int len) throws IOException;

    public abstract void closeGracefully();

    public abstract void closeForcefully();

    public abstract boolean hasAvailable(int amount) throws IOException;

    public abstract int available() throws IOException;
}
