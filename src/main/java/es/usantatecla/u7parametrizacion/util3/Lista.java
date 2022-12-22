package es.usantatecla.u7parametrizacion.util3;

public class Lista<Elemento> {

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

	public static void main(String[] args) {
		Intervalo<Integer> intervaloEnteros1 = new Intervalo<Integer>(
				new Integer(1), new Integer(2));
		Intervalo<Integer> intervaloEnteros2 = new Intervalo<Integer>(
				new Integer(1), new Integer(3));
		Intervalo<Integer> intervaloEnteros3 = new Intervalo<Integer>(
				new Integer(2), new Integer(3));
		Lista<Intervalo<Integer>> listaIntervalosEnteros =
				new Lista<Intervalo<Integer>>();
		listaIntervalosEnteros.add(intervaloEnteros1);
		listaIntervalosEnteros.add(intervaloEnteros2);
		listaIntervalosEnteros.add(intervaloEnteros3);
		System.out.println(listaIntervalosEnteros);

		Intervalo<Double> intervaloReales1 = new Intervalo<Double>(
				new Double(1.1), new Double(2.2));
		Intervalo<Double> intervaloReales2 = new Intervalo<Double>(
				new Double(1.1), new Double(1.3));
		Intervalo<Double> intervaloReales3 = new Intervalo<Double>(
				new Double(2.2), new Double(3.3));
		Lista<Intervalo<Double>> listaIntervalosReales1 =
				new Lista<Intervalo<Double>>();
		listaIntervalosReales1.add(intervaloReales1);
		listaIntervalosReales1.add(intervaloReales2);
		listaIntervalosReales1.add(intervaloReales3);
		System.out.println("----------------------------");
		System.out.println(listaIntervalosReales1);

		intervaloReales1 = new Intervalo<Double>(
				new Double(3.3), new Double(2.2));
		intervaloReales2 = new Intervalo<Double>(
				new Double(3.3), new Double(1.1));
		intervaloReales3 = new Intervalo<Double>(
				new Double(2.2), new Double(1.1));
		Lista<Intervalo<Double>> listaIntervalosReales2 =
				new Lista<Intervalo<Double>>();
		listaIntervalosReales2.add(intervaloReales1);
		listaIntervalosReales2.add(intervaloReales2);
		listaIntervalosReales2.add(intervaloReales3);
		Lista<Lista<Intervalo<Double>>> listaListas =
				new Lista<Lista<Intervalo<Double>>>();
		listaListas.add(listaIntervalosReales1);
		listaListas.add(listaIntervalosReales2);
		System.out.println("----------------------------");
		System.out.println(listaListas);
	}
}