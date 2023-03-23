package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Node;

public class UnboundedStackIterator extends UnboundedDispenserIterator {

	public UnboundedStackIterator(Node actual) {
		super(actual);
	}

	public Object next() {
		Object element = current.getElement();
		current = current.getNext();
		return element;
	}
}
