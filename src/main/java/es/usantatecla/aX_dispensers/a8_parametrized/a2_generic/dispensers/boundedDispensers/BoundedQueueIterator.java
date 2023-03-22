package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers;

public class BoundedQueueIterator<E> extends BoundedDispenserIterator<E> {

	public BoundedQueueIterator(E[] elements, int size,
			int first) {
		super(elements, size, first);
	}

	public E next() {
		this.size--;
		E element = this.elements[this.current];
		this.current = (this.current + 1) % this.elements.length;
		return element;
	}

}

