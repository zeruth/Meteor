package com.jagex.graphics;

import com.jagex.game.config.ParticleEmitterType;
import com.jagex.game.config.ParticleEmitterTypeList;
import deob.ObfuscatedName;

public class ModelParticleEmitter {

    public final int particle;

    public ModelParticleEmitter field1465;

    public final int field1463;

    public final int field1476;

    public final int field1467;

    public final int field1468;

    public final byte field1471;

    public int field1470;

    public int field1474;

    public int field1472;

    public int field1473;

    public int field1469;

    public int field1475;

    public int field1464;

    public int field1466;

    public int field1478;

	public ModelParticleEmitter(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
		this.particle = arg0;
		this.field1463 = arg1;
		this.field1476 = arg2;
		this.field1467 = arg3;
		this.field1468 = arg4;
		this.field1471 = arg5;
	}

    public ParticleEmitterType method2079(ParticleEmitterTypeList arg0) {
		return arg0.get(this.particle);
	}

    public ModelParticleEmitter method2080(int arg0, int arg1, int arg2, int arg3) {
		return new ModelParticleEmitter(this.particle, arg0, arg1, arg2, arg3, this.field1471);
	}
}
