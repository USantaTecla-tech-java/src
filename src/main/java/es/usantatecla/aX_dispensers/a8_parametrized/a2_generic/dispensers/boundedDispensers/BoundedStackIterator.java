package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers;

public class BoundedStackIterator<E> extends BoundedDispenserIterator<E> {

	public BoundedStackIterator(E[] elements, int size,
			int next) {
		super(elements, size, next);
	}

	public E next() {
		this.size--;
		this.current--;
		return this.elements[this.current];
	}
}

