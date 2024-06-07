package com.jagex.graphics;

import com.jagex.game.config.ParticleEffectorType;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

public class ModelParticleEffector {

    public final int field1228;

    public ModelParticleEffector field1230;

    public final int field1225;

    public int field1226;

    public int field1229;

    public int field1227;

    public Matrix4x4 field1231;

	public ModelParticleEffector(int arg0, int arg1) {
		this.field1228 = arg0;
		this.field1225 = arg1;
	}

    public ParticleEffectorType method1509(ParticleEffectorTypeList arg0) {
		return arg0.method5973(this.field1228);
	}

    public ModelParticleEffector method1508(int arg0) {
		return new ModelParticleEffector(this.field1228, arg0);
	}
}
