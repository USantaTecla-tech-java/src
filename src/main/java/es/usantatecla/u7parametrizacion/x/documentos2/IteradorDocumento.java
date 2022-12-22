package es.usantatecla.u7parametrizacion.x.documentos2;

import es.usantatecla.u7parametrizacion.x.componentes2.Visualizable;

public class IteradorDocumento<C extends Visualizable> {

	protected C[] componentes;
	protected int numComponentes;
	protected int actual;

	protected IteradorDocumento(C[] componentes, int numComponentes) {
		this.componentes = componentes;
		this.numComponentes = numComponentes;
		actual = 0;
	}

	public boolean hasNext() {
		return actual < numComponentes;
	}

	public C next() {
		return componentes[actual++];
	}
}

