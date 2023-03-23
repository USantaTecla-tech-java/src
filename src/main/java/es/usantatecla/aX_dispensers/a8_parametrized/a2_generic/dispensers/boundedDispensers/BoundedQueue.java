package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.FullDispenserException;

public class BoundedQueue<E> extends BoundedDispenser<E> {

	private int first;

	public BoundedQueue(int size) {
		super(size);
		this.first = 0;
	}

	public void add(E element) throws FullDispenserException {
		super.add(element);
		if (this.next == this.elements.length) {
			this.next = 0;
		}
	}

	public E remove() throws EmptyDispenserException {
		super.remove();
		this.size--;
		E element = this.elements[this.first];
		this.first = (this.first + 1) % this.elements.length;
		return element;
	}

	public E[] getElements() {
		E[] elements = (E[]) new Object[this.size];
		for (int position = 0; position < this.size; position++) {
			elements[position] = this.elements[(position + this.first) % this.elements.length];
		}
		return elements;
	}

	public void duplicate() {
		E[] elements = this.getElements();
		this.elements = (E[]) new Object[2 * this.elements.length];
		this.size = 0;
		this.next = 0;
		for(E element : elements){
			try {
				this.add(element);
			} catch (FullDispenserException e) {
				e.printStackTrace();
			}
		}
	}

}
