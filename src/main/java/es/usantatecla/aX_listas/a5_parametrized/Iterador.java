package es.usantatecla.aX_listas.a5_parametrized;

public class Iterador<Elemento extends Number> {

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
