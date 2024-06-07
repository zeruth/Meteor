package com.jagex.js5.network;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.ByteArrayPool;
import com.jagex.core.utils.MonotonicTime;
import deob.ObfuscatedName;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Js5HttpClient {

    public String host;

    public int port;

    public final int game;

    public volatile int pendingRequests = 0;

    public ExecutorService executor = Executors.newFixedThreadPool(2);

    public long lastException;

    public boolean field4468 = false;

	public Js5HttpClient(String host, int port, int game) {
		this.host = host;
		this.port = port;
		this.game = game;
	}

    public boolean isPendingRequestsFull() {
		return this.pendingRequests >= 10;
	}

    public Js5HttpRequest requestMasterIndex() {
		return this.sendHttpRequest(255, 255, (byte) 0, true, 0, 0);
	}

    public Js5HttpRequest sendHttpRequest(int archive, int group, byte padding, boolean urgent, int crc, int version) {
		if (archive < 0 || group < 0) {
			throw new RuntimeException(archive + "," + group);
		}

		if (this.isPendingRequestsFull()) {
			return null;
		}

        boolean isMasterIndex = archive == 255 && group == 255;
        if (!this.field4468 && !isMasterIndex) {
            return null;
        }

		if (this.lastException + 10000L >= MonotonicTime.get()) {
            return null;
        }

        Object var8 = null;
        String file;
        if (isMasterIndex) {
            file = "&cb=" + MonotonicTime.get();
        } else {
            file = "&c=" + crc + "&v=" + version;
        }

        URL url;
        try {
            url = new URL("http", this.host, this.port, "/ms?m=" + this.game + "&a=" + archive + "&g=" + group + file);
        } catch (MalformedURLException var14) {
            return null;
        }

        Js5HttpRequest newRequest = new Js5HttpRequest(padding);
        newRequest.urgent = urgent;
        this.pendingRequests++;

        Future future = this.executor.submit(new Js5HTTPClient_Task(this, url, newRequest));
        newRequest.setFutureResponse(future);
        return newRequest;
    }

    public void removePendingRequest() {
		this.pendingRequests--;
	}

    public void shutdownExecutor() {
		this.executor.shutdown();
	}

	// line 75
    public void method7053(boolean arg0) {
		this.field4468 = arg0;
	}

    public static class Js5HTTPClient_Task implements Callable {

		// $FF: synthetic field
		public final Js5HttpClient this$0;

        public URL url;

        public Js5HttpRequest request;

		// line 82
		public Js5HTTPClient_Task(Js5HttpClient arg0, URL arg1, Js5HttpRequest arg2) {
			this.this$0 = arg0;
			this.url = arg1;
			this.request = arg2;
		}

		public Object call() throws Exception {
			URLConnection var1 = this.url.openConnection();
			var1.setConnectTimeout(10000);
			var1.setReadTimeout(60000);

			boolean var2 = true;
			try {
				var1.connect();
			} catch (IOException var4) {
				this.this$0.lastException = MonotonicTime.get();
				var2 = false;
			}

			return new Js5HTTPClientResponse(this.this$0, var2 ? var1.getInputStream() : null, this.request, this.url);
		}
	}

    public static class Js5HTTPClientResponse {

		// $FF: synthetic field
		public final Js5HttpClient this$0;

        public byte[] response;

		// line 106
		public Js5HTTPClientResponse(Js5HttpClient httpclient, InputStream in, Js5HttpRequest request, URL arg3) {
			this.this$0 = httpclient;
			this.response = null;
			if (in != null) {
				short var5 = 10240;
				Packet buf = new Packet(var5, true);
				int length = 0;
				byte[] alloc = ByteArrayPool.alloc(1024);
				while (length >= 0) {
					try {
						length = in.read(alloc);
					} catch (IOException ioException) {
						ioException.printStackTrace();
						length = -1;
					}
					if (length > 0) {
						if (buf.pos + length >= buf.data.length) {
							int size = buf.data.length + 10240;
							byte[] bytes = ByteArrayPool.alloc(size, true);
							System.arraycopy(buf.data, 0, bytes, 0, buf.pos);
							ByteArrayPool.release(buf.data);
							buf.data = bytes;
						}
						buf.pdata(alloc, 0, length);
					}
				}
				for (int index = 0; index < request.padding; index++) {
					buf.p1(0);
				}
				byte[] bytes = new byte[buf.pos];
				System.arraycopy(buf.data, 0, bytes, 0, buf.pos);
				buf.release();
				Object var14 = null;
				ByteArrayPool.release(alloc);
				Object var15 = null;
				this.response = bytes;
				try {
					in.close();
				} catch (IOException ioException) {
					ioException.printStackTrace();
				}
			}
			request.incomplete = false;
			httpclient.removePendingRequest();
		}

        public byte[] getResponseBytes() {
			return this.response;
		}
	}
}
