package com.jagex.graphics;



public class RendererInfo {

    public final int toolkitId;

    public final String name;

    public final int version;

    public final String device;

    public final long driverVersion;

	public RendererInfo(int toolkitId, String name, int version, String device, long arg4, boolean arg5) {
		this.toolkitId = toolkitId;
		this.name = name;
		this.version = version;
		this.device = device;
		this.driverVersion = arg4;
	}
}
