package es.usantatecla.aX_dispensers;

abstract class BoundedDispenserIterator implements Iterator {

	protected Interval[] intervals;
	protected int size;
	protected int current;

	protected BoundedDispenserIterator(Interval[] intervals, int size,
			int current) {
		this.intervals = intervals;
		this.size = size;
		this.current = current;
	}

	public boolean hasNext() {
		return this.size != 0;
	}

	public abstract Interval next();
}
