package com.jagex.graphics;

import com.jagex.game.client.DataType;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

public class VertexDeclarationElementComponent {

    public static final VertexDeclarationElementComponent VERTEX = new VertexDeclarationElementComponent(4, 0, 3, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent NORMAL = new VertexDeclarationElementComponent(11, 1, 3, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent COLOR = new VertexDeclarationElementComponent(2, 2, 4, DataType.UNSIGNED_INT_8);

    public static final VertexDeclarationElementComponent TEX_COORD_1 = new VertexDeclarationElementComponent(7, 3, 1, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent TEX_COORD_2 = new VertexDeclarationElementComponent(5, 4, 2, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent TEX_COORD_3 = new VertexDeclarationElementComponent(3, 5, 3, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent TEX_COORD_4 = new VertexDeclarationElementComponent(9, 6, 4, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent field3307 = new VertexDeclarationElementComponent(10, 7, 4, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent field3308 = new VertexDeclarationElementComponent(1, 8, 4, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent field3309 = new VertexDeclarationElementComponent(0, 9, 4, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent field3314 = new VertexDeclarationElementComponent(8, 10, 3, DataType.FLOAT_32);

    public static final VertexDeclarationElementComponent field3315 = new VertexDeclarationElementComponent(6, 11, 3, DataType.FLOAT_32);

    public final int field3312;

    public static final int field3302 = IntMath.ilog(16);

    public final int field3316;

    public final int size;

    public final int field3317;

    public final DataType field3318;

	public VertexDeclarationElementComponent(int arg0, int arg1, int arg2, DataType arg3) {
		this.field3312 = arg0;
		this.field3316 = arg1;
		this.field3317 = arg2;
		this.field3318 = arg3;
		this.size = this.field3318.field1652 * this.field3317;
		if (this.field3316 >= 16) {
			throw new RuntimeException();
		}
	}

    public static VertexDeclarationElementComponent method5692(int arg0) {
		switch(arg0) {
			case 0:
				return VERTEX;
			case 1:
				return NORMAL;
			case 2:
				return COLOR;
			case 3:
				return TEX_COORD_1;
			case 4:
				return TEX_COORD_2;
			case 5:
				return TEX_COORD_3;
			case 6:
				return TEX_COORD_4;
			default:
				return null;
		}
	}
}
