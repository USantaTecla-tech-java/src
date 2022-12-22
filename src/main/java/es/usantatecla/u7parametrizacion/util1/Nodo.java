package es.usantatecla.u7parametrizacion.util1;

class Nodo {

	private Object elemento;
	private Nodo siguiente;

	public Nodo(Object elemento) {
		this.elemento = elemento;
		this.siguiente = null;
	}

	public Object getElemento() {
		return elemento;
	}

	public void enlazar(Nodo nodo) {
		this.siguiente = nodo;
	}

	public boolean tienes(Object elemento) {
		return this.elemento == elemento;
	}

	public Nodo next() {
		return siguiente;
	}
}
