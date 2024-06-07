package rs2.client.logic.chat;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.shared.framework.chat.ChatCrownType;


public class ChatLine extends SecondaryNode {

    public int uid = ChatHistory.method8480();

    public long time = MonotonicTime.get();

    public int type;

    public int flags;

    public String name;

    public String nameUnfiltered;

    public String nameSimple;

    public String clan;

    public int phrase;

    public String message;

    public ChatCrownType crown;

	public ChatLine(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7, ChatCrownType arg8) {
		this.type = arg0;
		this.flags = arg1;
		this.name = arg2;
		this.nameUnfiltered = arg3;
		this.nameSimple = arg4;
		this.clan = arg5;
		this.phrase = arg6;
		this.message = arg7;
		this.crown = arg8;
	}

    public void method19429(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7, ChatCrownType arg8) {
		this.uid = ChatHistory.method8480();
		this.time = MonotonicTime.get();
		this.type = arg0;
		this.flags = arg1;
		this.name = arg2;
		this.nameUnfiltered = arg3;
		this.nameSimple = arg4;
		this.clan = arg5;
		this.phrase = arg6;
		this.message = arg7;
		this.crown = arg8;
	}
}
