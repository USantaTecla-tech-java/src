package es.usantatecla.aX_dispensers.a1_classes_a2_iterator;

class BoundedQueue {

	private Interval[] intervals;
	private int size;
	private int next;
	private int first;

	public BoundedQueue(int capacity) {
		this.intervals = new Interval[capacity];
		this.size = 0;
		this.next = 0;
		this.first = 0;
	}

	public void add(Interval interval) {
		this.size++;
		this.intervals[this.next] = interval;
		this.next = (this.next +1)% this.intervals.length;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == intervals.length;
	}

	public Interval remove() {
		this.size--;
		Interval interval = this.intervals[this.first];
		this.first = (this.first + 1) % this.intervals.length;
		return interval;
	}

	public BoundedQueueIterator getIterator() {
		return new BoundedQueueIterator(this.intervals, this.size, this.first);
	}

}
