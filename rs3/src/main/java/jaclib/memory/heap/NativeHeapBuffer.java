package jaclib.memory.heap;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {

    public final int field411;

    public final NativeHeap field412;

    public final int field413;

    public boolean field414 = true;

	public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
		this.field412 = arg0;
		this.field413 = arg1;
		this.field411 = arg2;
	}

    public final synchronized boolean method80() {
		return this.field412.method91() && this.field414;
	}

    public final long getAddress() {
		return this.field412.getBufferAddress(this.field413);
	}

    public final int getSize() {
		return this.field411;
	}

    public final synchronized void method8(byte[] arg0, int arg1, int arg2, int arg3) {
		if (!this.method80() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field411) {
			throw new RuntimeException();
		}
		this.field412.put(this.field413, arg0, arg1, arg2, arg3);
	}

    public final synchronized void method81() {
		if (this.method80()) {
			this.field412.deallocateBuffer(this.field413);
		}
		this.field414 = false;
	}

	public final synchronized void finalize() throws Throwable {
		super.finalize();
		this.method81();
	}
}
