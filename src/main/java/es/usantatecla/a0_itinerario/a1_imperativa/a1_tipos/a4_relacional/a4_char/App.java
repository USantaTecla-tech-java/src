package es.usantatecla.a0_itinerario.a1_imperativa.a1_tipos.a4_relacional.a4_char;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();

        console.writeln('c' == 'c'); // true
        console.writeln('c' != 'C'); // true
        console.writeln(' ' != '\n'); // true        
    }
}
