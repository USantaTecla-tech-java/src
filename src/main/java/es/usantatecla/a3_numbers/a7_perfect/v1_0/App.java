package es.usantatecla.a3_numbers.a7_perfect.v1_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int position = console.readInt("Dame una posición: ");
    int number = 0;
    for (int i = 0; i < position; i++) {
      int sum;
      do {
        number++;
        sum = 0;
        for (int j = 1; j < number; j++) {
          if (number % j == 0) {
            sum += j;
          }
        }
      } while (sum != number);
    }
    console.writeln("El número " + number + " es el " + position + "º número perfecto");
  }
}
