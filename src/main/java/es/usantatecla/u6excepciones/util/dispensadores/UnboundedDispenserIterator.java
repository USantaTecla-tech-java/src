package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

abstract class UnboundedDispenserIterator implements Iterator {

	protected Node actual;

	protected UnboundedDispenserIterator(Node actual) {
		this.actual = actual;
	}

	public boolean hasNext() {
		return actual != null;
	}

	public abstract Interval next();
}
