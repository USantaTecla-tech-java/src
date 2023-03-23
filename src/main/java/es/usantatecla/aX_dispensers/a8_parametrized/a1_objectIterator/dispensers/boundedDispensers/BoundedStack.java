package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Iterator;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;

public class BoundedStack extends BoundedDispenser {

	public BoundedStack(int size) {
		super(size);
	}

	public Object remove() throws EmptyDispenserException {
		super.remove();
		size--;
		next--;
		return this.elements[next];
	}

	public Iterator getIterator() {
		return new BoundedStackIterator(this.elements, this.size, this.next);
	}

	public void duplicate() {
		Object[] news = new Object[2 * this.elements.length];
		for (int i = 0; i < size; i++) {
			news[i] = this.elements[i];
		}
		this.elements = news;
		next = size;
	}

}
