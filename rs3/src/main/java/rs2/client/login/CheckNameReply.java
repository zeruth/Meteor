package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;


public class CheckNameReply implements SerializableEnum {

    public static final CheckNameReply field8407 = new CheckNameReply(-2);

    public static final CheckNameReply field8405 = new CheckNameReply(-3);

    public static final CheckNameReply field8406 = new CheckNameReply(2);

    public static final CheckNameReply field8404 = new CheckNameReply(3);

    public static final CheckNameReply field8408 = new CheckNameReply(4);

    public static final CheckNameReply field8409 = new CheckNameReply(5);

    public static final CheckNameReply field8412 = new CheckNameReply(6);

    public static final CheckNameReply field8411 = new CheckNameReply(7);

    public static final CheckNameReply field8410 = new CheckNameReply(8);

    public final int field8413;

    public static CheckNameReply[] method6019() {
		return new CheckNameReply[] { field8408, field8407, field8404, field8405, field8409, field8412, field8406, field8411, field8410 };
	}

	public CheckNameReply(int arg0) {
		this.field8413 = arg0;
	}

    public int getId() {
		return this.field8413;
	}
}
