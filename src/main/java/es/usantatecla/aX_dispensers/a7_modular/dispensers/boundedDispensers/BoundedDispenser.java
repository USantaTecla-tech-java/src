package es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.FullDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;

public abstract class BoundedDispenser implements Dispenser {

	protected Interval[] intervals;
	protected int size;
	protected int next;

	protected BoundedDispenser(int size) {
		this.intervals = new Interval[size];
		this.size = 0;
		this.next = 0;
	}

	public void add(Interval interval) throws FullDispenserException {
		if (this.isFull() ) {
			throw new FullDispenserException (this, interval);
		}
		this.size++;
		this.intervals[this.next] = interval;
		this.next++;
	}

	public Interval remove() throws EmptyDispenserException {
		if (this.size == 0){
			throw new EmptyDispenserException(this);
		}
		return null;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == intervals.length;
	}

	public abstract void duplicate();
	
}
