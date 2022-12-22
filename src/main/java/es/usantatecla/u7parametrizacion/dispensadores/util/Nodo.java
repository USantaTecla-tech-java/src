package es.usantatecla.u7parametrizacion.dispensadores.util;

public class Nodo<Elemento> {

	private Elemento elemento;
	private Nodo<Elemento> anterior;
	private Nodo<Elemento> siguiente;

	public Nodo(Nodo<Elemento> anterior, Elemento elemento,
			Nodo<Elemento> siguiente) {
		this.elemento = elemento;
		this.setAnterior(anterior);
		this.setSiguiente(siguiente);
	}

	public Nodo<Elemento> getAnterior() {
		return anterior;
	}

	public Nodo<Elemento> getSiguiente() {
		return siguiente;
	}

	public void setAnterior(Nodo<Elemento> anterior) {
		this.anterior = anterior;
		if (anterior != null) {
			anterior.siguiente = this;
		}
	}

	public void setSiguiente(Nodo<Elemento> siguiente) {
		this.siguiente = siguiente;
		if (siguiente != null) {
			siguiente.anterior = this;
		}
	}

	public Elemento getElemento() {
		return elemento;
	}
}
