package com.jagex.core.datastruct;



public class Node {

    public long nodeId;

    public Node next;

    public Node prev;

    public void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}

    public boolean isLinked() {
		return this.prev != null;
	}
}
