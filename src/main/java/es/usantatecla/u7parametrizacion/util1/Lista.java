package es.usantatecla.u7parametrizacion.util1;

public class Lista {

	private Nodo inicio = null;
	private Nodo fin = null;
	private int longitud = 0;

	Nodo getInicio() {
		return inicio;
	}

	public int size() {
		return longitud;
	}

	public boolean isEmpty() {
		return inicio == null;
	}

	public Object get(int posicion) {
		Nodo nodo = inicio;
		for (int i = 0; i < posicion; i++) {
			nodo = nodo.next();
		}
		return nodo.getElemento();
	}

	public void add(Object elemento) {
		Nodo nuevo = new Nodo(elemento);
		if (fin == null) {
			inicio = nuevo;

		} else {
			fin.enlazar(nuevo);
		}
		fin = nuevo;
		longitud++;
	}

	public void remove(Object elemento) {
		Nodo anterior = null;
		Nodo actual = inicio;
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

	public Iterador iterador() {
		return new Iterador(this);
	}

	public Lista clone() {
		Lista lista = new Lista();
		if (!this.isEmpty()) {
			Iterador iterador = this.iterador();
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
		Iterador iterador = this.iterador();
		if (iterador.hasNext()) {
			cadena += iterador.next();
		}
		while (iterador.hasNext()) {
			cadena += "; " + iterador.next();
		}
		return cadena + "}";
	}

	public static void main(String[] args) {
		Integer uno = new Integer(1);
		Integer dos = new Integer(2);
		Integer tres = new Integer(3);
		Lista listaEnteros = new Lista();
		listaEnteros.add(uno);
		listaEnteros.add(dos);
		listaEnteros.add(tres);
		System.out.println(listaEnteros);

		Intervalo intervalo1 = new Intervalo(uno, dos);
		Intervalo intervalo2 = new Intervalo(uno, tres);
		Intervalo intervalo3 = new Intervalo(dos, tres);
		Lista listaIntervalos = new Lista();
		listaIntervalos.add(intervalo1);
		listaIntervalos.add(intervalo2);
		listaIntervalos.add(intervalo3);
		System.out.println("----------------------------");
		System.out.println(listaIntervalos);

		intervalo1 = new Intervalo(tres, dos);
		intervalo2 = new Intervalo(tres, uno);
		intervalo3 = new Intervalo(dos, uno);
		Lista listaIntervalos2 = new Lista();
		listaIntervalos2.add(intervalo1);
		listaIntervalos2.add(intervalo2);
		listaIntervalos2.add(intervalo3);
		Lista listaListas = new Lista();
		listaListas.add(listaIntervalos);
		listaListas.add(listaIntervalos2);
		System.out.println("----------------------------");
		System.out.println(listaListas);
	}
}