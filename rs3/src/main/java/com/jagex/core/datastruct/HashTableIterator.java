package com.jagex.core.datastruct;



import java.util.Iterator;

public class HashTableIterator implements Iterator {

    public HashTable map;

    public Node next;

    public int currentIndex;

    public Node prev = null;

	public HashTableIterator(HashTable map) {
		this.map = map;
		this.advance();
	}

    public void advance() {
		this.next = this.map.buckets[0].next;
		this.currentIndex = 1;
		this.prev = null;
	}

    public Node nextNode() {
		this.advance();
		return (Node) this.next();
	}

	public Object next() {
		if (this.map.buckets[this.currentIndex - 1] != this.next) {
			Node node = this.next;
			this.next = node.next;
			this.prev = node;
			return node;
		}
		Node node;
		do {
			if (this.currentIndex >= this.map.bucketCount) {
				return null;
			}
			node = this.map.buckets[++this.currentIndex - 1].next;
		} while (this.map.buckets[this.currentIndex - 1] == node);
		this.next = node.next;
		this.prev = node;
		return node;
	}

	public boolean hasNext() {
		if (this.map.buckets[this.currentIndex - 1] != this.next) {
			return true;
		}
		while (this.currentIndex < this.map.bucketCount) {
			if (this.map.buckets[++this.currentIndex - 1].next != this.map.buckets[this.currentIndex - 1]) {
				this.next = this.map.buckets[this.currentIndex - 1].next;
				return true;
			}
			this.next = this.map.buckets[this.currentIndex - 1];
		}
		return false;
	}

	public void remove() {
		if (this.prev == null) {
			throw new IllegalStateException();
		}
		this.prev.unlink();
		this.prev = null;
	}
}
