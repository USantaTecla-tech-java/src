package es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;

public class BoundedStack extends BoundedDisepenser {

	public BoundedStack(int capacity) {
		super(capacity);
	}

	public Interval remove() throws EmptyDispenserException {
		super.remove();
		this.size--;
		this.next--;
		return this.elements[next];
	}

	public Interval[] getElements() {
		Interval[] elements = new Interval[this.next];
		for (int position = 0; position < this.next; position++) {
			elements[position] = this.elements[this.next - 1 - position];
		}
		return elements;
	}

	public void duplicate() {
		Interval[] elements = this.getElements();
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
