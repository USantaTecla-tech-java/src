package es.usantatecla.aX_dispensers.a7_modular.dispensers;

import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;
import es.usantatecla.aX_dispensers.a7_modular.utils.Iterator;

public interface Dispenser {

	void add(Interval interval) throws FullDispenserException;
	Interval remove() throws EmptyDispenserException;
	boolean isEmpty();
	Iterator getIterator();
	
}
