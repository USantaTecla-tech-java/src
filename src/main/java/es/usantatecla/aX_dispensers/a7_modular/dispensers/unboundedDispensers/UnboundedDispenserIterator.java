package es.usantatecla.aX_dispensers.a7_modular.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;
import es.usantatecla.aX_dispensers.a7_modular.utils.Iterator;
import es.usantatecla.aX_dispensers.a7_modular.utils.Node;

public abstract class UnboundedDispenserIterator implements Iterator {

	protected Node current;

	protected UnboundedDispenserIterator(Node current) {
		this.current = current;
	}

	public boolean hasNext() {
		return this.current != null;
	}

	public abstract Interval next();
}
