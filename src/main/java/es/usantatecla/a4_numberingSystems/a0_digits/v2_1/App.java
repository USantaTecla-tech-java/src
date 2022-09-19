package es.usantatecla.a4_numberingSystems.a0_digits.v2_1;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Dame un número entero: ");
    console.writeln("El número " + number + " " + (isPalindrome(number) ? "sí" : "no") + " es palidromo.");
  }

  static int getInverse(int number) {
    int inverse = 0;
    do {
      inverse *= 10;
      inverse += number % 10;
      number -= number % 10;
      number /= 10;
    } while (number > 0);
    return inverse;
  }

  static boolean isPalindrome(int number) {
    return number == getInverse(number);
  }

}
