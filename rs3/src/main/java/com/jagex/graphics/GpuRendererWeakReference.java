package com.jagex.graphics;



import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class GpuRendererWeakReference extends WeakReference {

    public final int field12489;

    public GpuRendererWeakReference field12488;

	public GpuRendererWeakReference(Object arg0, ReferenceQueue arg1, int arg2, Object arg3) {
		super(arg0, arg1);
		this.field12489 = arg2;
	}
}
