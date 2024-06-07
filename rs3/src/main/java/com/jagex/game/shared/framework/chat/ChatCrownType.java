package com.jagex.game.shared.framework.chat;

import com.jagex.core.constants.SerializableEnum;


public class ChatCrownType implements SerializableEnum {

    public static final ChatCrownType field3610 = new ChatCrownType(0, -1, true, false, true);

    public static final ChatCrownType field3608 = new ChatCrownType(1, 0, true, true, true);

    public static final ChatCrownType field3600 = new ChatCrownType(2, 1, true, true, false);

    public static final ChatCrownType field3601 = new ChatCrownType(3, 8, false, true, true);

    public static final ChatCrownType field3598 = new ChatCrownType(4, 9, false, false, true);

    public static final ChatCrownType field3603 = new ChatCrownType(5, 10, false, true, true);

    public static final ChatCrownType field3604 = new ChatCrownType(6, 11, false, false, true);

    public static final ChatCrownType field3605 = new ChatCrownType(7, 12, false, false, true);

    public static final ChatCrownType field3606 = new ChatCrownType(8, 13, false, false, true);

    public final int field3607;

    public final int img;

    public final boolean field3609;

    public final boolean ignorable;

    public static ChatCrownType[] method6043() {
		return new ChatCrownType[] { field3605, field3600, field3603, field3601, field3604, field3606, field3608, field3610, field3598 };
	}

	public ChatCrownType(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
		this.field3607 = arg0;
		this.img = arg1;
		this.field3609 = arg3;
		this.ignorable = arg4;
	}

    public int getId() {
		return this.field3607;
	}
}
