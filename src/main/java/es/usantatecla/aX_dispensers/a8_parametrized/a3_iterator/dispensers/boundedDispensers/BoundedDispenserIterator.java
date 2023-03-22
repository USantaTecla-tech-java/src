package es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.utils.Iterator;

public abstract class BoundedDispenserIterator<E> implements Iterator<E> {

	protected E[] elements;
	protected int size;
	protected int current;

	protected BoundedDispenserIterator(E[] elements, int size,
			int current) {
		this.elements = elements;
		this.size = size;
		this.current = current;
	}

	public boolean hasNext() {
		return this.size != 0;
	}

	public abstract E next();
}
