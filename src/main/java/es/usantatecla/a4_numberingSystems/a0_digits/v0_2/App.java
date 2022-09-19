package es.usantatecla.a4_numberingSystems.a0_digits.v0_2;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Dame un número entero: ");
    String[] DIGITS = new String[] { "Unidades", "Decenas", "Centenas" };
    for (int i = 0; i < DIGITS.length; i++) {
      console.writeln(DIGITS[i] + ": " + (number % 10));
      number -= number % 10;
      number /= 10;
    }
  }

}
