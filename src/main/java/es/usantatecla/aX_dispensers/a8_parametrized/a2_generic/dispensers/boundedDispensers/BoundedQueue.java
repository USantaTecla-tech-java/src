package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Interval;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Iterator;
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

	public Iterator<E> getIterator() {
		return new BoundedQueueIterator<E>(this.elements, this.size, this.first);
	}

	@Override
	public void duplicate() {
		E[] news = (E[]) new Object[2 * this.elements.length];
		int i = this.first;
		for (int j = 0; j < this.size; j++) {
			news[j] = this.elements[j];
			i = (i + 1) % this.elements.length;
		}
		this.elements = news;
		this.first = 0;
	}

}
