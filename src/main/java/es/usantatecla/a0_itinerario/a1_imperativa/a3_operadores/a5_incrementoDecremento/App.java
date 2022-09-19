package es.usantatecla.a0_itinerario.a1_imperativa.a3_operadores.a5_incrementoDecremento;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int x= 100;
        console.writeln(x); // 100
        console.writeln(x++); // 100
        console.writeln(++x); // 102
        console.writeln(x--); // 102
        console.writeln(--x); // 100
        console.writeln(- -x); // 100
        console.writeln(+ +x); // 100
        console.writeln(++x*2); // 202
        console.writeln(++x*2); // 204
        console.writeln(x++*2); // 204
        console.writeln(x); // 103
    }
}