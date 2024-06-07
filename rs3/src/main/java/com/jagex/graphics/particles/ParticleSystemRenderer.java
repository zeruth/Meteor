package com.jagex.graphics.particles;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.client.MovingParticle;
import com.jagex.game.config.ParticleEffectorType;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Toolkit;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ParticleSystemRenderer {

    public static List field8349;

    public static MovingParticle[] field7794;

    public static int field7791 = 0;

    public static int field7797 = 0;

    public static ParticleSystem[] field1920;

    public static int field7793 = 0;

    public static int field7792 = 0;

    public static int field7790 = 0;

    public static int field7801 = 0;

    public static ParticleEffectorTypeList field12041;

    public static ParticleEffectorType[] field7795 = new ParticleEffectorType[16];

    public static int field7798 = 0;

    public static HashTable field7799 = new HashTable(16);

    public static HashTable field7800 = new HashTable(8);

    public static int field7796 = 0;

    public static int field7802 = 2;

	public ParticleSystemRenderer() throws Throwable {
		throw new Error();
	}

    public static int method9543(int arg0) {
		IntNode var1 = (IntNode) field7799.get((long) arg0);
		if (var1 == null) {
			ParticleEffectorType var2 = field12041.method5973(arg0);
			if (var2 == null || var2.field3549 != 2) {
				return -1;
			}
			var1 = new IntNode(field7798);
			field7799.put(var1, (long) arg0);
			field7795[++field7798 - 1] = var2;
		}
		return var1.value;
	}

    public static void method706(ParticleEmitterTypeList arg0, ParticleEffectorTypeList arg1) {
		field7791 = 0;
		field7797 = 0;
		field8349 = new LinkedList();
		field7794 = new MovingParticle[1024];
		field1920 = new ParticleSystem[ParticleLimits.field1419[field7802] + 1];
		field7793 = 0;
		field7792 = 0;
		field12041 = arg1;
	}

    public static void method6866(Toolkit arg0, long arg1) {
		field7801 = field7790;
		field7790 = 0;
		MonotonicTime.get();
		Iterator var3 = field8349.iterator();
		while (var3.hasNext()) {
			ParticleSystem var4 = (ParticleSystem) var3.next();
			boolean var5 = var4.method9934(arg0, arg1);
			if (!var5) {
				var3.remove();
				field1920[field7792] = var4;
				field7792 = field7792 + 1 & ParticleLimits.field1419[field7802];
			}
		}
	}

    public static void method8460(Scene arg0, Toolkit arg1) {
		Iterator var2 = field8349.iterator();
		while (var2.hasNext()) {
			ParticleSystem var3 = (ParticleSystem) var2.next();
			if (var3.field7807) {
				var3.method9941(arg0, arg1);
			}
		}
	}

    public static void method3561() {
		field7800 = new HashTable(8);
		field7796 = 0;
		Iterator var0 = field8349.iterator();
		while (var0.hasNext()) {
			ParticleSystem var1 = (ParticleSystem) var0.next();
			var1.method9968();
		}
	}

    public static void method4293(int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		field7802 = arg0;
		field1920 = new ParticleSystem[ParticleLimits.field1419[field7802] + 1];
		field7793 = 0;
		field7792 = 0;
	}

    public static int method8461() {
		return field7802;
	}
}
