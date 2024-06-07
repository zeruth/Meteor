package com.jagex.graphics;

import deob.ObfuscatedName;

public class ProgramData {

    public String name;

    public String vertexShaderFile;

    public String fragmentShaderFile;

    public ProgramDefineData[] vertexPrograms;

    public ProgramDefineData[] fragmentPrograms;

    public void decode(ShaderDataReader buf) {
		this.name = buf.gstr();
		this.vertexShaderFile = buf.gstr();
		this.fragmentShaderFile = buf.gstr();
		int var2 = buf.g2();
		int var3 = buf.g2();
		this.vertexPrograms = var2 == 0 ? null : new ProgramDefineData[var2];
		this.fragmentPrograms = var3 == 0 ? null : new ProgramDefineData[var3];
		for (int index = 0; index < var2; index++) {
			this.vertexPrograms[index] = new ProgramDefineData();
			this.vertexPrograms[index].decode(buf);
		}
		for (int index = 0; index < var3; index++) {
			this.fragmentPrograms[index] = new ProgramDefineData();
			this.fragmentPrograms[index].decode(buf);
		}
	}
}
