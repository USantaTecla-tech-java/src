package es.usantatecla.a3_numbers.a6_prime.v1_1;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int amount = console.readInt("Dame un número positivo: ");
    console.writeln("La suma de los primos en los primeros " + amount + " números es " + sumPrimes(amount));
  }

  static int sumPrimes(int amount){
    int sum = 0;
    for (int i = 1; i <= amount; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }
    return sum;
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


