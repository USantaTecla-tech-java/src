package es.usantatecla.a0_itinerario.a1_imperativa.a2_sentenciasSimples.a2_entrada;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln("El siguiente es " + console.readInt("Dame un número: ") + 1);
    }
}
