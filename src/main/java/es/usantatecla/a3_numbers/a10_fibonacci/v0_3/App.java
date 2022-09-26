package es.usantatecla.a3_numbers.a10_fibonacci.v0_3;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int position = console.readInt("Dame una posición: ");
    console.writeln("El término de la serie de Fibonacci de posición " + position + " es " + fibonacci(position));
  }

  static int fibonacci(int position) {
    return position <= 2 
      ? 1
      : fibonacci(position - 1) + fibonacci(position - 2);
  }
}
