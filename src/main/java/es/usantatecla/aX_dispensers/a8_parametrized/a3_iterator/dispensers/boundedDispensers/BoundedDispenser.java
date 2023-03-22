package es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.FullDispenserException;

public abstract class BoundedDispenser<E> implements Dispenser<E> {

	protected E[] elements;
	protected int size;
	protected int next;

	protected BoundedDispenser(int size) {
		this.elements = (E[]) new Object[size];
		this.size = 0;
		this.next = 0;
	}

	public void add(E element) throws FullDispenserException {
		if (this.isFull() ) {
			throw new FullDispenserException (this, element);
		}
		this.size++;
		this.elements[this.next] = element;
		this.next++;
	}

	public E remove() throws EmptyDispenserException {
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
