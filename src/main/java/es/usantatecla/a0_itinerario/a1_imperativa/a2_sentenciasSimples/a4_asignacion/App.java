package es.usantatecla.a0_itinerario.a1_imperativa.a2_sentenciasSimples.a4_asignacion;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        byte byteVariable = 1;
        short shortVariable = 2;
        int intVariable = 3;
        long longVariable = 4;
        //float floatVariable = 0.1;
        double doubleVariable  = 0.01;
        char character = ' ';
        boolean  logic = true;
        int x;
        int y;
        int z = -1;
        x = y = z;
        console.writeln(x); // -1
    }
}
