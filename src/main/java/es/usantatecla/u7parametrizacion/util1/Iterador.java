package es.usantatecla.u7parametrizacion.util1;

public class Iterador {

	private Nodo actual;

	public Iterador (Lista lista){
		this.actual = lista.getInicio();
	}

	public boolean hasNext(){
		return actual != null;
	}

	public Object next() {
		Object elemento = actual.getElemento();
		actual = actual.next();
		return elemento;
	}
}
