package com.jagex.core.datastruct;

import deob.ObfuscatedName;

public final class ClientScriptCache {

    public SecondaryNode node = new SecondaryNode();

    public int capacity;

    public int available;

    public HashTable table;

    public SecondaryLinkedList queue = new SecondaryLinkedList();

	public ClientScriptCache(int arg0) {
		this.capacity = arg0;
		this.available = arg0;

		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}

		this.table = new HashTable(var2);
	}

    public SecondaryNode get(long arg0) {
		SecondaryNode var3 = (SecondaryNode) this.table.get(arg0);
		if (var3 != null) {
			this.queue.pushBack(var3);
		}
		return var3;
	}

    public void put(SecondaryNode arg0, long arg1) {
		if (this.available == 0) {
			SecondaryNode var4 = this.queue.pollFront();
			var4.unlink();
			var4.secondaryRemove();
			if (this.node == var4) {
				SecondaryNode var5 = this.queue.pollFront();
				var5.unlink();
				var5.secondaryRemove();
			}
		} else {
			this.available--;
		}
		this.table.put(arg0, arg1);
		this.queue.pushBack(arg0);
	}

    public void removeAll() {
		this.queue.removeAll();
		this.table.removeAll();
		this.node = new SecondaryNode();
		this.available = this.capacity;
	}
}
