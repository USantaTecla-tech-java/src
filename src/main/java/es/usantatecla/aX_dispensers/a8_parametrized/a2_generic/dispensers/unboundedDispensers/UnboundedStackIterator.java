package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Node;

public class UnboundedStackIterator<E> extends UnboundedDispenserIterator<E> {

	public UnboundedStackIterator(Node<E> actual) {
		super(actual);
	}

	public E next() {
		E element = current.getElement();
		current = current.getNext();
		return element;
	}
}
