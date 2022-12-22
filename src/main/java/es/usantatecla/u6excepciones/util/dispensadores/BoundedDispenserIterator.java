package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

abstract class BoundedDispenserIterator implements Iterator {

	protected Interval[] elementos;
	protected int cuantos;
	protected int actual;

	protected BoundedDispenserIterator(Interval[] elementos, int cuantos,
			int actual) {
		this.elementos = elementos;
		this.cuantos = cuantos;
		this.actual = actual;
	}

	public boolean hasNext() {
		return cuantos != 0;
	}

	public abstract Interval next();
}
