package es.usantatecla.u6excepciones.util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Fraction {

	private int numerator = 0;
	private int denominator = 1;

	public Fraction(int numerator, int denominator) {
		if (denominator == 0) {
			throw new ArithmeticException("El denominador no puede ser 0");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public String toString(){
		return ""+this.numerator+"/"+this.denominator;
	}

	public Fraction scale(int value){
		return new Fraction(this.numerator * value, this.denominator * value);
	}

	public Fraction(String cadena) {
		if (!Pattern.matches(" *(\\d+) */ *(\\d+) *", cadena)) {
			throw new NumberFormatException("Formato incorrecto");
		}
		Scanner scanner = new Scanner(cadena);
		int numerator = scanner.nextInt();
		scanner.next();
		int denominator = scanner.nextInt();
		scanner.close();
		if (denominator == 0) {
			throw new ArithmeticException("El denominador no puede ser 0");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public static Fraction createFraction(int numerator, int denominator) {
		return new Fraction(numerator, denominator);
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		gestorIO.escribirLinea("Inicio");
		try {
			gestorIO.escribirLinea("Antes");
			Fraction fraccion = Fraction.createFraction(3, 0);
			gestorIO.escribir(fraccion.scale(2).toString());
			gestorIO.escribirLinea("Despues");
		} catch (ArithmeticException ex) {
			gestorIO.escribirLinea("Error aritmetico");
			ex.printStackTrace();
		}
		gestorIO.escribirLinea("Fin");
	}
}


