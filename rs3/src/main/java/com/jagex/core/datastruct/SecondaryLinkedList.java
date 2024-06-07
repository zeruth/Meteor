package com.jagex.core.datastruct;



import java.util.Iterator;

public class SecondaryLinkedList implements Iterable {

    public SecondaryNode head = new SecondaryNode();

    public SecondaryNode peeked;

	public SecondaryLinkedList() {
		this.head.secondaryPrev = this.head;
		this.head.secondaryNext = this.head;
	}

    public void removeAll() {
		while (this.head.secondaryPrev != this.head) {
			this.head.secondaryPrev.secondaryRemove();
		}
	}

    public void pushBack(SecondaryNode node) {
		if (node.secondaryNext != null) {
			node.secondaryRemove();
		}
		node.secondaryNext = this.head.secondaryNext;
		node.secondaryPrev = this.head;
		node.secondaryNext.secondaryPrev = node;
		node.secondaryPrev.secondaryNext = node;
	}

    public static void pushNodeBack(SecondaryNode node, SecondaryNode head) {
		if (node.secondaryNext != null) {
			node.secondaryRemove();
		}
		node.secondaryNext = head.secondaryNext;
		node.secondaryPrev = head;
		node.secondaryNext.secondaryPrev = node;
		node.secondaryPrev.secondaryNext = node;
	}

    public static void method10144(SecondaryNode arg0, SecondaryNode arg1) {
		if (arg0.secondaryNext != null) {
			arg0.secondaryRemove();
		}
		arg0.secondaryNext = arg1;
		arg0.secondaryPrev = arg1.secondaryPrev;
		arg0.secondaryNext.secondaryPrev = arg0;
		arg0.secondaryPrev.secondaryNext = arg0;
	}

    public SecondaryNode pollFront() {
		SecondaryNode node = this.head.secondaryPrev;
		if (this.head == node) {
			return null;
		} else {
			node.secondaryRemove();
			return node;
		}
	}

    public SecondaryNode peekFront() {
		return this.peekFrontNode(null);
	}

    public SecondaryNode peekFrontNode(SecondaryNode arg0) {
		SecondaryNode var2;
		if (arg0 == null) {
			var2 = this.head.secondaryPrev;
		} else {
			var2 = arg0;
		}
		if (this.head == var2) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var2.secondaryPrev;
			return var2;
		}
	}

    public SecondaryNode prev() {
		SecondaryNode var1 = this.peeked;
		if (this.head == var1) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var1.secondaryPrev;
			return var1;
		}
	}

    public int length() {
		int length = 0;
		for (SecondaryNode var2 = this.head.secondaryPrev; var2 != this.head; var2 = var2.secondaryPrev) {
			length++;
		}
		return length;
	}

	public Iterator iterator() {
		return new SecondaryLinkedListIterator(this);
	}
}
