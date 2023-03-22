package es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;

public class BoundedStackIterator extends BoundedDispenserIterator {

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

