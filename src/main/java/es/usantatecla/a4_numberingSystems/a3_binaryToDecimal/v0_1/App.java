package es.usantatecla.a4_numberingSystems.a3_binaryToDecimal.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int binary = console.readInt("Dame un número inferior a 16 en binario (0/1): ");
        String msg = "El número " + binary + " binario corresponde con ";
        int decimal = 0;
        final int firstBit = binary % 10;
        decimal += firstBit;
        binary -= firstBit;
        binary /= 10;
        final int secondBit = binary % 10;
        decimal += secondBit * 2;
        binary -= secondBit;
        binary /= 10;
        final int thirdBit = binary % 10;
        decimal += thirdBit * 4;
        binary -= thirdBit;
        binary /= 10;
        final int fourthBit = binary;
        decimal += fourthBit * 8;
        binary -= fourthBit;
        msg += "el número " + decimal + " decimal";
        console.writeln(msg);
    }

}
