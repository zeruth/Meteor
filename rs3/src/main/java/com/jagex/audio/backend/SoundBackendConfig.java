package com.jagex.audio.backend;

import com.jagex.audio.api.SoundBackendType;
import com.jagex.audio.stream.SoundRelatedType2;


import java.util.HashMap;

public class SoundBackendConfig {

    public SoundBackendType field8052;

    public HashMap field8053;

	public SoundBackendConfig(SoundBackendType arg0) {
		this.method10342();
		this.field8052 = arg0;
	}

    public void method10342() {
		this.field8053 = new HashMap();
		this.field8053.put(SoundRelatedType2.field4851, 50);
	}
}
