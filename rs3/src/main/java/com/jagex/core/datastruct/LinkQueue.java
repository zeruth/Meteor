package com.jagex.core.datastruct;



public class LinkQueue {

    public Link head = new Link();

    public Link peeked;

	public LinkQueue() {
		this.head.prev = this.head;
		this.head.next = this.head;
	}

    public void clear() {
		while (true) {
			Link node = this.head.prev;
			if (this.head == node) {
				this.peeked = null;
				return;
			}
			node.unlink();
		}
	}

    public void pushBack(Link node) {
		if (node.next != null) {
			node.unlink();
		}
		node.next = this.head.next;
		node.prev = this.head;
		node.next.prev = node;
		node.prev.next = node;
	}

    public void pushFront(Link node) {
		if (node.next != null) {
			node.unlink();
		}
		node.next = this.head;
		node.prev = this.head.prev;
		node.next.prev = node;
		node.prev.next = node;
	}

    public static void pushNode(Link node, Link head) {
		if (node.next != null) {
			node.unlink();
		}
		node.next = head;
		node.prev = head.prev;
		node.next.prev = node;
		node.prev.next = node;
	}

    public Link pollFront() {
		Link node = this.head.prev;
		if (this.head == node) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

    public Link peekFront() {
		Link node = this.head.prev;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.prev;
			return node;
		}
	}

    public Link prev() {
		Link node = this.peeked;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.prev;
			return node;
		}
	}

    public boolean isEmpty() {
		return this.head.prev == this.head;
	}
}
