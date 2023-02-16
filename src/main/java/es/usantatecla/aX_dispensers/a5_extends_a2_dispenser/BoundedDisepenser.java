package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

abstract class BoundedDisepenser extends Dispenser {

	protected Interval[] intervals;
	protected int size;
	protected int next;

	protected BoundedDisepenser(int capacity) {
		assert capacity > 0;

		this.intervals = new Interval[capacity];
		this.size = 0;
		this.next = 0;
	}

	public void add(Interval interval) {
		assert interval != null;
		assert !this.isFull();

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
}
