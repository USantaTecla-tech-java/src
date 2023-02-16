package es.usantatecla.aX_dispensers.a4_statics;

class BoundedStackIterator  {
	protected Interval[] intervals;
	protected int size;
	protected int current;

	protected BoundedStackIterator(Interval[] intervals, int size,
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
		this.current--;
		return this.intervals[this.current];
	}
}

