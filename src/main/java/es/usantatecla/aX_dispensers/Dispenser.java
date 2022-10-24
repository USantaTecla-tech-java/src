package es.usantatecla.aX_dispensers;

interface Dispenser {

	void add(Interval interval);

	Interval remove();

	boolean isEmpty();

	Iterator getIterator();
}
