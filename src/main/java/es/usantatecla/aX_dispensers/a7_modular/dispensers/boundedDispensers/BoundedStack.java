package es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;
import es.usantatecla.aX_dispensers.a7_modular.utils.Iterator;

public class BoundedStack extends BoundedDispenser {

	public BoundedStack(int size) {
		super(size);
	}

	public Interval remove() throws EmptyDispenserException {
		super.remove();
		size--;
		next--;
		return intervals[next];
	}

	public Iterator getIterator() {
		return new BoundedStackIterator(intervals, size, next);
	}

	public void duplicate() {
		Interval[] news = new Interval[2 * intervals.length];
		for (int i = 0; i < size; i++) {
			news[i] = intervals[i];
		}
		intervals = news;
		next = size;
	}

}
