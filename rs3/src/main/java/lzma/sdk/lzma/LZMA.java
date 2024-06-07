package lzma.sdk.lzma;

import com.jagex.core.io.Packet;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class LZMA {

    public static LZMADecoder field6728;

	static {
		new LZMAEncoder();
		field6728 = new LZMADecoder();
	}

	public LZMA() throws Throwable {
		throw new Error();
	}

    public static byte[] decompress(Packet arg0, int arg1) throws IOException {
		ByteArrayInputStream var2 = new ByteArrayInputStream(arg0.data);
		var2.skip(arg0.pos);
		return method4477(var2, arg1);
	}

    public static byte[] method4477(InputStream arg0, int arg1) throws IOException {
		byte[] var2 = new byte[5];
		if (arg0.read(var2, 0, 5) != 5) {
			throw new IOException("2");
		}
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(arg1);
		LZMADecoder var4 = field6728;
		synchronized (var4) {
			if (!field6728.setDecoderProperties(var2)) {
				throw new IOException("3");
			}
			field6728.code(arg0, var3, arg1);
		}
		var3.flush();
		return var3.toByteArray();
	}
}
