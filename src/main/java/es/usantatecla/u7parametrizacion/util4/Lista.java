package es.usantatecla.u7parametrizacion.util4;

public class Lista<Elemento extends Number> {

	private Nodo<Elemento> inicio = null;
	private Nodo<Elemento> fin = null;
	private int longitud = 0;

	Nodo<Elemento> getInicio() {
		return inicio;
	}

	public int size() {
		return longitud;
	}

	public boolean isEmpty() {
		return inicio == null;
	}

	public Elemento get(int posicion) {
		Nodo<Elemento> nodo = inicio;
		for (int i = 0; i < posicion; i++) {
			nodo = nodo.next();
		}
		return nodo.getElemento();
	}

	public void add(Elemento elemento) {
		Nodo<Elemento> nuevo = new Nodo<Elemento>(elemento);
		if (fin == null) {
			inicio = nuevo;

		} else {
			fin.enlazar(nuevo);
		}
		fin = nuevo;
		longitud++;
	}

	public void remove(Elemento elemento) {
		Nodo<Elemento> anterior = null;
		Nodo<Elemento> actual = inicio;
		while (!actual.tienes(elemento)) {
			anterior = actual;
			actual = actual.next();
		}
		if (anterior == null) {
			inicio = actual.next();
		} else {
			anterior.enlazar(actual.next());
		}
		if (actual == fin) {
			fin = anterior;
		}
		longitud--;
	}

	public Iterador<Elemento> iterador() {
		return new Iterador<Elemento>(this);
	}

	public Lista<Elemento> clone() {
		Lista<Elemento> lista = new Lista<Elemento>();
		if (!this.isEmpty()) {
			Iterador<Elemento> iterador = this.iterador();
			while (iterador.hasNext()) {
				lista.add(iterador.next());
			}
		}
		return lista;
	}

	public void clear() {
		inicio = null;
		fin = null;
		longitud = 0;
	}

	public String toString() {
		String cadena = "{";
		Iterador<Elemento> iterador = this.iterador();
		if (iterador.hasNext()) {
			cadena += iterador.next();
		}
		while (iterador.hasNext()) {
			cadena += "; " + iterador.next();
		}
		return cadena + "}";
	}

	public double suma2(Lista<Number> lista) {
		double suma = 0.0;
		Iterador<Elemento> iterador = this.iterador();
		while (iterador.hasNext()) {
			Elemento elemento = iterador.next();
			suma += elemento.doubleValue();
		}
		Iterador<Number> iteradorLista = lista.iterador();
		while (iteradorLista.hasNext()) {
			Number numero = iteradorLista.next();
			suma += numero.doubleValue();
		}
		return suma;
	}

	// Se podria omitir extends Number
	public double suma(Lista<? extends Number> lista) {
		double suma = 0.0;
		Iterador<Elemento> iterador = this.iterador();
		while (iterador.hasNext()) {
			Elemento elemento = iterador.next();
			suma += elemento.doubleValue();
		}
		// Se podria omitir extends Number
		Iterador<? extends Number> iteradorLista = lista.iterador();
		while (iteradorLista.hasNext()) {
			Number numero = iteradorLista.next();
			suma += numero.doubleValue();
		}
		return suma;
	}

	public void addAll(Lista<? extends Elemento> lista) {
		Iterador<? extends Elemento> iteradorLista = lista.iterador();
		while (iteradorLista.hasNext()) {
			Elemento elemento = iteradorLista.next();
			this.add(elemento);
		}
	}

}
