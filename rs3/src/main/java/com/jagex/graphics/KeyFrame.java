package com.jagex.graphics;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public class KeyFrame {

    public int field1663;

    public float field1660;

    public float field1661 = Float.MAX_VALUE;

    public float field1662 = Float.MAX_VALUE;

    public float field1664 = Float.MAX_VALUE;

    public float field1659 = Float.MAX_VALUE;

    public KeyFrame field1665;

    public void method2673(Packet arg0, int arg1) {
		this.field1663 = arg0.g2s();
		this.field1660 = arg0.gFloat();
		this.field1661 = arg0.gFloat();
		this.field1662 = arg0.gFloat();
		this.field1664 = arg0.gFloat();
		this.field1659 = arg0.gFloat();
	}
}
