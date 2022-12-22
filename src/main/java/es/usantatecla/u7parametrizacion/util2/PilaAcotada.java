package es.usantatecla.u7parametrizacion.util2;

public class PilaAcotada<Elemento> {

	private Elemento[] elementos;
	private int cuantos;
	private int siguiente;

	public PilaAcotada(int tamaño) {
		// elementos = new Elemento[tamaño];    ERROR: No se pueden crear vectores de parámetros
	
		elementos = (Elemento[]) new Object[tamaño];
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
		return elementos[siguiente];
	}

	public boolean vacio() {
		return cuantos == 0;
	}

	public boolean lleno() {
		return cuantos == elementos.length;
	}

	public static void main(String[] args) {
		PilaAcotada<Intervalo> pilaIntervalos = new PilaAcotada<Intervalo>(10);
		Intervalo intervalo1 = new Intervalo(1, 2);
		pilaIntervalos.meter(intervalo1);
		Intervalo intervalo2 = new Intervalo(3, 4);
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
		
		
		PilaAcotada<Number> pilaNumber = new PilaAcotada<Number>(10);
		pilaNumber.meter(new Integer(5));
		pilaNumber.meter(new Double(5.5));
		Number n1 = pilaNumber.sacar();
		System.out.println("----------------------------");
		System.out.println(n1);
		
	}
}
