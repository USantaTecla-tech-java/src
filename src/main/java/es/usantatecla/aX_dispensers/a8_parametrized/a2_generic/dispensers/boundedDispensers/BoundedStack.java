package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.FullDispenserException;

public class BoundedStack<E> extends BoundedDispenser<E> {

	public BoundedStack(int capacity) {
		super(capacity);
	}

	public E remove() throws EmptyDispenserException {
		super.remove();
		this.size--;
		this.next--;
		return this.elements[this.next];
	}

	public E[] getElements() {
		E[] elements = (E[]) new Object[this.next];
		for (int position = 0; position < this.next; position++) {
			elements[position] = this.elements[this.next - 1 - position];
		}
		return elements;
	}

	public void duplicate() {
		E[] elements = this.getElements();
		this.elements = (E[]) new Object[2 * this.elements.length];
		this.size = 0;
		this.next = 0;
		for (int i = elements.length - 1; i >= 0; i--) {
			try {
				this.add(elements[i]);
			} catch (FullDispenserException e) {
				e.printStackTrace();
			}
		}
	}

}
