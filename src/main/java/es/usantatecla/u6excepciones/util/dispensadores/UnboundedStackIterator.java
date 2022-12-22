package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

class UnboundedStackIterator extends UnboundedDispenserIterator {

	public UnboundedStackIterator(Node actual) {
		super(actual);
	}

	public Interval next() {
		Interval intervalo = actual.getInterval();
		actual = actual.getNext();
		return intervalo;
	}
}
