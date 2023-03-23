package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

public class BoundedStackIterator extends BoundedDispenserIterator {

	public BoundedStackIterator(Object[] elements, int size,
			int next) {
		super(elements, size, next);
	}

	public Object next() {
		this.size--;
		this.current--;
		return this.elements[this.current];
	}
}

