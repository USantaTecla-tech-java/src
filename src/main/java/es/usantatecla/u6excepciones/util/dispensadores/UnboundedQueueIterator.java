package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

class UnboundedQueueIterator extends UnboundedDispenserIterator {

	public UnboundedQueueIterator(Node actual) {
		super(actual);
	}

	public Interval next() {
		Interval intervalo = actual.getInterval();
		actual = actual.getPrevious();
		return intervalo;
	}
}
