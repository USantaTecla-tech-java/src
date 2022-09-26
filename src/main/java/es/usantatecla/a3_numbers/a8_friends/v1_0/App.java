package es.usantatecla.a3_numbers.a8_friends.v1_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int amount = console.readInt("Dame un número: ");
    for (int i = 1; i <= amount; i++) {
      int sum = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          sum += j;
        }
      }
      int sum2 = 0;
      if (sum != i && sum < amount) {
        for (int j = 1; j < sum; j++) {
          if (sum % j == 0) {
            sum2 += j;
          }
        }
      }
      if (sum2 == i) {
        console.writeln("Los números " + i + " y " + sum + " son amigos");
      }
    }
  }
}
