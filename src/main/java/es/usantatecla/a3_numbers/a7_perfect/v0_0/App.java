package es.usantatecla.a3_numbers.a7_perfect.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int number = console.readInt("Dame un número positivo: ");
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    console.writeln("El número " + number + (sum == number ? "si" : "no") + " es perfecto");
  }
}
