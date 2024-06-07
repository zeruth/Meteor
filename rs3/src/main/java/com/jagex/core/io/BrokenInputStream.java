package com.jagex.core.io;

import com.jagex.core.utils.PreciseSleep;


import java.io.InputStream;

public class BrokenInputStream extends InputStream {

	public int read() {
		PreciseSleep.sleep(30000L);
		return -1;
	}
}
