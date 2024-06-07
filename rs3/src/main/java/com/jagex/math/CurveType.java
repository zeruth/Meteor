package com.jagex.math;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;


public class CurveType implements SerializableEnum {

    public static final CurveType field1251 = new CurveType(0, 0);

    public static final CurveType field1250 = new CurveType(1, 1);

    public static final CurveType field1245 = new CurveType(2, 2);

    public static final CurveType field1247 = new CurveType(3, 3);

    public static final CurveType field1249 = new CurveType(4, 4);

    public static final CurveType field1246 = new CurveType(5, 5);

    public static final CurveType field1248 = new CurveType(6, 6);

    public static final CurveType field1252 = new CurveType(7, 7);

    public static final CurveType field1253 = new CurveType(8, 8);

    public final int field1254;

    public final int field1255;

    public static CurveType[] method2582() {
		return new CurveType[] { field1251, field1250, field1245, field1247, field1249, field1246, field1248, field1252, field1253 };
	}

	public CurveType(int arg0, int arg1) {
		this.field1254 = arg0;
		this.field1255 = arg1;
	}

    public int getId() {
		return this.field1255;
	}

    public static CurveType method2995(int arg0) {
		CurveType var1 = (CurveType) SerializableEnums.decode(method2582(), arg0);
		if (var1 == null) {
			var1 = field1253;
		}
		return var1;
	}
}
