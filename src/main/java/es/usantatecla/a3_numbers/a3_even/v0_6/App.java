package es.usantatecla.a3_numbers.a3_even.v0_6;

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
    if (number == 0) {
      return true;
    }
    if (number == 1) {
      return false;
    }
    return isEven(number - 1);
  }

  static boolean isEven(int number){
    if (number == 0) {
      return false;
    }
    if (number == 1) {
      return true;
    }
    return isOdd(number - 1);
  }
}

