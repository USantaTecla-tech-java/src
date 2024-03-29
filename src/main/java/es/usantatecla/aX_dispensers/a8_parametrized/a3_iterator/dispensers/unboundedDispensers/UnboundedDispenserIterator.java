package es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.utils.Iterator;
import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.utils.Node;

public abstract class UnboundedDispenserIterator<E> implements Iterator<E> {

	protected Node<E> current;

	protected UnboundedDispenserIterator(Node<E> current) {
		this.current = current;
	}

	public boolean hasNext() {
		return this.current != null;
	}

	public abstract E next();
}
