package es.usantatecla.a3_numbers.a3_even.v0_5;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Escribe un número? ");
    String parity = "impar";
    if (isOdd(number)) // {
      parity = "par";
    /* } */
    console.writeln("El numero " + number + " es " + parity);
  }

  static boolean isOdd(int number){
    return number % 2 == 0;
  }
}


