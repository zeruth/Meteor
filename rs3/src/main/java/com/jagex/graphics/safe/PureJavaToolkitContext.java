package com.jagex.graphics.safe;

import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;


public class PureJavaToolkitContext {

    public PureJavaToolkit field833;

    public Runnable field824;

    public boolean field826;

    public float field865 = 0.85F;

    public float field855 = 1.0F - this.field865;

    public int fadeColour = 0;

    public int field823 = 0;

    public boolean field867 = false;

    public int field832 = 0;

    public int field861 = 0;

    public boolean field834 = true;

    public Matrix4x4 field829 = new Matrix4x4();

    public Matrix4x3 field836 = new Matrix4x3();

    public PureJavaRasteriser rasteriser;

    public Matrix4x3 field838 = new Matrix4x3();

    public Matrix4x4 field828 = new Matrix4x4();

    public Matrix4x4 field868 = new Matrix4x4();

    public int[] field841 = new int[PureJavaModel.field9547];

    public float[] field842 = new float[PureJavaModel.field9547];

    public float[] field843 = new float[PureJavaModel.field9547];

    public float[] field844 = new float[PureJavaModel.field9547];

    public float[] field864 = new float[PureJavaModel.field9547];

    public int[] field846 = new int[8];

    public int[] field847 = new int[8];

    public int[] field848 = new int[8];

    public int[] field849 = new int[10000];

    public int[] field850 = new int[10000];

    public int[] field851;

    public float field840;

    public float field853;

    public float field854;

    public float field857;

    public float field856 = 1.0F;

    public float field839 = 0.0F;

    public float field852 = 1.0F;

    public int field835;

    public float[] field860 = new float[2];

    public PureJavaModel[] field830 = new PureJavaModel[8];

    public PureJavaModel[] field862 = new PureJavaModel[8];

    public float[] field863 = new float[64];

    public float[] field827 = new float[64];

    public float[] field831 = new float[64];

    public float[] field866 = new float[64];

    public float[] field859 = new float[64];

    public float[] field845 = new float[3];

	public PureJavaToolkitContext(PureJavaToolkit arg0) {
		this.field833 = arg0;
		this.rasteriser = new PureJavaRasteriser(arg0, this);
		for (int var2 = 0; var2 < 8; var2++) {
			this.field830[var2] = new PureJavaModel(this.field833);
			this.field862[var2] = new PureJavaModel(this.field833);
		}
		this.field851 = new int[PureJavaModel.field9564];
		for (int var3 = 0; var3 < PureJavaModel.field9564; var3++) {
			this.field851[var3] = -1;
		}
	}

    public void method999() {
		this.rasteriser = new PureJavaRasteriser(this.field833, this);
	}

    public void setThread(Runnable arg0) {
		this.field824 = arg0;
	}
}
