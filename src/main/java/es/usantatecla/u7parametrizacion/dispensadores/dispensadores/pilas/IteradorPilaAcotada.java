package es.usantatecla.u7parametrizacion.dispensadores.dispensadores.pilas;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.IteradorDispensadorAcotado;

class IteradorPilaAcotada<Elemento> extends
		IteradorDispensadorAcotado<Elemento> {

	IteradorPilaAcotada(Elemento elementos[], int cuantos,
			int siguiente) {
		super(elementos, cuantos, siguiente);
	}

	public Elemento next() {
		cuantos--;
		actual--;
		return elementos[actual];
	}
}

