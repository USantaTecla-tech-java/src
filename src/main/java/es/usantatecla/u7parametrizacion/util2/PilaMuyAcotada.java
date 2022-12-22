package es.usantatecla.u7parametrizacion.util2;

public class PilaMuyAcotada<Elemento> extends PilaAcotada<Elemento> {

	public PilaMuyAcotada(int tamaño) {
		super(tamaño / 2);
	}

	public void doblar(Elemento elemento) {
		this.meter(elemento);
		this.meter(elemento);
	}

	public static void main(String[] args) {
		PilaMuyAcotada<String> cadenas = new PilaMuyAcotada<String>(6);
		cadenas.doblar("hola");
		System.out.println(cadenas.sacar());
	}
}
