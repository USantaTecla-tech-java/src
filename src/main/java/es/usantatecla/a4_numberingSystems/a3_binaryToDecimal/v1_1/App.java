package es.usantatecla.a4_numberingSystems.a3_binaryToDecimal.v1_1;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int binary = console.readInt("Dame un número inferior a 16 en binario (0/1): ");
    
    console.writeln("El número " + binary + " binario corresponde con el número " + binaryToDecimal(binary) + " decimal");
  }

  static int binaryToDecimal(int binary){
    int decimal = 0;
    int power = 1;
    do {
      int bit = binary % 10;
      decimal += bit * power;
      binary = (binary - bit) / 10;
      power = power * 2;
    } while (binary > 0);
    return decimal;
  }

}

