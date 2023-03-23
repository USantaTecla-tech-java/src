package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Iterator;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Node;

public class UnboundedQueue extends UnboundedDispenser {

	private Node exit;

	public UnboundedQueue() {
		this.exit = null;
	}

	public void add(Object element) {
		boolean empty = this.isEmpty();
		super.add(element);
		if (empty) {
			this.exit = this.entrance;
		}
	}

	public Object remove() {
		Object element = exit.getElement();
		if (this.exit.getPrevious() == null) {
			this.entrance = null;
			this.exit = null;
		} else {
			this.exit = exit.getPrevious();
			this.exit.setNext(null);
		}
		return element;
	}

	public Iterator getIterator() {
		return new UnboundedQueueIterator(exit);
	}

}
