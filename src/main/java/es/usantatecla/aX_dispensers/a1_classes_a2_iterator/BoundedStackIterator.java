package es.usantatecla.aX_dispensers.a1_classes_a2_iterator;

class BoundedStackIterator  {
	private Interval[] intervals;
	private int size;
	private int current;

	BoundedStackIterator(Interval[] intervals, int size,
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

