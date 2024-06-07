package com.jagex.game.client;



public class DataType {

    public static final DataType field1644 = new DataType(4, 1);

    public static final DataType field1643 = new DataType(1, 2);

    public static final DataType field1651 = new DataType(2, 4);

    public static final DataType UNSIGNED_INT_8 = new DataType(7, 1);

    public static final DataType UNSIGNED_INT_16 = new DataType(6, 2);

    public static final DataType UNSIGNED_INT_24 = new DataType(5, 3);

    public static final DataType UNSIGNED_INT_32 = new DataType(8, 4);

    public static final DataType FLOAT_16 = new DataType(3, 2);

    public static final DataType FLOAT_32 = new DataType(0, 4);

    public final int index;

    public final int field1652;

	public DataType(int index, int arg1) {
		this.index = index;
		this.field1652 = arg1;
	}
}
