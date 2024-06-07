package rs2.client.logic;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.utils.JagException;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;

import rs2.client.Client;

public class DelayedStateChange extends SecondaryNode {

    public int int0;

    public int int1;

    public int int2;

    public String str0;

    public static SecondaryLinkedList serverQueue = new SecondaryLinkedList();

    public static SecondaryLinkedList clientQueue = new SecondaryLinkedList();

    public static HashTable cache = new HashTable(16);

    public static boolean lastPushNew = false;

    public static DelayedStateChange cache(int type, long target) {
		lastPushNew = false;
		DelayedStateChange change = (DelayedStateChange) cache.get((long) type << 56 | target);
		if (change == null) {
			change = new DelayedStateChange(type, target);
			cache.put(change, change.nodeId);
			lastPushNew = true;
		}
		return change;
	}

    public static void removeAll() {
		cache.removeAll();
		clientQueue.removeAll();
		serverQueue.removeAll();
	}

    public static DelayedStateChange poll() {
		DelayedStateChange serverChange = (DelayedStateChange) serverQueue.peekFront();
		if (serverChange != null) {
			serverChange.unlink();
			serverChange.secondaryRemove();
			return serverChange;
		}
		DelayedStateChange clientChange;
		do {
			clientChange = (DelayedStateChange) clientQueue.peekFront();
			if (clientChange == null) {
				return null;
			}
			if (clientChange.getTime() > MonotonicTime.get()) {
				return null;
			}
			clientChange.unlink();
			clientChange.secondaryRemove();
		} while ((clientChange.secondaryNodeId & Long.MIN_VALUE) == 0L);
		return clientChange;
	}

    public static void onVarC(VarType arg0) {
		DelayedStateChange var1 = cache(1, (long) arg0.id);
		var1.pushClientQueue();
	}

    public static void onVarClientStr(VarType arg0) {
		DelayedStateChange var1 = cache(2, (long) arg0.id);
		var1.pushClientQueue();
	}

