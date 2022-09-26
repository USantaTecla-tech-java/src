package es.usantatecla.a3_numbers.a8_friends.v0_1;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int number1 = console.readInt("Dame un número: ");
    final int number2 = console.readInt("Dame otro número: ");
    console.writeln("Los números " + number1 + " y " + number2 + " "
        + (areFriends(number1, number2) ? "si" : "no") + " son amigos");
  }

  static boolean areFriends(int number1, int number2) {
    return number1 == sumDivisors(number2)
        && number2 == sumDivisors(number1);
  }

  static int sumDivisors(int number) {
    int result = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        result += i;
      }
    }
    return result;
  }
}
