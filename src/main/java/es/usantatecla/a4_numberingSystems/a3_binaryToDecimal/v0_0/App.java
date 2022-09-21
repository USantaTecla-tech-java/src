package es.usantatecla.a4_numberingSystems.a3_binaryToDecimal.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int binary = console.readInt("Dame un número inferior a 16 en binario (0/1): ");
        String msg = "El número " + binary + " binario corresponde con ";
        int decimal = 0;
        final int firstBit = binary % 10;
        decimal = decimal + firstBit;
        binary = binary - firstBit;
        binary = binary / 10;
        final int secondBit = binary % 10;
        decimal = decimal + secondBit * 2;
        binary = binary - secondBit;
        binary = binary / 10;
        final int thirdBit = binary % 10;
        decimal = decimal + thirdBit * 4;
        binary = binary - thirdBit;
        binary = binary / 10;
        final int fourthBit = binary;
        decimal = decimal + fourthBit * 8;
        binary = binary - fourthBit;
        msg = msg + "el número " + decimal + " decimal";
        console.writeln(msg);
    }

}
