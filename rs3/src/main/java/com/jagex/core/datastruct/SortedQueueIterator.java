package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SortedQueueIterator implements Iterator {

    public SortedQueue field3571;

    public int field3570 = 0;

    public int field3572 = this.field3571.modCount;

	public SortedQueueIterator(SortedQueue arg0) {
		this.field3571 = arg0;
	}

	public boolean hasNext() {
		return this.field3570 < this.field3571.size;
	}

	public Object next() {
		if (this.field3571.modCount != this.field3572) {
			throw new ConcurrentModificationException();
		} else if (this.field3570 < this.field3571.size) {
			Object var1 = this.field3571.sortedEntries[this.field3570].value;
			this.field3570++;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
