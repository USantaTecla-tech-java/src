package es.usantatecla.a5_units.a0_fraction.classes;

import es.usantatecla.utils.Console;

class Fraction {

  private int numerator;
  private int denominator;
  
  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction() {
    this(0);
  }

  public Fraction add(Fraction fraction) {
    return new Fraction(
      this.numerator * fraction.denominator + fraction.numerator * this.denominator,
      this.denominator * fraction.denominator).simplified();
  }

  private Fraction simplified() {
    final int divisor = this.gcd();
    return new Fraction(this.numerator / divisor, this.denominator / divisor);
  }

  private int gcd() {
    if (this.numerator == this.denominator)
      return this.numerator;
    if (this.numerator > this.denominator)
      return new Fraction(this.numerator - this.denominator, this.denominator).gcd();
    return new Fraction(this.numerator, this.denominator - this.numerator).gcd();
  }

  public Fraction subtract(Fraction fraction) {
    return this.add(fraction.opposite());
  }

  public Fraction opposite() {
    return new Fraction(-this.numerator, this.denominator);
  }

  public Fraction multiply(Fraction fraction) {
    return new Fraction(
      this.numerator * fraction.numerator,
      this.denominator * fraction.denominator).simplified();
  }

  public Fraction divide(Fraction fraction) {
    return this.multiply(fraction.reverse());
  }

  public Fraction reverse() {
    return new Fraction(this.denominator, this.numerator);
  }

  public String toString() {
    return "(" + this.numerator + "/" + this.denominator+")";
  }

  public void read() {
    Console console = new Console();
    this.numerator = console.readInt("Dame el numerador");
    this.denominator = console.readInt("Dame el denominador");
  }

}

public class App {

  public static void main(String[] args){
    Console console = new Console();
    final int SIZE = 3;
    Fraction[] fractions = new Fraction[SIZE];
    for (int i = 0; i < fractions.length; i++) {
      fractions[i] = new Fraction();
      fractions[i].read();
    }
    for (int i = 0; i < fractions.length; i++) {
      console.writeln("Fracción: " + fractions[i] + " e inversa: " + fractions[i].reverse());
    }
    Fraction sum = new Fraction(0);
    Fraction product = new Fraction(1);
    for (int i = 0; i < fractions.length; i++) {
      sum = sum.add(fractions[i]);
      product = product.multiply(fractions[i]);
    }
    console.writeln("Suma: " + sum);
    console.writeln("Producto: " + product);
    for (int i = 0; i < fractions.length; i++) {
      console.writeln("Suma sin " + fractions[i] + ": " + sum.subtract(fractions[i]));
      console.writeln("Producto sin " + fractions[i] + ": " + sum.subtract(fractions[i]));
    }
  }
}


