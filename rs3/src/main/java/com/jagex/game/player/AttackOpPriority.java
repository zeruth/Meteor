package com.jagex.game.player;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class AttackOpPriority implements SerializableEnum {

    public static final AttackOpPriority field7906 = new AttackOpPriority(2, 0);

    public static final AttackOpPriority field7908 = new AttackOpPriority(1, 1);

    public static final AttackOpPriority field7909 = new AttackOpPriority(3, 2);

    public static final AttackOpPriority field7907 = new AttackOpPriority(0, 3);

    public final int field7905;

    public final int field7910;

    public static AttackOpPriority[] method10149() {
		return new AttackOpPriority[] { field7907, field7908, field7906, field7909 };
	}

	public AttackOpPriority(int arg0, int arg1) {
		this.field7905 = arg0;
		this.field7910 = arg1;
	}

    public int getId() {
		return this.field7910;
	}
}
