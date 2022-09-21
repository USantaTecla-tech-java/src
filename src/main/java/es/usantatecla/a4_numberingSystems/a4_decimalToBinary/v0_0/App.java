package es.usantatecla.a4_numberingSystems.a4_decimalToBinary.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Dame un número inferior a 16: ");
        int firstRight = number & 1;
        number = number >> 1;
        int secondRight = number & 1;
        number = number >> 1;
        int thirdRight = number & 1;
        number = number >> 1;
        int fourthRight = number & 1;
        console.writeln("Bits: " + fourthRight + thirdRight + secondRight + firstRight);
    }

}
