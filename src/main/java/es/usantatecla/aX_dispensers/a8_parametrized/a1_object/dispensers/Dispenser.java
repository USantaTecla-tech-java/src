package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Iterator;

public interface Dispenser {

	void add(Object element) throws FullDispenserException;
	Object remove() throws EmptyDispenserException;
	boolean isEmpty();
	Iterator getIterator();
	
}
