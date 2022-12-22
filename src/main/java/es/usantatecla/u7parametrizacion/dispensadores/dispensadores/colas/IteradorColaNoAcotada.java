package es.usantatecla.u7parametrizacion.dispensadores.dispensadores.colas;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.IteradorDispensadorNoAcotado;
import es.usantatecla.u7parametrizacion.dispensadores.util.Nodo;

class IteradorColaNoAcotada<Elemento> extends
		IteradorDispensadorNoAcotado<Elemento> {

	IteradorColaNoAcotada(Nodo<Elemento> actual) {
		super(actual);
	}

	public Elemento next() {
		Elemento elemento = actual.getElemento();
		actual = actual.getAnterior();
		return elemento;
	}
}
