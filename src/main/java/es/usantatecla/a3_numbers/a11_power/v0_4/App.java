package es.usantatecla.a3_numbers.a11_power.v0_4;

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
    return accPower(base, exponent, 1);
  }

  static float accPower(int base, int exponent, float acc) {
    return exponent == 0 ? acc : accPower(base, exponent - 1, acc * base);
  }

}
