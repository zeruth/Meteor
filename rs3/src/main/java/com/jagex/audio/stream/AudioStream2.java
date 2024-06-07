package com.jagex.audio.stream;

import com.jagex.audio.backend.AudioMixerRelated;
import com.jagex.audio.api.SoundBackend;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.List;

public class AudioStream2 implements AudioProcessingInterface {

    public SoundBackend field7617;

    public AudioStreamRelated field7616 = AudioStreamRelated.field7627;

    public int field7615;

    public Js5 field7621;

    public AudioMixerRelated field7619;

    public byte[] field7620;

    public boolean field7618;

    public int field7622;

    public SoftLruHashTable field7623;

    public boolean field7624;

	public AudioStream2(Js5 arg0, int arg1, SoundBackend arg2, AudioMixerRelated arg3, SoftLruHashTable arg4) {
		this.field7621 = arg0;
		this.field7615 = arg1;
		this.field7617 = arg2;
		this.field7619 = arg3;
		this.field7623 = arg4;
		this.field7624 = this.field7623 != null;
		this.field7616 = AudioStreamRelated.field7625;
	}

    public void method9672() {
		if (AudioStreamRelated.field7625 != this.field7616) {
			return;
		}
		byte[] var1 = this.field7621.fetchFile(this.field7615);
		if (var1 == null) {
			return;
		}
		this.field7620 = var1;
		this.method9676();
		this.field7616 = AudioStreamRelated.field7626;
		if (this.field7619 != null) {
			this.field7619.method3130(this, var1.length, this.field7615, false);
		}
	}

    public Sound method9710() {
		Sound var1 = new Sound(this.field7617);
		var1.method7376(this);
		return var1;
	}

    public AudioStreamRelated method9674() {
		return this.field7616;
	}

    public boolean method9675() {
		return false;
	}

    public void method9676() {
	}

    public byte[] method9673(int arg0) {
		if (this.field7619 != null) {
			this.field7619.method3131(this);
		}
		return this.field7620;
	}

    public int method9678() {
		return this.field7620 == null ? 0 : this.field7620.length;
	}

    public SoundRelatedType2 method9679() {
		return SoundRelatedType2.field4851;
	}

    public int method9680() {
		return this.field7615;
	}

    public void method9681(Packet arg0) {
		if (this.field7623 == null) {
			return;
		}
		if (this.field7619 != null) {
			this.field7619.method3131(this);
		}
		if (this.field7618) {
			throw new RuntimeException("");
		}
		SoftLruHashTable var2 = this.field7623;
		synchronized (this.field7623) {
			List var3 = this.method9689();
			if (var3 != null) {
				var3.add(arg0);
				this.field7622 += arg0.data.length;
				this.method9688(var3, this.field7622);
			}
		}
	}

    public Packet method9686(int arg0) {
		if (this.field7623 == null) {
			return null;
		}
		Packet var2 = null;
		if (this.field7619 != null) {
			this.field7619.method3131(this);
		}
		SoftLruHashTable var3 = this.field7623;
		synchronized (this.field7623) {
			List var4 = this.method9689();
			if (var4.size() > arg0) {
				var2 = (Packet) var4.get(arg0);
			}
			return var2;
		}
	}

    public boolean method9683(int arg0) {
		if (this.field7623 == null) {
			return false;
		}
		boolean var2 = false;
		SoftLruHashTable var3 = this.field7623;
		synchronized (this.field7623) {
			List var4 = this.method9689();
			if (var4 != null && var4.size() > arg0) {
				var2 = var4.get(arg0) != null;
			}
			return var2;
		}
	}

    public boolean method9702() {
		return this.field7623 != null && this.field7624;
	}

    public int method9685() {
		if (this.field7623 == null) {
			return 0;
		}
		int var1 = 0;
		SoftLruHashTable var2 = this.field7623;
		synchronized (this.field7623) {
			List var3 = this.method9689();
			if (var3 != null) {
				var1 = var3.size();
			}
			return var1;
		}
	}

    public void method9671(boolean arg0) {
		if (this.field7619 != null) {
			this.field7619.method3131(this);
		}
		this.field7618 = arg0;
	}

    public boolean method9687() {
		if (this.field7623 == null) {
			return false;
		}
		List var1 = this.method9689();
		if (var1 == null || var1.size() <= 0) {
			this.field7618 = false;
		}
		return this.field7618;
	}

    public void method9688(List arg0, int arg1) {
		if (this.field7623 == null || arg0 == null || arg1 < 0) {
			return;
		}
		SoftLruHashTable var3 = this.field7623;
		synchronized (this.field7623) {
			this.field7623.method2957((long) this.field7615);
			if (arg1 <= this.field7623.method2925()) {
				this.field7623.put(arg0, (long) this.field7615, arg1);
			} else {
				this.field7624 = false;
				this.field7618 = false;
				this.field7622 = 0;
			}
		}
	}

    public List method9689() {
		if (this.field7623 == null || !this.field7624) {
			return null;
		}
		Object var1 = null;
		SoftLruHashTable var2 = this.field7623;
		synchronized (this.field7623) {
			List var3 = (List) this.field7623.get((long) this.field7615);
			if (var3 == null && this.field7624) {
				var3 = new ArrayList();
				this.field7623.put(var3, (long) this.field7615, 0);
			}
			return var3;
		}
	}
}
