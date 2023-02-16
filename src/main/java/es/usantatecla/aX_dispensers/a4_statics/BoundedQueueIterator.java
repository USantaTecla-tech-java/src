package es.usantatecla.aX_dispensers.a4_statics;

class BoundedQueueIterator {

	protected Interval[] intervals;
	protected int size;
	protected int current;

	protected BoundedQueueIterator(Interval[] intervals, int size,
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

