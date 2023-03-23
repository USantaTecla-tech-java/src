package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Interval;

public class BoundedStack extends BoundedDisepenser {

	public BoundedStack(int capacity) {
		super(capacity);
	}

	public Object remove() throws EmptyDispenserException {
		super.remove();
		this.size--;
		this.next--;
		return this.elements[next];
	}

	public Object[] getElements() {
		Object[] elements = new Interval[this.next];
		for (int position = 0; position < this.next; position++) {
			elements[position] = this.elements[this.next - 1 - position];
		}
		return elements;
	}

	public void duplicate() {
		Object[] elements = this.getElements();
		this.elements = new Interval[2 * this.elements.length];
		this.size = 0;
		this.next = 0;
		for (int i = elements.length - 1; i >= 0; i--) {
			try {
				this.add(elements[i]);
			} catch (FullDispenserException e) {
				e.printStackTrace();
			}
		}
	}

}
