package es.usantatecla.u7parametrizacion.util1;

public class PilaAcotada {

	private Object[] elementos;
	private int cuantos;
	private int siguiente;

	public PilaAcotada(int tamaño) {
		elementos = new Object[tamaño];
		cuantos = 0;
		siguiente = 0;
	}

	public void meter(Object elemento) {
		cuantos++;
		elementos[siguiente] = elemento;
		siguiente++;
	}

	public Object sacar() {
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
		PilaAcotada pilaIntervalos = new PilaAcotada(10);
		Intervalo intervalo1 = new Intervalo(1, 2);
		pilaIntervalos.meter(intervalo1);
		Intervalo intervalo2 = new Intervalo(3, 4);
		pilaIntervalos.meter(intervalo2);
		intervalo1 = (Intervalo) pilaIntervalos.sacar();
		System.out.println(intervalo1);
		intervalo2 = (Intervalo) pilaIntervalos.sacar();
		System.out.println(intervalo2);

		PilaAcotada pilaEnteros = new PilaAcotada(10);
		Integer i1 = new Integer(4);
		pilaEnteros.meter(i1);
		Integer i2 = new Integer(7);
		pilaEnteros.meter(i2);
		System.out.println("----------------------------");
		i1 = (Integer) pilaEnteros.sacar();
		System.out.println(i1);
		i2 = (Integer) pilaEnteros.sacar();
		System.out.println(i2);

		pilaEnteros.meter(intervalo1);
		i1 = (Integer)  pilaEnteros.sacar();   // ERROR DE EJECUCION
		System.out.println(i1);
	}
}
