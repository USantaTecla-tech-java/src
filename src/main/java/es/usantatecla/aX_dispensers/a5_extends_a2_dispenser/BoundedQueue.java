package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

class BoundedQueue extends BoundedDisepenser {

	private int first;

	public BoundedQueue(int capacity) {
		super(capacity);
		this.first = 0;
	}

	public void add(Interval interval) {
		super.add(interval);
		if (this.next == this.intervals.length) {
			this.next = 0;
		}
	}

	public Interval remove() {
		assert !this.isEmpty();
		
		this.size--;
		Interval interval = this.intervals[this.first];
		this.first = (this.first + 1) % this.intervals.length;
		return interval;
	}

	public Iterator getIterator() {
		return new BoundedQueueIterator(this.intervals, this.size, this.first);
	}

}
