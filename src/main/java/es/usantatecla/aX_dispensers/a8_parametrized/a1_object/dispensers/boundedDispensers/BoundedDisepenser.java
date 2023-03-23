package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;

public abstract class BoundedDisepenser implements Dispenser {

	protected Object[] elements;
	protected int size;
	protected int next;

	protected BoundedDisepenser(int capacity) {
		assert capacity > 0;

		this.elements = new Object[capacity];
		this.size = 0;
		this.next = 0;
	}

	public Object remove() throws EmptyDispenserException {
		if (this.size == 0){
			throw new EmptyDispenserException(this);
		}
		return null;
	}

	public void add(Object element) throws FullDispenserException {
		if (this.isFull() ) {
			throw new FullDispenserException (this, element);
		}

		this.size++;
		this.elements[this.next] = element;
		this.next = (this.next + 1) % this.elements.length;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == elements.length;
	}

	public abstract void duplicate();

}
