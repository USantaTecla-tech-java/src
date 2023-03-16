package es.usantatecla.aX_dispensers.a7_exceptions;

interface Dispenser {

	void add(Interval interval) throws FullDispenserException;
	Interval remove() throws EmptyDispenserException;
	boolean isEmpty();
	Iterator getIterator();
	
}
