package es.usantatecla.a3_numbers.a9_factorial.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int number = console.readInt("Dame un número (0-20): ");
        console.writeln("El factorial de " + number + " es " + factorial(number));
    }

    static int factorial(int number){
      int result = 1;
      for (int i = 1; i <= number; i++) {
        result *= i;
      }
      return result;  
    }

}


