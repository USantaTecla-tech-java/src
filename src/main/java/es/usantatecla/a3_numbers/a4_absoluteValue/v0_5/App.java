package es.usantatecla.a3_numbers.a4_absoluteValue.v0_5;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Escribe un número? ");
    console.writeln("El valor absoluto del número " + number + " es " + getAbsolute(number));
  }

  static int getAbsolute(int number) {
    if (number >= 0) {
      return number;
    }
    return -1 * number;
  }
}
