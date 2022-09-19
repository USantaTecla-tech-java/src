package es.usantatecla.a4_numberingSystems.a4_decimalToBinary.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Dame un número inferior a 16: ");
        int firstRight = number & 1;
        number >>= 1;
        int secondRight = number & 1;
        number >>= 1;
        int thirdRight = number & 1;
        number >>= 1;
        int fourthRight = number & 1;
        console.writeln("Bits: "+firstRight+secondRight+thirdRight+fourthRight);
    }

}

