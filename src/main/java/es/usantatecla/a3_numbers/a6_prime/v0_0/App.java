package es.usantatecla.a3_numbers.a6_prime.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
        Console console = new Console();
        final int number = console.readInt("Dame un número positivo: ");
        boolean isPrime = false;
        if (number >= 2) {
          int next = 2;
          while (number % next != 0) {
            next++;
          }
          isPrime = number == next;
        }
        console.writeln("El número "+number+" "+(isPrime ? "si" : "no")+" es primo");
    }
}
