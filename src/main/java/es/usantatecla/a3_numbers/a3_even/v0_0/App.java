package es.usantatecla.a3_numbers.a3_even.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Escribe un número? ");
        final int remainder = number % 2;
        console.writeln("El numero " + number + " es " + (remainder == 0 ? "par" : "impar"));
    }
}
