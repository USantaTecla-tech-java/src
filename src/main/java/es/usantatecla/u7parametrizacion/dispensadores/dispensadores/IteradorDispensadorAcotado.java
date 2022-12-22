package es.usantatecla.u7parametrizacion.dispensadores.dispensadores;

import es.usantatecla.u7parametrizacion.dispensadores.util.Iterador;

public abstract class IteradorDispensadorAcotado<Elemento>
		implements Iterador<Elemento> {

	protected Elemento elementos[];
	protected int cuantos;
	protected int actual;

	public IteradorDispensadorAcotado(Elemento elementos[], int cuantos,
			int actual) {
		this.elementos = elementos;
		this.cuantos = cuantos;
		this.actual = actual;
	}

	public boolean hasNext() {
		return cuantos != 0;
	}

	public abstract Elemento next();
}
