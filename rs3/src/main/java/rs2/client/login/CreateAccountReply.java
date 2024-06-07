package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class CreateAccountReply implements SerializableEnum {

    public static final CreateAccountReply field8390 = new CreateAccountReply(-2);

    public static final CreateAccountReply field8388 = new CreateAccountReply(-3);

    public static final CreateAccountReply field8373 = new CreateAccountReply(2);

    public static final CreateAccountReply field8378 = new CreateAccountReply(3);

    public static final CreateAccountReply field8375 = new CreateAccountReply(4);

    public static final CreateAccountReply field8376 = new CreateAccountReply(5);

    public static final CreateAccountReply field8377 = new CreateAccountReply(6);

    public static final CreateAccountReply field8379 = new CreateAccountReply(7);

    public static final CreateAccountReply field8372 = new CreateAccountReply(8);

    public static final CreateAccountReply field8380 = new CreateAccountReply(9);

    public static final CreateAccountReply field8381 = new CreateAccountReply(10);

    public static final CreateAccountReply field8382 = new CreateAccountReply(20);

    public static final CreateAccountReply field8383 = new CreateAccountReply(21);

    public static final CreateAccountReply field8384 = new CreateAccountReply(30);

    public static final CreateAccountReply field8385 = new CreateAccountReply(31);

    public static final CreateAccountReply field8386 = new CreateAccountReply(32);

    public static final CreateAccountReply field8374 = new CreateAccountReply(33);

    public static final CreateAccountReply field8371 = new CreateAccountReply(34);

    public static final CreateAccountReply field8389 = new CreateAccountReply(38);

    public final int field8387;

    public static CreateAccountReply[] method4614() {
		return new CreateAccountReply[] { field8385, field8388, field8372, field8386, field8377, field8375, field8379, field8380, field8382, field8384, field8389, field8378, field8390, field8381, field8376, field8373, field8374, field8371, field8383 };
	}

	public CreateAccountReply(int arg0) {
		this.field8387 = arg0;
	}

    public int getId() {
		return this.field8387;
	}
}
