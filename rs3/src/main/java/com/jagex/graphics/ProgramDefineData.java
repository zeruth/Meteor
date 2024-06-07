package com.jagex.graphics;



public class ProgramDefineData {

    public String field2566;

    public String field2565;

    public void decode(ShaderDataReader buf) {
		this.field2566 = buf.gstr();
		this.field2565 = buf.gstr();
	}
}
