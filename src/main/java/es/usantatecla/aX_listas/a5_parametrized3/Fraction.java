package es.usantatecla.aX_listas.a5_parametrized3;

public class Fraction extends Number {

	int numerator;
	int denominator;

	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public int intValue() {
		return this.numerator / this.denominator;
	}

	public long longValue() {
		return (long) this.numerator / (long) this.denominator;
	}

	public float floatValue() {
		return (float) this.numerator / (float) this.denominator;
	}

	public double doubleValue() {
		return (double) this.numerator / (double) this.denominator;
	}
	
}
