package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

class BoundedStackIterator extends BoundedDispenserIterator {

	public BoundedStackIterator(Interval[] elementos, int cuantos,
			int siguiente) {
		super(elementos, cuantos, siguiente);
	}

	public Interval next() {
		cuantos--;
		actual--;
		return elementos[actual];
	}
}

