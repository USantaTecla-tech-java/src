package es.usantatecla.a3_numbers.a2_percentage.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int percentage = console.readInt("Dame el tanto por ciento (sin %): ");
        console.writeln(percentage + "% = " + percentage + " x 1 / 100 = " 
                + percentage + " x 0.01 = " + percentage / 100);
        final int amount = console.readInt("Dame la cantidad: ");
        console.writeln(percentage + "% x " + amount + " = " + amount * percentage / 100);
    }
}
