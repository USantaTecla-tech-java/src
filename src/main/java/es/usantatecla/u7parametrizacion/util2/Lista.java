package es.usantatecla.u7parametrizacion.util2;

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
			cadena += "; " + iterador.next().toString();
		}
		return cadena + "}";
	}

	public static void main(String[] args) {
		
		Integer uno = new Integer(1);
		Integer dos = new Integer(2);
		Integer tres = new Integer(3);
		Lista<Integer> listaEnteros = new Lista<Integer>();
		listaEnteros.add(uno);
		listaEnteros.add(dos);
		listaEnteros.add(tres);
		System.out.println(listaEnteros);

		Intervalo intervalo1 = new Intervalo(uno, dos);
		Intervalo intervalo2 = new Intervalo(uno, tres);
		Intervalo intervalo3 = new Intervalo(dos, tres);
		Lista<Intervalo> listaIntervalos1 = new Lista<Intervalo>();
		listaIntervalos1.add(intervalo1);
		listaIntervalos1.add(intervalo2);
		listaIntervalos1.add(intervalo3);
		System.out.println("----------------------------");
		System.out.println(listaIntervalos1);

		intervalo1 = new Intervalo(tres, dos);
		intervalo2 = new Intervalo(tres, uno);
		intervalo3 = new Intervalo(dos, uno);
		Lista<Intervalo> listaIntervalos2 = new Lista<Intervalo>();
		listaIntervalos2.add(intervalo1);
		listaIntervalos2.add(intervalo2);
		listaIntervalos2.add(intervalo3);
		Lista<Lista<Intervalo>> listaListas = new Lista<Lista<Intervalo>>();
		listaListas.add(listaIntervalos1);
		listaListas.add(listaIntervalos2);
		System.out.println("----------------------------");
		System.out.println(listaListas);

		
		
		
//		Lista lista1 = new Lista();
//		Lista lista2 = new Lista<Integer>();
//		Lista<Integer> lista3 = new Lista();
//		Lista<Integer>[] listaMal = new Lista<Integer>[10];
//		Lista<Integer>[] listaBien = new Lista[10];
//		Lista<Integer>[] listaIgualBien = (Lista<Integer>[]) new Lista[10];
	}
}