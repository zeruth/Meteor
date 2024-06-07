package com.jagex.game.shared.movement;



public class CoordGrid {

    public int level;

    public int x;

    public int z;

	public CoordGrid() {
		this.level = -1;
	}

	public CoordGrid(int level, int x, int z) {
		this.level = level;
		this.x = x;
		this.z = z;
	}

	public CoordGrid(int packed) {
		if (packed == -1) {
			this.level = -1;
		} else {
			this.level = packed >> 28 & 0x3;
			this.x = packed >> 14 & 0x3FFF;
			this.z = packed & 0x3FFF;
		}
	}

    public void fromFine(CoordFine fine) {
		this.level = fine.level;
		this.x = fine.x >> 9;
		this.z = fine.z >> 9;
	}

    public int pack() {
		return this.level << 28 | this.x << 14 | this.z;
	}

	public boolean equals(Object other) {
		if (other == this) {
			return true;
		} else if (other instanceof CoordGrid) {
			return this.matches((CoordGrid) other);
		} else {
			return false;
		}
	}

    public boolean matches(CoordGrid other) {
		return this.matches(other.level, other.x, other.z);
	}

    public boolean matches(int level, int x, int z) {
		if (this.level != level) {
			return false;
		} else if (this.x == x) {
			return this.z == z;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.pack();
	}

	public String toString() {
		return this.debug(",");
	}

    public String debug(String separator) {
		// e.g. 3222,3222,0 -> 0_50_50_22_22
		return this.level + separator + (this.x >> 6) + separator + (this.z >> 6) + separator + (this.x & 0x3F) + separator + (this.z & 0x3F);
	}
}
