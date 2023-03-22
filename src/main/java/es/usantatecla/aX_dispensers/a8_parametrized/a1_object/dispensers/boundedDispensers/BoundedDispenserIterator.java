package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Iterator;

public abstract class BoundedDispenserIterator implements Iterator {

	protected Object[] elements;
	protected int size;
	protected int current;

	protected BoundedDispenserIterator(Object[] elements, int size,
			int current) {
		this.elements = elements;
		this.size = size;
		this.current = current;
	}

	public boolean hasNext() {
		return this.size != 0;
	}

	public abstract Object next();
}
