package es.usantatecla.aX_dispensers.a1_classes_a2_iterator;

class BoundedQueueIterator {

	private Interval[] intervals;
	private int size;
	private int current;

	BoundedQueueIterator(Interval[] intervals, int size,
			int current) {
		this.intervals = intervals;
		this.size = size;
		this.current = current;
	}

	public boolean hasNext() {
		return this.size != 0;
	}

	public Interval next() {
		this.size--;
		Interval interval = this.intervals[this.current];
		this.current = (this.current + 1) % this.intervals.length;
		return interval;
	}
}

