package es.usantatecla.aX_dispensers.a6_interfaces;

class BoundedQueue extends BoundedDisepenser {

	private int first;

	public BoundedQueue(int size) {
		super(size);
		this.first = 0;
	}

	public void add(Interval interval) {
		super.add(interval);
		if (this.next == this.intervals.length) {
			this.next = 0;
		}
	}

	public Interval remove() {
		this.size--;
		Interval interval = this.intervals[this.first];
		this.first = (this.first + 1) % this.intervals.length;
		return interval;
	}

	public Iterator getIterator() {
		return new BoundedQueueIterator(this.intervals, this.size, this.first);
	}

}
