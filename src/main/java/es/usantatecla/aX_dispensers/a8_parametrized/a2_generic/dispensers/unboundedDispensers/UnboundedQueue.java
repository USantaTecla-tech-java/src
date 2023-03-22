package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Iterator;
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

	public Iterator<E> getIterator() {
		return new UnboundedQueueIterator<E>(exit);
	}

}
