package es.usantatecla.a0_itinerario.a1_imperativa.a2_sentenciasSimples.a5_constante;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final String CONSTANT = "constante";
        console.writeln("Esto es " + CONSTANT + "!!!"); // Esto es constante
        // CONSTANT = "mutacion"; Error!!!
    }
}
