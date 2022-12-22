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

//	ERRONEO
//	public double suma(Lista<Number> lista) {
//		double suma = 0.0;
//		Iterador<Elemento> iterador = this.iterador();
//		while (iterador.hasNext()) {
//			Elemento elemento = iterador.next();
//			suma += elemento.doubleValue();
//		}
//		Iterador<Number> iteradorLista = lista.iterador();
//		while (iteradorLista.hasNext()) {
//			Number numero = iteradorLista.next();
//			suma += numero.doubleValue();
//		}
//		return suma;
//	}

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

	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(3);
		Lista<Integer> listaEnteros = new Lista<Integer>();
		listaEnteros.add(i1);
		listaEnteros.add(i2);
		listaEnteros.add(i3);

		Double d1 = new Double(1.1);
		Double d2 = new Double(2.2);
		Double d3 = new Double(3.3);
		Lista<Double> listaReales = new Lista<Double>();
		listaReales.add(d1);
		listaReales.add(d2);
		listaReales.add(d3);
		System.out.println("La suma de los elementos de " +
				listaEnteros + " y " + listaReales + " es " +
				listaEnteros.suma(listaReales));
		System.out.println("La suma de los elementos de " +
				listaReales + " y " + listaEnteros + " es " +
				listaReales.suma(listaEnteros));
		System.out.println("Son iguales = " +
				(listaEnteros.suma(listaReales) ==
				 listaReales.suma(listaEnteros)));

		Lista<Number> listaNumeros = new Lista<Number>();
		listaNumeros.addAll(listaEnteros);
		listaNumeros.addAll(listaReales);
		System.out.println("La lista resultado de unir " +
				listaEnteros + " y " + listaReales + " es " + listaNumeros);

		Lista<Fraccion> listaFracciones = new Lista<Fraccion>();
		listaFracciones.add(new Fraccion(1, 2));
		listaFracciones.add(new Fraccion(1, 3));
		listaFracciones.add(new Fraccion(2, 3));
		System.out.print("La lista resultado de unir " +
				listaNumeros + " y " + listaFracciones + " es ");
		listaNumeros.addAll(listaFracciones);
		System.out.println(listaNumeros);

//		Lista<Double> listaReales2 = new Lista<Double>();
//		Lista<Number> listaNumeros2 = listaReales2;   // ERROR
//		listaNumeros2.add(new Integer(3));
//		Double real2 = listaReales2.get(0);
//

		// Se podria omitir extends Number
//		Lista<? extends Number> listaNumeros3 = listaReales;    // CORRECTO
//		listaNumeros3.add(new Double(3));                       // ERROR
//		Number numero = new Double(3);
//		listaNumeros3.add(numero);                              // ERROR
//		Double x1 = listaNumeros3.get(0);                       // ERROR
//		Number x2 = listaNumeros3.get(0);                       // CORRECTO
//		String cadena1 = listaNumeros3.toString();              // CORRECTO
//		listaNumeros3.clear();                                  // CORRECTO
//		String cadena2 = listaNumeros3.toString();              // CORRECTO
	}
}
