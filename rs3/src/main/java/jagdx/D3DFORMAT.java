package jagdx;



public class D3DFORMAT {

	public static final int D3DFMT_UNKNOWN = 0;

	public static final int D3DFMT_A8R8G8B8 = 21;

	public static final int D3DFMT_X8R8G8B8 = 22;

	public static final int D3DFMT_R5G6B5 = 23;

	public static final int D3DFMT_A8 = 28;

	public static final int D3DFMT_L8 = 50;

	public static final int D3DFMT_A8L8 = 51;

	public static final int D3DFMT_D24X8 = 77;

	public static final int D3DFMT_D16 = 80;

	public static final int D3DFMT_INDEX16 = 101;

	public static final int D3DFMT_INDEX32 = 102;

	public static final int D3DFMT_A16B16G16R16F = 113;

	public static final int D3DFMT_A32B32G32R32F = 116;

	public static final int D3DFMT_DXT1 = makeFourCC('D', 'X', 'T', '1');

	public static final int D3DFMT_DXT5 = makeFourCC('D', 'X', 'T', '5');

	public D3DFORMAT() throws Throwable {
		throw new Error();
	}

	private static int makeFourCC( char c1, char c2, char c3, char c4) {
		return (c1 & 0xFF) << 0 | (c2 & 0xFF) << 8 | (c3 & 0xFF) << 16 | (c4 & 0xFF) << 24;
	}
}
