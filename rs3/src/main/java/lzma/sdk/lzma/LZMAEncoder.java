package lzma.sdk.lzma;

import lzma.sdk.rangecoder.BitTreeEncoder;

import lzma.sdk.rangecoder.RangeCoderEncoder;

public class LZMAEncoder {

    public static byte[] g_FastPos = new byte[2048];

    public Optimal[] _optimum;

    public BitTreeEncoder[] _posSlotEncoder;

	static {
		byte kFastSlots = 22;
		int c = 2;
		g_FastPos[0] = 0;
		g_FastPos[1] = 1;
		for (int slotFast = 2; slotFast < kFastSlots; slotFast++) {
			int k = 0x1 << (slotFast >> 1) - 1;
			for (int j = 0; j < k; j++, c++) {
				g_FastPos[c] = (byte) slotFast;
			}
		}
	}

	// line 48
	public LZMAEncoder() {
		Base.stateInit(); // _state

		this._optimum = new Optimal[4096];
		new RangeCoderEncoder(); // _rangeEncoder
		this._posSlotEncoder = new BitTreeEncoder[4];
		new BitTreeEncoder(4); // _posAlignEncoder
		new LenPriceTableEncoder(this); // _lenEncoder
		new LenPriceTableEncoder(this); // _repMatchLenEncoder
		new LiteralEncoder(this); // _literalEncoder

		for (int i = 0; i < 4096; i++) {
			this._optimum[i] = new Optimal(this);
		}

		for (int i = 0; i < 4; i++) {
			this._posSlotEncoder[i] = new BitTreeEncoder(6);
		}
	}

    public static class LiteralEncoder {

		// $FF: synthetic field
		public final LZMAEncoder this$0;

		// line 54
		public LiteralEncoder(LZMAEncoder arg0) {
			this.this$0 = arg0;
		}
	}

    public static class LenEncoder {

		// $FF: synthetic field
		public final LZMAEncoder this$0;

        public BitTreeEncoder[] _lowCoder;

        public BitTreeEncoder[] _midCoder;

		// line 65
		public LenEncoder(LZMAEncoder arg0) {
			this.this$0 = arg0;
			this._lowCoder = new BitTreeEncoder[16];
			this._midCoder = new BitTreeEncoder[16];
			new BitTreeEncoder(8); // _highCoder

			for (int posState = 0; posState < 16; posState++) {
				this._lowCoder[posState] = new BitTreeEncoder(3);
				this._midCoder[posState] = new BitTreeEncoder(3);
			}
		}
	}

    public static class LenPriceTableEncoder extends LenEncoder {

		// $FF: synthetic field
		public final LZMAEncoder this$0;

		// line 74
		public LenPriceTableEncoder(LZMAEncoder arg0) {
			super(arg0);
			this.this$0 = arg0;
		}
	}

    public static class Optimal {

		// $FF: synthetic field
		public final LZMAEncoder this$0;

		// line 78
		public Optimal(LZMAEncoder arg0) {
			this.this$0 = arg0;
		}
	}
}
