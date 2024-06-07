package lzma.sdk.lzma;



public class Base {

    public static final int stateInit() {
		return 0;
	}

    public static final int stateUpdateChar(int index) {
		if (index < 4) {
			return 0;
		} else if (index < 10) {
			return index - 3;
		} else {
			return index - 6;
		}
	}

    public static final int stateUpdateMatch(int index) {
		return index < 7 ? 7 : 10;
	}

    public static final int stateUpdateRep(int index) {
		return index < 7 ? 8 : 11;
	}

    public static final int stateUpdateShortRep(int index) {
		return index < 7 ? 9 : 11;
	}

    public static final boolean stateIsCharState(int index) {
		return index < 7;
	}

    public static final int getLenToPosState(int len) {
		int var1 = len - 2;
		return var1 < 4 ? var1 : 3;
	}
}
