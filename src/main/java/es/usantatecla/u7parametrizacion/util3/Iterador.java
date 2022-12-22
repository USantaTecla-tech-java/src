package es.usantatecla.u7parametrizacion.util3;

public class Iterador<Elemento> {

	private Nodo<Elemento> actual;

	public Iterador(Lista<Elemento> lista){
		this.actual = lista.getInicio();
	}

	public boolean hasNext(){
		return actual != null;
	}

	public Elemento next() {
		Elemento elemento = actual.getElemento();
		actual = actual.next();
		return elemento;
	}
}
