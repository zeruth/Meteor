package com.jagex.graphics.particles;

import com.jagex.core.datastruct.Node;
import com.jagex.game.config.ParticleEffectorType;
import com.jagex.graphics.ModelParticleEffector;


public class ParticleEffector extends Node {

    public final ModelParticleEffector field11488;

    public final ParticleEffectorType field11483;

    public int field11484;

    public int field11481;

    public int field11482;

    public float field11486;

    public float field11487;

    public static float[] field11485 = new float[3];

	public ParticleEffector(ModelParticleEffector arg0, ParticleSystem arg1) {
		this.field11488 = arg0;
		this.field11483 = this.field11488.method1509(ParticleSystemRenderer.field12041);
		this.method17872();
	}

    public void method17872() {
		this.field11484 = this.field11488.field1226;
		this.field11481 = this.field11488.field1229;
		this.field11482 = this.field11488.field1227;
		if (this.field11488.field1231 != null) {
			this.field11488.field1231.method6616((float) this.field11483.field3551, (float) this.field11483.field3552, (float) this.field11483.field3553, field11485);
		}
		this.field11486 = field11485[0];
		this.field11487 = field11485[2];
	}
}
