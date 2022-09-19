package es.usantatecla.a0_itinerario.a1_imperativa.a1_tipos.a3_boolean.a3_binarios;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln(false && false); // false
        console.writeln(false && true); // false
        console.writeln(true && false); // false
        console.writeln(true && true); // true
        console.writeln(false || false); // false
        console.writeln(false || true); // true
        console.writeln(true || false); // true
        console.writeln(true || true); // true
    }
}
