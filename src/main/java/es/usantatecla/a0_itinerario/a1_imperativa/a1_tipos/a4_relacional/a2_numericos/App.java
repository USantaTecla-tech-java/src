package es.usantatecla.a0_itinerario.a1_imperativa.a1_tipos.a4_relacional.a2_numericos;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln(5 == 5);  // true
        console.writeln(5 != 6); // true
        console.writeln(5 < 6); // true
        console.writeln(5 <= 5); // true
        console.writeln(5 > 4); // true
        console.writeln(5 >= 5); // true
    }
}
