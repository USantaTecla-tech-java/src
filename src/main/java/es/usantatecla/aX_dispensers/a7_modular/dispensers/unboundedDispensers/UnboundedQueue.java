package es.usantatecla.aX_dispensers.a7_modular.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;
import es.usantatecla.aX_dispensers.a7_modular.utils.Node;

public class UnboundedQueue extends UnboundedDispenser {

	private Node exit;

	public UnboundedQueue() {
		super();
		this.exit = null;
	}

	public void add(Interval element) {
		assert element != null;

		boolean empty = this.isEmpty();
		this.entrance = new Node(element, this.entrance);
		if (empty) {
			this.exit = this.entrance;
		}
	}

	public Interval remove() throws EmptyDispenserException {
		super.remove();

		Interval element = this.exit.getElement();
		if (this.exit.getPrevious() == null) {
			this.entrance = null;
			this.exit = null;
		} else {
			this.exit = exit.getPrevious();
			this.exit.setNext(null);
		}
		return element;
	}

	public Interval[] getElements() {
		int size = 0;
		Node node = this.exit;
		while (node != null) {
			size++;
			node = node.getPrevious();
		}
		Interval[] elements = new Interval[size];
		node = this.exit;
		for(int position = 0; position < size; position++){
			elements[position] = node.getElement();
 			node = node.getPrevious();
		}
		return elements;
	}

}
