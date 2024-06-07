package com.jagex.core.datastruct;



import java.util.Iterator;

public class SecondaryLinkedListIterator implements Iterator {

    public SecondaryLinkedList queue;

    public SecondaryNode next;

    public SecondaryNode prev = null;

	public SecondaryLinkedListIterator(SecondaryLinkedList queue) {
		this.queue = queue;
		this.next = this.queue.head.secondaryPrev;
		this.prev = null;
	}

    public void advance() {
		this.next = this.queue.head.secondaryPrev;
		this.prev = null;
	}

    public SecondaryNode nextNode() {
		this.advance();
		return (SecondaryNode) this.next();
	}

	public Object next() {
		SecondaryNode node = this.next;
		if (this.queue.head == node) {
			node = null;
			this.next = null;
		} else {
			this.next = node.secondaryPrev;
		}
		this.prev = node;
		return node;
	}

	public boolean hasNext() {
		return this.queue.head != this.next;
	}

	public void remove() {
		if (this.prev == null) {
			throw new IllegalStateException();
		}
		this.prev.secondaryRemove();
		this.prev = null;
	}
}
