package jaclib.memory.heap;

import deob.ObfuscatedName;

public final class NativeHeap {

    public long peer;

    public final int field415;

    public boolean field416;

	public NativeHeap(int arg0) {
		this.field415 = arg0;
		this.allocateHeap(this.field415);
		this.field416 = true;
	}

    public synchronized boolean method91() {
		return this.field416;
	}

    public NativeHeapBuffer method92(int arg0, boolean arg1) {
		if (!this.field416) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

    public synchronized void method93() {
		if (this.field416) {
			this.deallocateHeap();
		}
		this.field416 = false;
	}

	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.method93();
	}

	public native void allocateHeap(int arg0);

	public native void deallocateHeap();

	public synchronized native int allocateBuffer(int arg0, boolean arg1);

	public synchronized native long getBufferAddress(int arg0);

	public synchronized native void get(int arg0, byte[] arg1, int arg2, int arg3, int arg4);

	public synchronized native void put(int arg0, byte[] arg1, int arg2, int arg3, int arg4);

	public synchronized native void deallocateBuffer(int arg0);

	public synchronized native void copy(long arg0, long arg1, int arg2);
}
