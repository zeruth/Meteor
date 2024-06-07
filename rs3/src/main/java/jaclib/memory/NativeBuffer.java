package jaclib.memory;



public class NativeBuffer implements Buffer, Source {

    public int field409 = -1;

    public long field410;

    @Override
    public final int getSize() {
		return this.field409;
	}

    @Override
    public final long getAddress() {
		return this.field410;
	}

    public void method8(byte[] arg0, int arg1, int arg2, int arg3) {
		if (this.field410 == 0L | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field409) {
			throw new RuntimeException();
		}
		this.put(this.field410, arg0, arg1, arg2, arg3);
	}

	public final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

	public final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
