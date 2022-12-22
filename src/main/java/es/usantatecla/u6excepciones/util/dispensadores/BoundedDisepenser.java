package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

abstract class BoundedDisepenser implements Dispenser {

	protected Interval[] intervals;
	protected int length;
	protected int next;

	protected BoundedDisepenser(int size) {
		this.intervals = new Interval[size];
		this.length = 0;
		this.next = 0;
	}

	public void add(Interval interval) throws FullDispenserException {
		if (this.isFull()) {
			throw new FullDispenserException(this, interval);
		}
		this.length++;
		this.intervals[next] = interval;
		this.next++;
	}

	public boolean isEmpty() {
		return this.length == 0;
	}

	public boolean isFull() {
		return this.length == this.intervals.length;
	}

	public abstract void duplicate();
}
