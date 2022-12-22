package es.usantatecla.u7parametrizacion.util3;

public class PilaAcotada<Elemento> {

	protected Object[] elementos;
	protected int cuantos;
	protected int siguiente;

	public PilaAcotada(int tamaño) {
		elementos = new Object[tamaño];
		cuantos = 0;
		siguiente = 0;
	}

	public void meter(Elemento elemento) {
		cuantos++;
		elementos[siguiente] = elemento;
		siguiente++;
	}

	public Elemento sacar() {
		cuantos--;
		siguiente--;
		return (Elemento) elementos[siguiente];
	}

	public boolean vacio() {
		return cuantos == 0;
	}

	public boolean lleno() {
		return cuantos == elementos.length;
	}

	public static void main(String[] args) {
		PilaAcotada<Intervalo<Integer>> pilaIntervalos =
				new PilaAcotada<Intervalo<Integer>>(10);
		Intervalo<Integer> intervalo1 = new Intervalo<Integer>(1, 2);
		pilaIntervalos.meter(intervalo1);
		Intervalo<Integer> intervalo2 = new Intervalo<Integer>(3, 4);
		pilaIntervalos.meter(intervalo2);
		intervalo1 = pilaIntervalos.sacar();
		System.out.println(intervalo1);
		intervalo2 = pilaIntervalos.sacar();
		System.out.println(intervalo2);

		PilaAcotada<Integer> pilaEnteros = new PilaAcotada<Integer>(10);
		Integer i1 = new Integer(4);
		pilaEnteros.meter(i1);
		Integer i2 = new Integer(7);
		pilaEnteros.meter(i2);
		System.out.println("----------------------------");
		i1 = pilaEnteros.sacar();
		System.out.println(i1);
		i2 = pilaEnteros.sacar();
		System.out.println(i2);

//		pilaEnteros.meter(intervalo1);
//		i1 = pilaEnteros.sacar();
//		System.out.println(i1);
	}
}
