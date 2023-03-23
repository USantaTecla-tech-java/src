package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Node;

public class UnboundedStack<E> extends UnboundedDispenser<E> {

	public E remove() {
		E element = entrance.getElement();
		entrance = entrance.getNext();
		return element;
	}

	public E[] getElements() {
		int size = 0;
		Node<E> node = this.entrance;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		E[] elements = (E[]) new Object[size];
		node = this.entrance;
		for(int position = 0; position < size; position++){
			elements[position] = node.getElement();
 			node = node.getNext();
		}
		return elements;
	}

}
