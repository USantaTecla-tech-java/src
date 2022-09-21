package es.usantatecla.a3_numbers.a4_absoluteValue.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Escribe un número? ");
        final int absolute = (number < 0 ? -1 : 1) * number;
        console.writeln("El valor absoluto del número " + number + " es " + absolute);
    }
}
