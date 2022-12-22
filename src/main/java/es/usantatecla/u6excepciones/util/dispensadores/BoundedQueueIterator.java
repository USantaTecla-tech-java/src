package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

class BoundedQueueIterator extends BoundedDispenserIterator {

	public BoundedQueueIterator(Interval[] elementos, int cuantos,
			int inicio) {
		super(elementos, cuantos, inicio);
	}

	public Interval next() {
		cuantos--;
		Interval intervalo = elementos[actual];
		actual = (actual + 1) % elementos.length;
		return intervalo;
	}
}

