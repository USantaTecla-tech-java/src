package es.usantatecla.aX_dispensers.a6_interfaces;

abstract class BoundedDisepenser implements Dispenser {

	protected Interval[] intervals;
	protected int size;
	protected int next;

	protected BoundedDisepenser(int size) {
		this.intervals = new Interval[size];
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
	
}
