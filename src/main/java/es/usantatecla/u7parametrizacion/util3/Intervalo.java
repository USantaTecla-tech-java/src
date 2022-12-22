package es.usantatecla.u7parametrizacion.util3;

public class Intervalo<Elemento extends Comparable<Elemento>> {

	private Elemento minimo;
	private Elemento maximo;

	protected Elemento getMinimo() {
		return minimo;
	}

	protected Elemento getMaximo() {
		return maximo;
	}

	public Intervalo(Elemento minimo, Elemento maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public Intervalo(Intervalo<Elemento> intervalo) {
		this(intervalo.minimo, intervalo.maximo);
	}

	public Intervalo<Elemento> copia() {
		return new Intervalo<Elemento>(this);
	}

	public boolean incluye(Elemento elemento) {
		return minimo.compareTo(elemento) <= 0 &&
				maximo.compareTo(elemento) >= 0;
	}

	public boolean incluye(Intervalo<Elemento> intervalo) {
		return this.incluye(intervalo.minimo) &&
			   this.incluye(intervalo.maximo);
	}

	public boolean iguales(Intervalo<Elemento> intervalo) {
		return minimo.equals(intervalo.minimo) &&
		       maximo.equals(intervalo.maximo);
	}

	public boolean distintos(Intervalo<Elemento> intervalo) {
		return !this.iguales(intervalo);
	}

	public String toString() {
		return "[" + minimo + ", " + maximo + "]";
	}

	public Intervalo<Elemento> interseccion(Intervalo<Elemento> intervalo) {
		if (this.incluye(intervalo)) {
			return intervalo.copia();
		} else if (intervalo.incluye(this)) {
			return this.copia();
		} else if (this.incluye(intervalo.minimo)) {
			return new Intervalo<Elemento>(intervalo.minimo, this.maximo);
		} else if (this.incluye(intervalo.maximo)) {
			return new Intervalo<Elemento>(this.minimo, intervalo.maximo);
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Intervalo<Integer> intervaloEnteros1 = new Intervalo<Integer>(
				new Integer(1), new Integer(5));
		Intervalo<Integer> intervaloEnteros2 = new Intervalo<Integer>(
				new Integer(2), new Integer(3));
		System.out.println("El intervalo " + intervaloEnteros1 +
				(intervaloEnteros1.incluye(intervaloEnteros2) ? " SI" : " NO") +
				" incluye al intervalo " + intervaloEnteros2);

		Intervalo<Double> intervaloReales1 = new Intervalo<Double>(
				new Double(3.3), new Double(5.5));
		Intervalo<Double> intervaloReales2 = new Intervalo<Double>(
				new Double(4.4), new Double (6.6));
		System.out.println("El intervalo " + intervaloReales1 +
				(intervaloReales1.incluye(intervaloReales2) ? " SI" : " NO") +
				" incluye al intervalo " + intervaloReales2);
	}
}