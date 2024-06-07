package com.jagex.game.shared.movement;

import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.Serializable;
import com.jagex.core.io.Packet;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

public class CoordFine extends Node implements Serializable {

    public static CoordFine[] field11476 = new CoordFine[0];

    public static int field4608;

    public int level;

    public int x;

    public int y;

    public int z;

    public static CoordFine method258(int arg0, int arg1, int arg2, int arg3) {
		CoordFine[] var4 = field11476;
		synchronized (field11476) {
			if (field4608 == 0) {
				return new CoordFine(arg0, arg1, arg2, arg3);
			} else {
				field11476[--field4608].method17851(arg0, arg1, arg2, arg3);
				return field11476[field4608];
			}
		}
	}

    public static CoordFine method7078(CoordFine arg0) {
		CoordFine[] var1 = field11476;
		synchronized (field11476) {
			if (field4608 == 0) {
				return new CoordFine(arg0);
			} else {
				field11476[--field4608].method17868(arg0);
				return field11476[field4608];
			}
		}
	}

    public static CoordFine method849(int arg0, boolean arg1) {
		CoordFine[] var2 = field11476;
		synchronized (field11476) {
			if (field4608 == 0) {
				return new CoordFine(arg0, arg1);
			} else {
				field11476[--field4608].method17870(arg0, arg1);
				return field11476[field4608];
			}
		}
	}

	public CoordFine() {
		this.level = -1;
	}

	public CoordFine(int level, int x, int arg2, int z) {
		this.level = level;
		this.x = x;
		this.y = arg2;
		this.z = z;
	}

	public CoordFine(CoordFine arg0) {
		this.level = arg0.level;
		this.x = arg0.x;
		this.y = arg0.y;
		this.z = arg0.z;
	}

	public CoordFine(Packet arg0) {
		this.decode(arg0);
	}

	public CoordFine(int arg0, boolean arg1) {
		if (arg0 == -1) {
			this.level = -1;
		} else {
			this.level = arg0 >> 28 & 0x3;
			this.x = (arg0 >> 14 & 0x3FFF) << 9;
			this.y = 0;
			this.z = (arg0 & 0x3FFF) << 9;
			if (arg1) {
				this.x += 256;
				this.z += 256;
			}
		}
	}

    public void method17851(int arg0, int arg1, int arg2, int arg3) {
		this.level = arg0;
		this.x = arg1;
		this.y = arg2;
		this.z = arg3;
	}

    public void method17868(CoordFine arg0) {
		this.level = arg0.level;
		this.x = arg0.x;
		this.y = arg0.y;
		this.z = arg0.z;
	}

    public void method17870(int arg0, boolean arg1) {
		if (arg0 == -1) {
			this.level = -1;
			return;
		}
		this.level = arg0 >> 28 & 0x3;
		this.x = (arg0 >> 14 & 0x3FFF) << 9;
		this.y = 0;
		this.z = (arg0 & 0x3FFF) << 9;
		if (arg1) {
			this.x += 256;
			this.z += 256;
		}
	}

    public Vector3 method17853() {
		return new Vector3((float) this.x, (float) this.y, (float) this.z);
	}

    public void method17852(Packet arg0) {
		arg0.p1(this.level);
		arg0.p4(this.x);
		arg0.p4(this.y);
		arg0.p4(this.z);
	}

    public static int method3582() {
		return 13;
	}

	public String toString() {
		return "Level: " + this.level + " Coord: " + this.x + "," + this.y + "," + this.z + " Coord Split: " + (this.x >> 15) + "," + (this.z >> 15) + "," + (this.x >> 9 & 0x3F) + "," + (this.z >> 9 & 0x3F) + "," + (this.x & 0x1FF) + "," + (this.z & 0x1FF);
	}

    public int computeSize() {
		return method3582();
	}

    public void encode(Packet buf) {
		this.method17852(buf);
	}

    public void decode(Packet buf) {
		this.level = buf.g1();
		this.x = buf.g4s();
		this.y = buf.g4s();
		this.z = buf.g4s();
	}
}
