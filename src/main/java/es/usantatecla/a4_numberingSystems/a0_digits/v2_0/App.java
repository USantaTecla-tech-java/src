package es.usantatecla.a4_numberingSystems.a0_digits.v2_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Dame un número entero: ");
    int digits = number;
    int inverse = 0;
    do {
      inverse *= 10;
      final int unit = digits % 10;
      inverse += unit;
      digits -= unit;
      digits /= 10;
    } while (digits > 0);
    console.writeln("El número " + number + " " + (number == inverse ? "sí" : "no") + " es palidromo.");
  }

}
