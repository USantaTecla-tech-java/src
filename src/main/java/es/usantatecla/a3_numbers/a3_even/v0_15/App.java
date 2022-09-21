package es.usantatecla.a3_numbers.a3_even.v0_15;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Escribe un número? ");
    final String parity = (number & 1) == 0 ? "par" : "impar";
    console.writeln("El numero " + number + " es " + parity);
  }
}

