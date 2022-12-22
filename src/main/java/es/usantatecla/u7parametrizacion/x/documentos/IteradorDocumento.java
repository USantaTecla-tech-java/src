package es.usantatecla.u7parametrizacion.x.documentos;

import es.usantatecla.u7parametrizacion.x.componentes.Componente;
import es.usantatecla.u7parametrizacion.x.componentes.Visualizable;

public class IteradorDocumento<V extends Visualizable> {

	protected Componente<V>[] componentes;
	protected int numComponentes;
	protected int actual;

	protected IteradorDocumento(Componente<V>[] componentes,
			int numComponentes) {
		this.componentes = componentes;
		this.numComponentes = numComponentes;
		actual = 0;
	}

	public boolean hasNext() {
		return actual < numComponentes;
	}

	public Componente<V> next() {
		return componentes[actual++];
	}
}

