package lzma.sdk.rangecoder;

import deob.ObfuscatedName;

import java.io.IOException;

public class BitTreeDecoder {

    public short[] Models;

    public int NumBitLevels;

	public BitTreeDecoder(int numBitLevels) {
		this.NumBitLevels = numBitLevels;
		this.Models = new short[0x1 << numBitLevels];
	}

    public void init() {
		Decoder.initBitModels(this.Models);
	}

    public int decode(Decoder rangeDecoder) throws IOException {
		int m = 1;
		for (int bitIndex = this.NumBitLevels; bitIndex != 0; bitIndex--) {
			m = (m << 1) + rangeDecoder.decodeBit(this.Models, m);
		}
		return m - (0x1 << this.NumBitLevels);
	}

    public int reverseDecode(Decoder rangeDecoder) throws IOException {
		int m = 1;
		int symbol = 0;
		for (int bitIndex = 0; bitIndex < this.NumBitLevels; bitIndex++) {
			int bit = rangeDecoder.decodeBit(this.Models, m);
			int var6 = m << 1;
			m = bit + var6;
			symbol |= bit << bitIndex;
		}
		return symbol;
	}
}
