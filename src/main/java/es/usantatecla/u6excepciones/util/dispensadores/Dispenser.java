package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

interface Dispenser {

	void add(Interval interval) throws FullDispenserException;
	Interval remove();
	boolean isEmpty();
	Iterator iterator();

}
