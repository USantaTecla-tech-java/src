package es.usantatecla.a4_numberingSystems.a4_decimalToBinary.v1_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Dame un número inferior a 16: ");
    String binary = "";
    for (int i = 0; i < 32; i++) {
      binary = (number & 1) + binary;
      if ((i + 1) % 4 == 0) {
        binary = " " + binary;
      }
      number >>= 1;
    }
    console.writeln("Formato binario: " + binary);
  }

}
