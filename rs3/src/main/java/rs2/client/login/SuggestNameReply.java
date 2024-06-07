package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;


public class SuggestNameReply implements SerializableEnum {

    public static final SuggestNameReply field8394 = new SuggestNameReply(-2);

    public static final SuggestNameReply field8392 = new SuggestNameReply(-3);

    public static final SuggestNameReply field8391 = new SuggestNameReply(2);

    public static final SuggestNameReply field8393 = new SuggestNameReply(3);

    public static final SuggestNameReply field8395 = new SuggestNameReply(4);

    public final int field8396;

    public static SuggestNameReply[] method9840() {
		return new SuggestNameReply[] { field8391, field8395, field8394, field8393, field8392 };
	}

	public SuggestNameReply(int arg0) {
		this.field8396 = arg0;
	}

    public int getId() {
		return this.field8396;
	}
}
