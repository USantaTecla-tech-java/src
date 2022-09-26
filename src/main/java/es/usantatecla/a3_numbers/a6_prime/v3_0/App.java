package es.usantatecla.a3_numbers.a6_prime.v3_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int amount = console.readInt("Dame un número positivo: ");
    for (int i = 1; i <= amount; i++) {
      console.writeln(printBlock(i));
    }
  }

  static String printBlock(int number) {
    String msg = "";
    if (number == 1) {
      msg += "U\n";
    } else if (isPrime(number)) {
      for (int i = 0; i < number; i++) {
        msg += "P";
      }
      msg += "\n";
    } else {
      int divisor = 2;
      while (number % divisor != 0) {
        divisor++;
      }
      for (int i = 0; i < divisor; i++) {
        for (int j = 0; j < number / divisor; j++) {
          msg += "C";
        }
        msg += "\n";
      }
    }
    return msg;
  }

  static boolean isPrime(int number) {
    boolean result = false;
    if (number >= 2) {
      int next = 2;
      while (number % next != 0) {
        next++;
      }
      result = number == next;
    }
    return result;
  }

}
