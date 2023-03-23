package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Interval;

public class BoundedQueue extends BoundedDisepenser {

	private int first;

	public BoundedQueue(int capacity) {
		super(capacity);
		this.first = 0;
	}

	public void add(Interval element) throws FullDispenserException {
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

	public Object[] getElements() {
		Object[] elements = new Interval[this.size];
		for (int position = 0; position < this.size; position++) {
			elements[position] = this.elements[(position + this.first) % this.elements.length];
		}
		return elements;
	}

	public void duplicate() {
		Object[] elements = this.getElements();
		this.elements = new Interval[2 * this.elements.length];
		this.size = 0;
		this.next = 0;
		for(Object element : elements){
			try {
				this.add(element);
			} catch (FullDispenserException e) {
				e.printStackTrace();
			}
		}
	}

}
