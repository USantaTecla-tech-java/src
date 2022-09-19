package es.usantatecla.a4_numberingSystems.a0_digits.v1_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Dame un número entero: ");
    int remainder = number;
    int digits = 0;
    while (remainder > 0) {
      remainder -= remainder % 10;
      remainder /= 10;
      digits++;
    }
    if (digits == 0) {
      digits++;
    }
    console.writeln("El número " + number + " tiene " + digits + " digito" + (digits != 1 ? "s" : "") + ".");
  }

}
