package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class CheckEmailReply implements SerializableEnum {

    public static final CheckEmailReply field8397 = new CheckEmailReply(-2);

    public static final CheckEmailReply field8400 = new CheckEmailReply(-3);

    public static final CheckEmailReply field8399 = new CheckEmailReply(2);

    public static final CheckEmailReply field8402 = new CheckEmailReply(3);

    public static final CheckEmailReply field8401 = new CheckEmailReply(21);

    public static final CheckEmailReply field8398 = new CheckEmailReply(20);

    public final int field8403;

	public CheckEmailReply(int arg0) {
		this.field8403 = arg0;
	}

    public static CheckEmailReply[] method4289() {
        return new CheckEmailReply[] {field8397, field8402, field8401, field8400, field8399, field8398};
    }

    public int getId() {
		return this.field8403;
	}
}
