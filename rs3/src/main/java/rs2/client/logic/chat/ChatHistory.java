package rs2.client.logic.chat;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.datastruct.HashTable;
import com.jagex.game.shared.framework.chat.ChatCrownType;

import rs2.client.Client;

import java.util.HashMap;
import java.util.Map;

public class ChatHistory {

    public static final Map field2594 = new HashMap();

    public static final HashTable field2597 = new HashTable(1024);

    public static final SecondaryLinkedList field2596 = new SecondaryLinkedList();

    public static int field2595 = 0;

	public ChatHistory() throws Throwable {
		throw new Error();
	}

    public static int method8480() {
		return ++field2595 - 1;
	}

    public static int lastUid() {
		return field2595 - 1;
	}

    public static void method4943(String arg0) {
		addMessage(0, 0, "", "", "", arg0, null);
	}

    public static void method1006(int arg0, String arg1) {
		addMessage(arg0, 0, "", "", "", arg1, null);
	}

    public static void addMessage(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, ChatCrownType arg6) {
		method15054(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6);
	}

    public static void method15054(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7, ChatCrownType arg8) {
		TypeChatLines var9 = (TypeChatLines) field2594.get(arg0);
		if (var9 == null) {
			var9 = new TypeChatLines();
			field2594.put(arg0, var9);
		}
		ChatLine var10 = var9.method4323(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		field2597.put(var10, (long) var10.uid);
		field2596.pushBack(var10);
		Client.lastOnChatTransmitRedrawCycle = Client.redrawCycle;
	}

    public static ChatLine method7310(int arg0, int arg1) {
		TypeChatLines var2 = (TypeChatLines) field2594.get(arg0);
		return var2.method4322(arg1);
	}

    public static ChatLine method304(int arg0) {
		return (ChatLine) field2597.get((long) arg0);
	}

    public static int length(int arg0) {
		TypeChatLines var1 = (TypeChatLines) field2594.get(arg0);
		return var1 == null ? 0 : var1.method4331();
	}

    public static void clear() {
		field2594.clear();
		field2597.removeAll();
		field2596.removeAll();
		field2595 = 0;
	}

    public static int previousUid(int arg0) {
		ChatLine var1 = (ChatLine) field2597.get((long) arg0);
		if (var1 == null) {
			return -1;
		} else if (field2596.head == var1.secondaryNext) {
			return -1;
		} else {
			return ((ChatLine) var1.secondaryNext).uid;
		}
	}

    public static int nextUid(int arg0) {
		ChatLine var1 = (ChatLine) field2597.get((long) arg0);
		if (var1 == null) {
			return -1;
		} else if (field2596.head == var1.secondaryPrev) {
			return -1;
		} else {
			return ((ChatLine) var1.secondaryPrev).uid;
		}
	}
}
