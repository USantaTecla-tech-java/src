package es.usantatecla.a3_numbers.a8_friends.v1_1;

import es.usantatecla.utils.Console;

class App {
  public static void main(String[] args) {
    Console console = new Console();
    int amount = console.readInt("Dame un número: ");
    for (int i = 1; i <= amount; i++) {
      if (i != sumDivisors(i) && areFriends(i, sumDivisors(i))) {
        console.writeln("Los números " + i + " y " + sumDivisors(i) + " son amigos");
      }
    }

  }

  static boolean areFriends(int number1, int number2) {
    return number1 == sumDivisors(number2)
        && number2 == sumDivisors(number1);
  }

  static int sumDivisors(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
