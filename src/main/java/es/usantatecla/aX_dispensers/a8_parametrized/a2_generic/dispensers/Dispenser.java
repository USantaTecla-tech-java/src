package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Iterator;

public interface Dispenser<E> {

	void add(E element) throws FullDispenserException;
	E remove() throws EmptyDispenserException;
	boolean isEmpty();
	Iterator<E> getIterator();
	
}
