package es.usantatecla.u7parametrizacion.util4;

public class Fraccion extends Number {

	int numerador;
	int denominador;

	public Fraccion() {
		this.numerador = 0;
		this.denominador = 1;
	}

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public String toString() {
		return numerador + "/" + denominador;
	}

	public int intValue() {
		return numerador / denominador;
	}

	public long longValue() {
		return (long) numerador / (long) denominador;
	}

	public float floatValue() {
		return (float) numerador / (float) denominador;
	}

	public double doubleValue() {
		return (double) numerador / (double) denominador;
	}
}
