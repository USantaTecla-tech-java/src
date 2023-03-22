package es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;

public class BoundedQueueIterator extends BoundedDispenserIterator {

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

