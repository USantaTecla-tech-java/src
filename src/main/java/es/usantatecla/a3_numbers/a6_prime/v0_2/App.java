package es.usantatecla.a3_numbers.a6_prime.v0_2;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int number = console.readInt("Dame un número positivo: ");
    console.writeln("El número " + number + " " + (isPrime(number) ? "si" : "no") + " es primo");
  }

  static boolean isPrime(int number) {
    if (number < 2) {
      return false;
    }
    int next = 2;
    while (number % next != 0) {
      next++;
    }
    return number == next;
  }
}
