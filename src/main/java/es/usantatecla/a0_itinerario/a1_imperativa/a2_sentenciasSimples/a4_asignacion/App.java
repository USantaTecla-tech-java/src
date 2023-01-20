package es.usantatecla.a0_itinerario.a1_imperativa.a2_sentenciasSimples.a4_asignacion;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int x;
        int y;
        int z = -1;
        x = y = z;
        console.writeln(x); // -1
        x = 0;
        console.writeln(x); // 0
        x = x + 1;
        console.writeln(x); // 1
    }
}
