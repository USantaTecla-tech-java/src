package es.usantatecla.u7parametrizacion.util5;

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

	public <Tipo extends Number> Lista<Tipo> mayores(Lista<Tipo> lista) {
		Lista<Tipo> mayores = new Lista<Tipo>();
		Iterador<Elemento> iterador = this.iterador();
		Iterador<Tipo> iteradorLista = lista.iterador();
		while (iterador.hasNext() && iteradorLista.hasNext()) {
			Elemento elemento = iterador.next();
			Tipo valor = iteradorLista.next();
			if (valor.doubleValue() > elemento.doubleValue()) {
				mayores.add(valor);
			}
		}
		return mayores;
	}

	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(3);
		Lista<Integer> listaEnteros = new Lista<Integer>();
		listaEnteros.add(i1);
		listaEnteros.add(i2);
		listaEnteros.add(i3);

		Double d1 = new Double(0.5);
		Double d2 = new Double(2.7);
		Double d3 = new Double(3.1);
		Lista<Double> listaReales = new Lista<Double>();
		listaReales.add(d1);
		listaReales.add(d2);
		listaReales.add(d3);

		Lista<Double> mayoresReales = listaEnteros.mayores(listaReales);
		System.out.println("Los elementos de " + listaReales +
				" mayores que " + listaEnteros + " son " + mayoresReales);

		Lista<Integer> mayoresEnteros = listaReales.mayores(listaEnteros);
		System.out.println("Los elementos de " + listaEnteros +
				" mayores que " + listaReales + " son " + mayoresEnteros);
	}
}
