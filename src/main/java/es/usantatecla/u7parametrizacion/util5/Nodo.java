package es.usantatecla.u7parametrizacion.util5;

class Nodo<Elemento> {

	private Elemento elemento;
	private Nodo<Elemento> siguiente;

	public Nodo(Elemento elemento) {
		this.elemento = elemento;
		this.siguiente = null;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void enlazar(Nodo<Elemento> nodo) {
		this.siguiente = nodo;
	}

	public boolean tienes(Elemento elemento) {
		return this.elemento == elemento;
	}

	public Nodo<Elemento> next() {
		return siguiente;
	}
}
