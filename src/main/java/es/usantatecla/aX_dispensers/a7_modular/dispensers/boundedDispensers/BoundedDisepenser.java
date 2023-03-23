package es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;

public abstract class BoundedDisepenser implements Dispenser {

	protected Interval[] elements;
	protected int size;
	protected int next;

	protected BoundedDisepenser(int capacity) {
		assert capacity > 0;

		this.elements = new Interval[capacity];
		this.size = 0;
		this.next = 0;
	}

	public Interval remove() throws EmptyDispenserException {
		if (this.size == 0){
			throw new EmptyDispenserException(this);
		}
		return null;
	}

	public void add(Interval element) throws FullDispenserException {
		if (this.isFull() ) {
			throw new FullDispenserException (this, element);
		}

		this.size++;
		this.elements[this.next] = element;
		this.next++;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == elements.length;
	}

	public abstract void duplicate();

}
