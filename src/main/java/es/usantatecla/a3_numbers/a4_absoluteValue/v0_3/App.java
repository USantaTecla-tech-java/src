package es.usantatecla.a3_numbers.a4_absoluteValue.v0_3;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Escribe un número? ");
    int absolute = number;
    if (number < 0) {
      absolute *= -1;
    }
    console.writeln("El valor absoluto del número " + number + " es " + absolute);
  }
}
