package es.usantatecla.a3_numbers.a6_prime.v1_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int amount = console.readInt("Dame un número positivo: ");
    int sum = 0;
    for (int i = 1; i <= amount; i++) {
      boolean isPrime = false;
      if (i >= 2) {
        int next = 2;
        while (i % next != 0) {
          next++;
        }
        isPrime = i == next;
      }
      if (isPrime) {
        sum += i;
      }
    }
    console.writeln("La suma de los primos en los primeros " + amount + " números es " + sum);
  }
}
