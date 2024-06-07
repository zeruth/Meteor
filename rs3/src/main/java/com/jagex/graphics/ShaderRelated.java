package com.jagex.graphics;

import com.jagex.core.datastruct.HashMapKey;
import com.jagex.core.utils.StringTools;


public final class ShaderRelated implements HashMapKey {

    public long hash(String value) {
		return StringTools.method15380(value);
	}
}
