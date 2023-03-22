package es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.FullDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;
import es.usantatecla.aX_dispensers.a7_modular.utils.Iterator;

public class BoundedQueue extends BoundedDispenser {

	private int first;

	public BoundedQueue(int size) {
		super(size);
		this.first = 0;
	}

	public void add(Interval interval) throws FullDispenserException {
		super.add(interval);
		if (this.next == this.intervals.length) {
			this.next = 0;
		}
	}

	public Interval remove() throws EmptyDispenserException {
		super.remove();
		this.size--;
		Interval interval = this.intervals[this.first];
		this.first = (this.first + 1) % this.intervals.length;
		return interval;
	}

	public Iterator getIterator() {
		return new BoundedQueueIterator(this.intervals, this.size, this.first);
	}

	@Override
	public void duplicate() {
		Interval[] news = new Interval[2 * this.intervals.length];
		int i = this.first;
		for (int j = 0; j < this.size; j++) {
			news[j] = this.intervals[j];
			i = (i + 1) % this.intervals.length;
		}
		this.intervals = news;
		this.first = 0;
	}

}
