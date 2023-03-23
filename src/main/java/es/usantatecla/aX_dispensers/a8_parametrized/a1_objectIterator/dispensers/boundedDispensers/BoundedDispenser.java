package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.FullDispenserException;

public abstract class BoundedDispenser implements Dispenser {

	protected Object[] elements;
	protected int size;
	protected int next;

	protected BoundedDispenser(int size) {
		this.elements = new Object[size];
		this.size = 0;
		this.next = 0;
	}

	public void add(Object element) throws FullDispenserException {
		if (this.isFull() ) {
			throw new FullDispenserException (this, element);
		}
		this.size++;
		this.elements[this.next] = element;
		this.next++;
	}

	public Object remove() throws EmptyDispenserException {
		if (this.size == 0){
			throw new EmptyDispenserException(this);
		}
		return null;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == this.elements.length;
	}

	public abstract void duplicate();
	
}
