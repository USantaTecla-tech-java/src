package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Node;

public class UnboundedQueueIterator extends UnboundedDispenserIterator {

	public UnboundedQueueIterator(Node current) {
		super(current);
	}

	public Object next() {
		Object element = this.current.getElement();
		this.current = this.current.getPrevious();
		return element;
	}
}
