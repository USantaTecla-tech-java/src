package es.usantatecla.aX_dispensers;

class BoundedQueueIterator extends BoundedDispenserIterator {

	public BoundedQueueIterator(Interval[] intervals, int size,
			int first) {
		super(intervals, size, first);
	}

	public Interval next() {
		this.size--;
		Interval interval = this.intervals[this.current];
		this.current = (this.current + 1) % this.intervals.length;
		return interval;
	}
}

