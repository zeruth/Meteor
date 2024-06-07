package com.jagex.graphics;

import com.jagex.core.datastruct.SoftLruHashTable;


public class MaterialTextureProvider {

    public final GpuToolkit field3269;

    public final TextureList field3268;

    public SoftLruHashTable field3267 = new SoftLruHashTable(10485760, 256);

	public MaterialTextureProvider(GpuToolkit arg0, TextureList arg1) {
		this.field3269 = arg0;
		this.field3268 = arg1;
	}

    public GpuTexture method5639(Material arg0) {
		return this.method5645(arg0, arg0.size);
	}

    public GpuTexture method5645(Material arg0, int arg1) {
		long var3 = (long) (arg1 << 16 | arg0.field1329);
		GpuTexture var5 = (GpuTexture) this.field3267.get(var3);
		if (var5 != null) {
			return var5;
		} else if (this.method5642(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.size;
			}
			GpuTexture var7;
			if (arg0.field1336 && this.field3269.isBloomEnabled()) {
				float[] var6 = this.field3268.method1984(TextureRelated2.field7586, arg0.diffuseTexture, arg0.field1302, 0.7F, arg1, arg1, false);
				var7 = this.field3269.method15992(TextureFormat.RGBA, arg1, arg1, true, var6);
			} else {
				int[] var8;
				if (MaterialAlphaMode.NONE == arg0.alphaMode && Material.method261(arg0.effect)) {
					var8 = this.field3268.getTexture(TextureRelated2.field7586, arg0.diffuseTexture, 0.7F, arg1, arg1, true);
				} else {
					var8 = this.field3268.getSpecialTexture(TextureRelated2.field7586, arg0.diffuseTexture, 0.7F, arg1, arg1, false);
				}
				if (var8 == null) {
					return null;
				}
				var7 = this.field3269.method16204(arg1, arg1, true, var8);
			}
			var7.setWarp(arg0.repeatS == 1, arg0.repeatT == 1);
			this.field3267.put(var7, var3, arg1 * arg1);
			return var7;
		} else {
			return null;
		}
	}

    public boolean method5642(Material arg0, int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.size;
		}
		if (arg0.field1336 && this.field3269.isBloomEnabled()) {
			return this.field3268.loadTexture(TextureRelated2.field7586, arg0.diffuseTexture, arg0.field1302, TextureRelated1.field7570, 0.7F, arg1, arg1, false);
		} else if (MaterialAlphaMode.NONE == arg0.alphaMode && Material.method261(arg0.effect)) {
			return this.field3268.loadTexture(TextureRelated2.field7586, arg0.diffuseTexture, -1, TextureRelated1.field7568, 0.7F, arg1, arg1, true);
		} else {
			return this.field3268.loadTexture(TextureRelated2.field7586, arg0.diffuseTexture, -1, TextureRelated1.field7569, 0.7F, arg1, arg1, false);
		}
	}

    public void method5643() {
		this.field3267.clean(5);
	}

    public void method5644() {
		this.field3267.reset();
	}
}
