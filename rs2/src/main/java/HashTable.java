public class HashTable {

	private final int bucketCount;

	private final Linkable[] buckets;

	public HashTable( int size) {
		this.buckets = new Linkable[size];
		this.bucketCount = size;

		for ( int i = 0; i < size; i++) {
			Linkable sentinel = this.buckets[i] = new Linkable();
			sentinel.next = sentinel;
			sentinel.prev = sentinel;
		}
	}

	public Linkable get( long key) {
		Linkable sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];

		for ( Linkable node = sentinel.next; node != sentinel; node = node.next) {
			if (node.key == key) {
				return node;
			}
		}

		return null;
	}

	public void put( long key, Linkable value) {
		if (value.prev != null) {
			value.unlink();
		}

		Linkable sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		value.prev = sentinel.prev;
		value.next = sentinel;
		value.prev.next = value;
		value.next.prev = value;
		value.key = key;
	}
}
