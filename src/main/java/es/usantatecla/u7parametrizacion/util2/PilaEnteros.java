package es.usantatecla.u7parametrizacion.util2;

public class PilaEnteros extends PilaAcotada<Integer> {

	public PilaEnteros(int tamaño) {
		super(tamaño);
	}

	public static void main(String[] args) {
		PilaEnteros enteros = new PilaEnteros(6);
		enteros.meter(new Integer(3));

		Integer uno = new Integer(3);
		int resultado = uno.compareTo(new Integer(5));
		System.out.println(resultado);
	}
}
