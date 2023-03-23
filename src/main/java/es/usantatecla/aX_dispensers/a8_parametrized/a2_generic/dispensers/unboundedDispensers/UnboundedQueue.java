package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Node;

public class UnboundedQueue<E> extends UnboundedDispenser<E> {

	private Node<E> exit;

	public UnboundedQueue() {
		this.exit = null;
	}

	public void add(E element) {
		boolean empty = this.isEmpty();
		super.add(element);
		if (empty) {
			this.exit = this.entrance;
		}
	}

	public E remove() {
		E element = exit.getElement();
		if (this.exit.getPrevious() == null) {
			this.entrance = null;
			this.exit = null;
		} else {
			this.exit = exit.getPrevious();
			this.exit.setNext(null);
		}
		return element;
	}

	public E[] getElements() {
		int size = 0;
		Node<E> node = this.exit;
		while (node != null) {
			size++;
			node = node.getPrevious();
		}
		E[] elements = (E[]) new Object[size];
		node = this.exit;
		for(int position = 0; position < size; position++){
			elements[position] = node.getElement();
 			node = node.getPrevious();
		}
		return elements;
	}

}
