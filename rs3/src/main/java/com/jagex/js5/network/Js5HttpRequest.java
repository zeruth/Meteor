package com.jagex.js5.network;

import com.jagex.js5.Js5Request;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Js5HttpRequest extends Js5Request {

    public Future futureResponse;

    public final int padding;

	public Js5HttpRequest(int padding) {
		this.padding = padding;
	}

    public void setFutureResponse(Future futureResponse) {
		this.futureResponse = futureResponse;
	}

    public byte[] getBytes() {
		if (this.futureResponse.isDone()) {
			try {
				return ((Js5HttpClient.Js5HTTPClientResponse) this.futureResponse.get()).getResponseBytes();
			} catch (InterruptedException var3) {
				var3.printStackTrace();
			} catch (ExecutionException var4) {
				var4.printStackTrace();
			}
		}
		return null;
	}

    public int getPercentageComplete() {
		if (this.futureResponse == null) {
			return 0;
		} else if (this.futureResponse.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}
}
