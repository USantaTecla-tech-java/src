package es.usantatecla.a3_numbers.a11_power.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int base = console.readInt("Dame una base: ");
    float exponent = console.readInt("Dame un exponente: ");
    final boolean inverse = exponent < 0;
    if (inverse) {
      exponent *= -1;
    }
    int power = 1;
    for (int i = 0; i < exponent; i++) {
      power *= base;
    }
    if (inverse) {
      power = 1 / power;
      exponent *= -1;
    }
    console.writeln("La base " + base + " elevada al exponente " + exponent + " es " + power);
  }
}
