package jagdx;



public class HRESULT {

	private static final int anInt4220 = 2166;

	public static final int anInt4221 = 0;

	public static final int anInt4222 = 0x88760869;

	public static final int anInt4223 = 1;

	public HRESULT() throws Throwable {
		throw new Error();
	}

	public static final boolean FAILED( int arg0) {
		return arg0 < 0;
	}

	public static final boolean SUCCEEDED( int arg0) {
		return arg0 >= 0;
	}
}
