package es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.utils.Iterator;

public class UnboundedStack<E> extends UnboundedDispenser<E> {

	public E remove() {
		E element = entrance.getElement();
		entrance = entrance.getNext();
		return element;
	}

	public Iterator<E> getIterator() {
		return new UnboundedStackIterator(entrance);
	}

}
