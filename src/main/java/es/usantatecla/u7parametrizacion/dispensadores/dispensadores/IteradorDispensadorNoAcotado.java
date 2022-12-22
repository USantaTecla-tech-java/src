package es.usantatecla.u7parametrizacion.dispensadores.dispensadores;

import es.usantatecla.u7parametrizacion.dispensadores.util.Iterador;
import es.usantatecla.u7parametrizacion.dispensadores.util.Nodo;

public abstract class IteradorDispensadorNoAcotado<Elemento>
		implements Iterador<Elemento> {

	protected Nodo<Elemento> actual;

	public IteradorDispensadorNoAcotado(Nodo<Elemento> actual) {
		this.actual = actual;
	}

	public boolean hasNext() {
		return actual != null;
	}

	public abstract Elemento next();
}
