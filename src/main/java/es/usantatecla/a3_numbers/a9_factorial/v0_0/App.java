package es.usantatecla.a3_numbers.a9_factorial.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int number = console.readInt("Dame un número (0-20): ");
    int factorial = 1;
    for (int i = 1; i <= number; i++) // {
      factorial *= i;
    // }
    console.writeln("El factorial de " + number + " es " + factorial);
  }
}
