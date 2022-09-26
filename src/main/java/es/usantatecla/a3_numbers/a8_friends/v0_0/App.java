package es.usantatecla.a3_numbers.a8_friends.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int number1 = console.readInt("Dame un número: ");
    int sum1 = 0;
    for (int i = 1; i < number1; i++) {
      if (number1 % i == 0) {
        sum1 += i;
      }
    }
    final int number2 = console.readInt("Dame otro número: ");
    int sum2 = 0;
    for (int i = 1; i < number2; i++) {
      if (number2 % i == 0) {
        sum2 += i;
      }
    }
    console.writeln("Los números " + number1 + " y " + number2 + " "
        + (number1 == sum2 && number2 == sum1 ? "si" : "no") + " son amigos");
  }
}
