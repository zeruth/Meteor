package com.jagex.core.utils;

import deob.ObfuscatedName;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class SecureRandomTask implements Callable {

    public static SecureRandom createSecureRandom() {
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.nextInt();
		return secureRandom;
	}

	public Object call() {
		return createSecureRandom();
	}
}
