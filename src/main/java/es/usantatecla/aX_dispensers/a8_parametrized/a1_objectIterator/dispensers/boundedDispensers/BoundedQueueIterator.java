package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

public class BoundedQueueIterator extends BoundedDispenserIterator {

	public BoundedQueueIterator(Object[] elements, int size,
			int first) {
		super(elements, size, first);
	}

	public Object next() {
		this.size--;
		Object element = this.elements[this.current];
		this.current = (this.current + 1) % this.elements.length;
		return element;
	}

}

