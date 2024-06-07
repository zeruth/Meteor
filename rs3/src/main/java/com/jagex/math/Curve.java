package com.jagex.math;

import com.jagex.core.io.Packet;
import com.jagex.graphics.KeyFrame;
import com.jagex.graphics.TransformInfinityType;


public class Curve {

    public boolean field1435;

    public boolean field1444;

    public TransformInfinityType field1437;

    public TransformInfinityType field1438;

    public KeyFrame[] field1439;

    public boolean field1440;

    public float field1441;

    public float field1443;

    public float[] field1449 = new float[4];

    public float[] field1442 = new float[4];

    public boolean field1445 = true;

    public int field1446 = 0;

    public float[] field1447;

    public float field1448;

    public float field1436;

    public int method2036(Packet arg0, int arg1) {
		int var3 = arg0.g2();
		CurveType.method2995(arg0.g1());
		this.field1437 = TransformInfinityType.method713(arg0.g1());
		this.field1438 = TransformInfinityType.method713(arg0.g1());
		this.field1435 = arg0.g1() != 0;
		this.field1439 = new KeyFrame[var3];
		KeyFrame var4 = null;
		for (int var5 = 0; var5 < var3; var5++) {
			KeyFrame var6 = new KeyFrame();
			var6.method2673(arg0, arg1);
			this.field1439[var5] = var6;
			if (var4 != null) {
				var4.field1665 = var6;
			}
			var4 = var6;
		}
		this.field1447 = new float[this.method2020() + 1];
		for (int var7 = this.method2018(); var7 <= this.method2029(); var7++) {
			this.field1447[var7 - this.method2018()] = CurveEvaluator.method9083(this, (float) var7);
		}
		this.field1448 = CurveEvaluator.method9083(this, (float) (this.method2018() - 1));
		this.field1436 = CurveEvaluator.method9083(this, (float) (this.method2029() + 1));
		return var3;
	}

    public float method2017(int arg0) {
		if (arg0 < this.method2018()) {
			return this.field1448;
		} else if (arg0 > this.method2029()) {
			return this.field1436;
		} else {
			return this.field1447[arg0 - this.method2018()];
		}
	}

    public int method2018() {
		return this.field1439 == null ? 0 : this.field1439[0].field1663;
	}

    public int method2029() {
		return this.field1439 == null ? 0 : this.field1439[this.method2015() - 1].field1663;
	}

    public int method2020() {
		return this.method2029() - this.method2018();
	}

    public int method2021(float arg0) {
		if (this.field1446 >= 0 && (float) this.field1439[this.field1446].field1663 <= arg0 && (this.field1439[this.field1446].field1665 == null || (float) this.field1439[this.field1446].field1665.field1663 > arg0)) {
			return this.field1446;
		} else if (arg0 < (float) this.method2018() || arg0 > (float) this.method2029()) {
			return -1;
		} else {
			int var2 = this.method2015();
			int var3 = this.field1446;
			if (var2 > 0) {
				int var4 = 0;
				int var5 = var2 - 1;
				do {
					int var6 = var4 + var5 >> 1;
					if (arg0 < (float) this.field1439[var6].field1663) {
						if (arg0 > (float) this.field1439[var6 - 1].field1663) {
							var3 = var6 - 1;
							break;
						}
						var5 = var6 - 1;
					} else {
						if (!(arg0 > (float) this.field1439[var6].field1663)) {
							var3 = var6;
							break;
						}
						if (arg0 < (float) this.field1439[var6 + 1].field1663) {
							var3 = var6;
							break;
						}
						var4 = var6 + 1;
					}
				} while (var4 <= var5);
			}
			if (this.field1446 != var3) {
				this.field1446 = var3;
				this.field1445 = true;
			}
			return this.field1446;
		}
	}

    public KeyFrame method2022(float arg0) {
		int var2 = this.method2021(arg0);
		return var2 >= 0 && var2 < this.field1439.length ? this.field1439[var2] : null;
	}

    public int method2015() {
		return this.field1439 == null ? 0 : this.field1439.length;
	}
}
