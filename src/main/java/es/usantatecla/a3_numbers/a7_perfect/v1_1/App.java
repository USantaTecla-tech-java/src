package es.usantatecla.a3_numbers.a7_perfect.v1_1;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int position = console.readInt("Dame una posición: ");
    int number = 0;
    for (int i = 0; i < position; i++) {
      number++;
      while (!isPerfect(number)) {
        number++;
      }
    }
    console.writeln("El número " + number + " es el " + position + "º número perfecto");
  }

  static boolean isPerfect(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum == number;
  }
}