    public static void onInterfaceText(int arg0) {
		DelayedStateChange var1 = cache(3, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceAntiTextMacro(int arg0) {
		DelayedStateChange var1 = cache(23, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceModel(int arg0) {
		DelayedStateChange var1 = cache(4, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceModelAnim(int arg0) {
		DelayedStateChange var1 = cache(5, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceColour(int arg0) {
		DelayedStateChange var1 = cache(6, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceHide(int arg0) {
		DelayedStateChange var1 = cache(7, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceModelXAnYAnZoom(int arg0) {
		DelayedStateChange var1 = cache(8, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceLinkObjTypeCount(int arg0) {
		DelayedStateChange var1 = cache(9, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceModelXOfYOfZAn(int arg0) {
		DelayedStateChange var1 = cache(10, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceDataXY(int arg0) {
		DelayedStateChange var1 = cache(11, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceScrollYPos(int arg0) {
		DelayedStateChange var1 = cache(12, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceGraphic(int arg0) {
		DelayedStateChange var1 = cache(13, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceFontType(int arg0) {
		DelayedStateChange var1 = cache(15, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceFontMono(int arg0) {
		DelayedStateChange var1 = cache(21, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onInterfaceClickMask(int arg0) {
		DelayedStateChange var1 = cache(22, (long) arg0);
		var1.pushClientQueue();
	}

    public static void onMiniMapFlag() {
		DelayedStateChange var0 = cache(14, 0L);
		var0.pushClientQueue();
	}

    public static void onInterfaceRecol(int arg0, int arg1) {
		DelayedStateChange var2 = cache(17, (long) arg1 << 32 | (long) arg0);
		var2.pushClientQueue();
	}

    public static void onInterfaceRetex(int arg0, int arg1) {
		DelayedStateChange var2 = cache(20, (long) arg1 << 32 | (long) arg0);
		var2.pushClientQueue();
	}

    public static void setVarC(int arg0, int arg1) {
		DelayedStateChange var2 = cache(1, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

    public static void setVarCBit(int arg0, int arg1) {
		VarBitType var2 = (VarBitType) Client.varBitTypeList.list(arg0);
		DelayedStateChange var3 = cache(1, (long) var2.baseVar.id);
		try {
			if (lastPushNew) {
				var3.int0 = Client.clientVarDomain.getVarValueInt(var2.baseVar);
			}
			var3.int0 = var2.setVarbitValue(var3.int0, arg1);
			var3.pushServerQueue();
		} catch (VarBitOverflowException var5) {
			JagException.report("" + arg0, var5);
		}
	}

    public static void setVarCStr(int arg0, String arg1) {
		DelayedStateChange var2 = cache(2, (long) arg0);
		var2.pushServerQueue();
		var2.str0 = arg1;
	}

    public static void setInterfaceText(int arg0, String arg1) {
		DelayedStateChange var2 = cache(3, (long) arg0);
		var2.pushServerQueue();
		var2.str0 = arg1;
	}

    public static void setInterfaceAntiTextMacro(int arg0, boolean arg1) {
		DelayedStateChange var2 = cache(23, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1 ? 1 : 0;
	}

    public static void setInterfaceModel(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(4, (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg1;
		var4.int1 = arg2;
		var4.int2 = arg3;
	}

    public static void setInterfaceModelAnim(int arg0, int arg1) {
		DelayedStateChange var2 = cache(5, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

    public static void setInterfaceColour(int arg0, int arg1) {
		DelayedStateChange var2 = cache(6, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

    public static void setInterfaceHide(int arg0, int arg1) {
		DelayedStateChange var2 = cache(7, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

    public static void setInterfaceModelXAnYAnZoom(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(8, (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg1;
		var4.int1 = arg2;
		var4.int2 = arg3;
	}

    public static void setInterfaceLinkObjTypeCount(int arg0, int arg1, int arg2) {
		DelayedStateChange var3 = cache(9, (long) arg0);
		var3.pushServerQueue();
		var3.int0 = arg1;
		var3.int1 = arg2;
	}

    public static void setInterfaceModelXOfYOfZAn(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(10, (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg1;
		var4.int1 = arg2;
		var4.int2 = arg3;
	}

    public static void setInterfaceDataXY(int arg0, int arg1, int arg2) {
		DelayedStateChange var3 = cache(11, (long) arg0);
		var3.pushServerQueue();
		var3.int0 = arg1;
		var3.int1 = arg2;
	}

    public static void setInterfaceScrollYPos(int arg0, int arg1) {
		DelayedStateChange var2 = cache(12, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

    public static void setInterfaceGraphic(int arg0, int arg1) {
		DelayedStateChange var2 = cache(13, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

    public static void setInterfaceFontType(int arg0, int arg1) {
		DelayedStateChange var2 = cache(15, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

    public static void setInterfaceClickMask(int arg0, boolean arg1) {
		DelayedStateChange var2 = cache(22, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1 ? 1 : 0;
	}

    public static void setMiniMapFlag(int arg0, int arg1) {
		DelayedStateChange var2 = cache(14, 0L);
		var2.pushServerQueue();
		var2.int0 = arg0;
		var2.int1 = arg1;
	}

    public static void setInterfaceRecol(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(17, (long) arg1 << 32 | (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg2;
		var4.int1 = arg3;
	}

    public static void setInterfaceRetex(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(20, (long) arg1 << 32 | (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg2;
		var4.int1 = arg3;
	}

	public DelayedStateChange(int type, long target) {
		this.nodeId = (long) type << 56 | target;
	}

    public void pushClientQueue() {
		this.secondaryNodeId = this.secondaryNodeId & Long.MIN_VALUE | MonotonicTime.get() + 500L;
		clientQueue.pushBack(this);
	}

    public void pushServerQueue() {
		this.secondaryNodeId |= Long.MIN_VALUE;
		if (this.getTime() == 0L) {
			serverQueue.pushBack(this);
		}
	}

    public int getType() {
		return (int) (this.nodeId >>> 56 & 0xFFL);
	}

    public long getTarget() {
		return this.nodeId & 0xFFFFFFFFFFFFFFL;
	}

    public long getTime() {
		return this.secondaryNodeId & Long.MAX_VALUE;
	}
}
