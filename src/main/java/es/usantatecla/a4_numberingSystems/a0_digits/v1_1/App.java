package es.usantatecla.a4_numberingSystems.a0_digits.v1_1;

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
    console.writeln("El número " + number + " tiene " + getLength(number) + " digito" + (getLength(number) != 1 ? "s" : "") + ".");
  }

  static int getLength(int number) {
    if (number == 0) {
      return 1;
    }
    int digits = 0;
    while (number > 0) {
      number -= number % 10;
      number /= 10;
      digits++;
    }
    return digits;
  }

}
