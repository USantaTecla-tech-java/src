package es.usantatecla.u7parametrizacion.dispensadores.dispensadores.colas;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.IteradorDispensadorAcotado;

class IteradorColaAcotada<Elemento> extends
		IteradorDispensadorAcotado<Elemento> {

	IteradorColaAcotada(Elemento elementos[], int cuantos,
			int inicio) {
		super(elementos, cuantos, inicio);
	}

	public Elemento next() {
		cuantos--;
		Elemento elemento = elementos[actual];
		actual = (actual + 1) % elementos.length;
		return elemento;
	}
}

