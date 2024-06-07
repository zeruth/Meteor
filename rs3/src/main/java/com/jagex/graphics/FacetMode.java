package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class FacetMode implements SerializableEnum {

    public static final FacetMode field7581 = new FacetMode(0);

    public static final FacetMode field7582 = new FacetMode(1);

    public static final FacetMode field7580 = new FacetMode(2);

    public static final FacetMode field7579 = new FacetMode(3);

    public static final FacetMode field7583 = new FacetMode(4);

    public static final FacetMode field7578 = new FacetMode(5);

    public final int field7584;

    public static FacetMode[] method4590() {
		return new FacetMode[] { field7578, field7582, field7583, field7579, field7580, field7581 };
	}

	public FacetMode(int arg0) {
		this.field7584 = arg0;
	}

    public int getId() {
		return this.field7584;
	}
}
