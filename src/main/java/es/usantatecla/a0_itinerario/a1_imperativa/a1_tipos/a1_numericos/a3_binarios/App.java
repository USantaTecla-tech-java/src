package es.usantatecla.a0_itinerario.a1_imperativa.a1_tipos.a1_numericos.a3_binarios;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();

        console.writeln(4 + 5); // 9
        console.writeln(4 - 5); // -1
        console.writeln(4 * 5); // 20
        console.writeln(4 / 5); // 0.8
        console.writeln(4 % 5); // 4

        //console.writeln(4 / 0); // Exception
        //console.writeln(4 % 0); // Exception

        console.writeln(0.1e-7 + 1e7); // 1.000000000000001E7
        console.writeln(0.1e-8 + 1e8); // 1.0E8
        console.writeln(0.1 + 0.2); // 0.30000000000000004
    }

}
