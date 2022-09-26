package es.usantatecla.a3_numbers.a10_fibonacci.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int position = console.readInt("Dame una posición: ");
    int fibonacci = 1;
    if (position > 2) {
      int previousPrevious = 1;
      int previous = 1;
      for (int i = 3; i <= position; i++) {
        fibonacci = previous + previousPrevious;
        previousPrevious = previous;
        previous = fibonacci;
      }
    }
    console.writeln("El término de la serie de Fibonacci de posición " + position + " es " + fibonacci);
  }
}
