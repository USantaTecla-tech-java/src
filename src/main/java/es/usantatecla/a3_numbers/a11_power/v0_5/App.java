package es.usantatecla.a3_numbers.a11_power.v0_5;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int base = console.readInt("Dame una base: ");
    int exponent = console.readInt("Dame un exponente: ");
    console.writeln("La base " + base + " elevada al exponente " + exponent + " es " + power(base, exponent));
  }

  static float power(int base, int exponent) {
    return exponent < 0
        ? 1 / power(base, -exponent)
        : exponent == 0
            ? 1
            : base * power(base, exponent - 1);
  }
}
