package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Node;

public class UnboundedQueueIterator<E> extends UnboundedDispenserIterator<E> {

	public UnboundedQueueIterator(Node<E> current) {
		super(current);
	}

	public E next() {
		E element = this.current.getElement();
		this.current = this.current.getPrevious();
		return element;
	}
}
