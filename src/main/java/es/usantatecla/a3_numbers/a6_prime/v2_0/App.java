package es.usantatecla.a3_numbers.a6_prime.v2_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int amount = console.readInt("Dame un número positivo: ");
    int sum = 0;
    int number = 1;
    int primes = 0;
    do {
      boolean isPrime = false;
      if (number >= 2) {
        int next = 2;
        while (number % next != 0) {
          next++;
        }
        isPrime = number == next;
      }
      if (isPrime) {
        sum += number;
        primes++;
      }
      number++;
    } while (primes < amount);
    console.writeln("La suma de los primeros " + amount + " números primos es " + sum);
  }
}

