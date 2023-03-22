package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Iterator;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Node;

public abstract class UnboundedDispenserIterator implements Iterator {

	protected Node current;

	protected UnboundedDispenserIterator(Node current) {
		this.current = current;
	}

	public boolean hasNext() {
		return this.current != null;
	}

	public abstract Object next();
}
