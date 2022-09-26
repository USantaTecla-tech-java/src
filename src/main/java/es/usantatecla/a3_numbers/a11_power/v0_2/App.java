package es.usantatecla.a3_numbers.a11_power.v0_2;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int base = console.readInt("Dame una base: ");
    int exponent = console.readInt("Dame un exponente: ");
    console.writeln("La base " + base + " elevada al exponente " + exponent + " es " + power(base, exponent));
  }

  static float power(int base, int exponent) {
    if (exponent < 0) {
      return 1 / power(base, -exponent);
    }
    float power = 1;
    for (int i = 0; i < exponent; i++) {
      power *= base;
    }
    return power;
  }
}
