package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;


public class ConnectReply implements SerializableEnum {

    public static final ConnectReply field8367 = new ConnectReply(-1);

    public static final ConnectReply field8361 = new ConnectReply(-2);

    public static final ConnectReply field8368 = new ConnectReply(-3);

    public static final ConnectReply field8360 = new ConnectReply(-4);

    public static final ConnectReply field8363 = new ConnectReply(-5);

    public static final ConnectReply field8364 = new ConnectReply(2);

    public static final ConnectReply field8365 = new ConnectReply(3);

    public static final ConnectReply field8366 = new ConnectReply(7);

    public static final ConnectReply field8359 = new ConnectReply(9);

    public static final ConnectReply field8362 = new ConnectReply(37);

    public final int field8369;

    public static ConnectReply[] method16743() {
		return new ConnectReply[] { field8365, field8359, field8360, field8366, field8368, field8361, field8367, field8362, field8363, field8364 };
	}

	public ConnectReply(int arg0) {
		this.field8369 = arg0;
	}

    public int getId() {
		return this.field8369;
	}
}
