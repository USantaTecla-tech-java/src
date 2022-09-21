package es.usantatecla.a0_itinerario.a1_imperativa.a3_operadores.a2_conversion;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        byte id1 = 127;
        console.writeln(id1); // 127
        id1 = (byte) 128;
        console.writeln(id1); // -128
        short id2 = id1;
        console.writeln(id2); // -128
        int units = 13;
        console.writeln(units/2); // 6
        console.writeln((float) units/2); // 6.5
    }
}