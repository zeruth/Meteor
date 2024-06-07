package com.jagex.graphics;

import deob.ObfuscatedName;

public abstract class VertexDeclaration implements DeletableResource {

    public final VertexDeclarationElement[] elements;

	public VertexDeclaration(VertexDeclarationElement[] arg0) {
		this.elements = arg0;
	}
}
