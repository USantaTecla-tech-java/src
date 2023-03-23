package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Interval;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Node;

public class UnboundedQueue extends UnboundedDispenser {

	private Node exit;

	public UnboundedQueue() {
		super();
		this.exit = null;
	}

	public void add(Object element) {
		assert element != null;

		boolean empty = this.isEmpty();
		this.entrance = new Node(element, this.entrance);
		if (empty) {
			this.exit = this.entrance;
		}
	}

	public Object remove() throws EmptyDispenserException {
		super.remove();

		Object element = this.exit.getElement();
		if (this.exit.getPrevious() == null) {
			this.entrance = null;
			this.exit = null;
		} else {
			this.exit = exit.getPrevious();
			this.exit.setNext(null);
		}
		return element;
	}

	public Object[] getElements() {
		int size = 0;
		Node node = this.exit;
		while (node != null) {
			size++;
			node = node.getPrevious();
		}
		Object[] elements = new Interval[size];
		node = this.exit;
		for(int position = 0; position < size; position++){
			elements[position] = node.getElement();
 			node = node.getPrevious();
		}
		return elements;
	}

}
