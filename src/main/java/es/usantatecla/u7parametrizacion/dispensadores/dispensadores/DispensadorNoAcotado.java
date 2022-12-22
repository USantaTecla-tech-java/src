package es.usantatecla.u7parametrizacion.dispensadores.dispensadores;

import es.usantatecla.u7parametrizacion.dispensadores.util.Nodo;

public abstract class DispensadorNoAcotado<Elemento>
		extends Dispensador<Elemento> {

	protected Nodo<Elemento> entrada;

	public DispensadorNoAcotado() {
		entrada = null;
	}

	public void meter(Elemento elemento) {
		entrada = new Nodo<Elemento>(null, elemento, entrada);
	}

	public boolean vacio() {
		return entrada == null;
	}
}
