package es.usantatecla.a4_numberingSystems.a0_digits.v0_4;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Dame un número entero: ");
    String[] DIGITS = new String[] { "Unidades", "Decenas", "Centenas" };
    for (int i = 0; i < DIGITS.length; i++) {
      console.writeln(DIGITS[i] + ": " + getRightDigit(number, i));
    }
  }

  static int getRightDigit(int number, int position) {
    if (position == 0) {
      return number % 10;
    }
    return getRightDigit((number - number % 10) / 10, position - 1);
  }

}
