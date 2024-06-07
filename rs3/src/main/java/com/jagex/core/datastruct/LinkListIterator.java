package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

public class LinkListIterator implements Iterator {

    public LinkList queue;

    public Node next;

    public Node prev = null;

	public LinkListIterator(LinkList queue) {
		this.set(queue);
	}

    public void set(LinkList queue) {
		this.queue = queue;
		this.advance();
	}

    public void advance() {
		this.next = this.queue == null ? null : this.queue.sentinel.next;
		this.prev = null;
	}

    public Node nextNode() {
		this.advance();
		return (Node) this.next();
	}

	public Object next() {
		Node node = this.next;
		if (this.queue.sentinel == node) {
			node = null;
			this.next = null;
		} else {
			this.next = node.next;
		}
		this.prev = node;
		return node;
	}

	public boolean hasNext() {
		return this.queue.sentinel != this.next;
	}

	public void remove() {
		if (this.prev == null) {
			throw new IllegalStateException();
		}
		this.prev.unlink();
		this.prev = null;
	}
}
