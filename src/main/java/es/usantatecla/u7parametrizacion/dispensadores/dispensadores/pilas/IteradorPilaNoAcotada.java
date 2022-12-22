package es.usantatecla.u7parametrizacion.dispensadores.dispensadores.pilas;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.IteradorDispensadorNoAcotado;
import es.usantatecla.u7parametrizacion.dispensadores.util.Nodo;

class IteradorPilaNoAcotada<Elemento> extends
		IteradorDispensadorNoAcotado<Elemento> {

	IteradorPilaNoAcotada(Nodo<Elemento> actual) {
		super(actual);
	}

	public Elemento next() {
		Elemento elemento = actual.getElemento();
		actual = actual.getSiguiente();
		return elemento;
	}
}
