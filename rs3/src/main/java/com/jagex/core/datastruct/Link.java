package com.jagex.core.datastruct;



public class Link {

    public Link prev;

    public Link next;

    public void unlink() {
		if (this.next != null) {
			this.next.prev = this.prev;
			this.prev.next = this.next;
			this.prev = null;
			this.next = null;
		}
	}
}
