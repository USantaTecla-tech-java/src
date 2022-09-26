package es.usantatecla.a3_numbers.a9_factorial.v0_4;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int number = console.readInt("Dame un número (0-20): ");
    console.writeln("El factorial de " + number + " es " + factorial(number));
  }

  static int factorial(int number) {
    return accFactorial(number, 1);
  }

  static int accFactorial(int number, int acc) {
    return number < 1 ?
      acc
      :
      accFactorial(number - 1, acc * number);
  }
}
