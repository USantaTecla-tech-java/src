package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Iterator;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.FullDispenserException;

public class BoundedQueue extends BoundedDispenser {

	private int first;

	public BoundedQueue(int size) {
		super(size);
		this.first = 0;
	}

	public void add(Object element) throws FullDispenserException {
		super.add(element);
		if (this.next == this.elements.length) {
			this.next = 0;
		}
	}

	public Object remove() throws EmptyDispenserException {
		super.remove();
		this.size--;
		Object element = this.elements[this.first];
		this.first = (this.first + 1) % this.elements.length;
		return element;
	}

	public Iterator getIterator() {
		return new BoundedQueueIterator(this.elements, this.size, this.first);
	}

	public void duplicate() {
		Object[] news = new Object[2 * this.elements.length];
		int i = this.first;
		for (int j = 0; j < this.size; j++) {
			news[j] = this.elements[j];
			i = (i + 1) % this.elements.length;
		}
		this.elements = news;
		this.first = 0;
	}

}
