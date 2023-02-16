package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

abstract class BoundedDispenserIterator extends Iterator {

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
