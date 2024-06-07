package com.jagex.math;

import com.jagex.core.io.Packet;


public class Vector3 {

    public static Vector3[] pool;

    public static int poolCapacity;

    public static int poolSize;

    public float x;

    public float y;

    public float z;

	static {
		new Vector3(0.0F, 0.0F, 0.0F);
		new Vector3(1.0F, 1.0F, 1.0F);
		pool = new Vector3[0];
	}

    public static void init(int arg0) {
		poolCapacity = arg0;
		pool = new Vector3[arg0];
		poolSize = 0;
	}

    public static Vector3 create() {
		Vector3[] var0 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Vector3();
			} else {
				pool[--poolSize].reset();
				return pool[poolSize];
			}
		}
	}

    public static Vector3 create(float arg0, float arg1, float arg2) {
		Vector3[] var3 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Vector3(arg0, arg1, arg2);
			} else {
				pool[--poolSize].setTo(arg0, arg1, arg2);
				return pool[poolSize];
			}
		}
	}

    public static Vector3 create(Vector3 arg0) {
		Vector3[] var1 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Vector3(arg0);
			} else {
				pool[--poolSize].setTo(arg0);
				return pool[poolSize];
			}
		}
	}

    public static Vector3 create(Packet arg0) {
		Vector3[] var1 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Vector3(arg0);
			} else {
				pool[--poolSize].decode(arg0);
				return pool[poolSize];
			}
		}
	}

    public void release() {
		Vector3[] var1 = pool;
		synchronized (pool) {
			if (poolSize < poolCapacity - 1) {
				pool[poolSize++] = this;
			}
		}
	}

	public Vector3() {
	}

	public Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3(Vector3 vector3) {
		this.x = vector3.x;
		this.y = vector3.y;
		this.z = vector3.z;
	}

	public Vector3(Packet buf) {
		this.x = buf.gFloat();
		this.y = buf.gFloat();
		this.z = buf.gFloat();
	}

    public void decode(Packet buf) {
		this.x = buf.gFloat();
		this.y = buf.gFloat();
		this.z = buf.gFloat();
	}

    public void setTo(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

    public void setTo(Vector3 vector3) {
		this.setTo(vector3.x, vector3.y, vector3.z);
	}

    public final void reset() {
		this.z = 0.0F;
		this.y = 0.0F;
		this.x = 0.0F;
	}

    public boolean isEqualTo(Vector3 other) {
		return this.x == other.x && this.y == other.y && this.z == other.z;
	}

    public final void negate() {
		this.x = -this.x;
		this.y = -this.y;
		this.z = -this.z;
	}

    public final void normalise() {
		float var1 = 1.0F / this.length();
		this.x *= var1;
		this.y *= var1;
		this.z *= var1;
	}

    public final void add(Vector3 other) {
		this.x += other.x;
		this.y += other.y;
		this.z += other.z;
	}

    public final void addScaled(Vector3 other, float factor) {
		this.x += other.x * factor;
		this.y += other.y * factor;
		this.z += other.z * factor;
	}

    public static final Vector3 add(Vector3 a, Vector3 b) {
		Vector3 var2 = create(a);
		var2.add(b);
		return var2;
	}

    public final void sub(Vector3 other) {
		this.x -= other.x;
		this.y -= other.y;
		this.z -= other.z;
	}

    public static final Vector3 sub(Vector3 a, Vector3 b) {
		Vector3 var2 = create(a);
		var2.sub(b);
		return var2;
	}

    public final float dot(Vector3 other) {
		return this.z * other.z + this.y * other.y + this.x * other.x;
	}

    public static final float dot(Vector3 a, Vector3 b) {
		return a.dot(b);
	}

    public final void cross(Vector3 other) {
		this.setTo(this.y * other.z - this.z * other.y, this.z * other.x - this.x * other.z, this.x * other.y - this.y * other.x);
	}

    public static final Vector3 cross(Vector3 a, Vector3 b) {
		Vector3 var2 = create(a);
		var2.cross(b);
		return var2;
	}

    public final float length() {
		return (float) Math.sqrt((double) (this.z * this.z + this.y * this.y + this.x * this.x));
	}

    public final void abs() {
		if (this.x < 0.0F) {
			this.x *= -1.0F;
		}
		if (this.y < 0.0F) {
			this.y *= -1.0F;
		}
		if (this.z < 0.0F) {
			this.z *= -1.0F;
		}
	}

    public final void multiply(Vector3 other) {
		this.x *= other.x;
		this.y *= other.y;
		this.z *= other.z;
	}

    public static final Vector3 multiply(Vector3 a, Vector3 b) {
		Vector3 var2 = create(a);
		var2.multiply(b);
		return var2;
	}

    public final void multiply(float arg0) {
		this.x *= arg0;
		this.y *= arg0;
		this.z *= arg0;
	}

    public final void divide(Vector3 arg0) {
		this.x /= arg0.x;
		this.y /= arg0.y;
		this.z /= arg0.z;
	}

    public static final Vector3 divide(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = create(arg0);
		var2.divide(arg1);
		return var2;
	}

    public final void divide(float arg0) {
		this.x /= arg0;
		this.y /= arg0;
		this.z /= arg0;
	}

    public static final Vector3 multiply(Vector3 arg0, float arg1) {
		Vector3 var2 = create(arg0);
		var2.multiply(arg1);
		return var2;
	}

    public final void rotate(Quaternion arg0) {
		Quaternion var2 = Quaternion.create(this.x, this.y, this.z, 0.0F);
		Quaternion var3 = Quaternion.opposite(arg0);
		Quaternion var4 = Quaternion.multiply(var3, var2);
		var4.multiply(arg0);
		this.setTo(var4.w, var4.x, var4.y);
		var2.release();
		var3.release();
		var4.release();
	}

    public final void method6567(Matrix4x3 arg0) {
		float var2 = this.x;
		float var3 = this.y;
		this.x = this.z * arg0.entry20 + arg0.entry10 * var3 + arg0.entry00 * var2 + arg0.entry30;
		this.y = this.z * arg0.entry21 + arg0.entry11 * var3 + arg0.entry01 * var2 + arg0.entry31;
		this.z = this.z * arg0.entry22 + arg0.entry12 * var3 + arg0.entry02 * var2 + arg0.entry32;
	}

    public final void method6521(Matrix4x3 arg0) {
		float var2 = this.x;
		float var3 = this.y;
		this.x = this.z * arg0.entry20 + arg0.entry10 * var3 + arg0.entry00 * var2;
		this.y = this.z * arg0.entry21 + arg0.entry11 * var3 + arg0.entry01 * var2;
		this.z = this.z * arg0.entry22 + arg0.entry12 * var3 + arg0.entry02 * var2;
	}

    public final void method6562(Vector3 arg0, float arg1) {
		this.multiply(1.0F - arg1);
		this.add(multiply(arg0, arg1));
	}

	public String toString() {
		return this.x + ", " + this.y + ", " + this.z;
	}
}
