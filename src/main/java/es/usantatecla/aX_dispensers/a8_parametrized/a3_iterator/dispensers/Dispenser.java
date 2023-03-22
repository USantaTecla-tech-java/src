package es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.utils.Iterator;

public interface Dispenser<E> {

	void add(E element) throws FullDispenserException;
	E remove() throws EmptyDispenserException;
	boolean isEmpty();
	Iterator<E> getIterator();
	
}
