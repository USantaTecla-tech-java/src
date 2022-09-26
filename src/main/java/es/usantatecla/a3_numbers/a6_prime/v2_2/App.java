package es.usantatecla.a3_numbers.a6_prime.v2_2;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int amount = console.readInt("Dame un número positivo: ");
    console.writeln("La suma de los primeros " + amount + " números primos es " + sumFirstPrimes(amount));
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

  static int sumFirstPrimes(int amount) {
    int sum = 0;
    int number = 1;
    for (int i = 0; i < amount; i++) {
      while (!isPrime(number)) {
        number++;
      }
      sum += number;
      number++;
    }
    return sum;
  }

}


