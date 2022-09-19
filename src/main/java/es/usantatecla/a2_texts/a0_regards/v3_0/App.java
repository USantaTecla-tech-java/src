package es.usantatecla.a2_texts.a0_regards.v3_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln("Hola, "+console.readString("Como te llamas?")+"!!! :-)");
    }
}
