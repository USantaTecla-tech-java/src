package es.usantatecla.a3_numbers.a1_integerDivision.v0_05;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int dividend = console.readInt("Dame el dividendo entero: ");
        final int divider = console.readInt("Dame el divisor entero: ");
        final int remainder = dividend % divider;
        console.writeln(dividend + " / " + divider + " = " +
                ((dividend - remainder) / divider) + " y sobran " + remainder);
    }
}