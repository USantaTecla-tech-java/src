package es.usantatecla.aX_dispensers;

class BoundedStackIterator extends BoundedDispenserIterator {

	public BoundedStackIterator(Interval[] intervals, int size,
			int next) {
		super(intervals, size, next);
	}

	public Interval next() {
		this.size--;
		this.current--;
		return this.intervals[this.current];
	}
}

