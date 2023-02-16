package es.usantatecla.aX_dispensers.a1_classes_a2_iterator;

class BoundedStack {

	private Interval[] intervals;
	private int size;
	private int next;

	public BoundedStack(int capacity) {
		this.intervals = new Interval[capacity];
		this.size = 0;
		this.next = 0;
	}

	public void add(Interval interval) {
		this.size++;
		this.intervals[this.next] = interval;
		this.next++;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == intervals.length;
	}

	public Interval remove() {
		this.size--;
		this.next--;
		return intervals[next];
	}

	public BoundedStackIterator getIterator() {
		return new BoundedStackIterator(intervals, size, next);
	}

}
