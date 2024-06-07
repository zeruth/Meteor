package com.jagex.core.utils;



import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SecureRandomProvider {

    public ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    public Future secureRandomFuture = this.singleThreadExecutor.submit(new SecureRandomTask());

    public void stop() {
		this.singleThreadExecutor.shutdown();
		this.singleThreadExecutor = null;
	}

    public SecureRandom getSecureRandom() {
		try {
			return (SecureRandom) this.secureRandomFuture.get();
		} catch (Exception var2) {
			return SecureRandomTask.createSecureRandom();
		}
	}
}
