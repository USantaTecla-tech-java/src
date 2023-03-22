package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Interval;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Iterator;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.EmptyDispenserException;

public class BoundedStack<E> extends BoundedDispenser<E> {

	public BoundedStack(int size) {
		super(size);
	}

	public E remove() throws EmptyDispenserException {
		super.remove();
		size--;
		next--;
		return this.elements[next];
	}

	public Iterator<E> getIterator() {
		return new BoundedStackIterator<E>(this.elements, this.size, this.next);
	}

	public void duplicate() {
		E[] news = (E[]) new Object[2 * this.elements.length];
		for (int i = 0; i < size; i++) {
			news[i] = this.elements[i];
		}
		this.elements = news;
		next = size;
	}

}
