package com.jagex.core.constants;



public class BuildAreaSize {

    public static final BuildAreaSize STANDARD = new BuildAreaSize(0, 104);

    public static final BuildAreaSize SIZE_120 = new BuildAreaSize(1, 120);

    public static final BuildAreaSize SIZE_136 = new BuildAreaSize(2, 136);

    public static final BuildAreaSize SIZE_168 = new BuildAreaSize(3, 168);

    public static final BuildAreaSize CONSTRUCTION = new BuildAreaSize(4, 72);

    public static final BuildAreaSize SIZE_256 = new BuildAreaSize(5, 256);

    public final int id;

    public final int size;

	public BuildAreaSize(int id, int size) {
		this.id = id;
		this.size = size;
	}

    public static BuildAreaSize[] values() {
		return new BuildAreaSize[] {SIZE_168, CONSTRUCTION, STANDARD, SIZE_256, SIZE_120, SIZE_136};
	}

    public static BuildAreaSize buildAreaSizeForId(int id) {
		BuildAreaSize[] values = values();
		for (int index = 0; index < values.length; index++) {
			BuildAreaSize buildAreaSize = values[index];
			if (buildAreaSize.id == id) {
				return buildAreaSize;
			}
		}
		return null;
	}
}
