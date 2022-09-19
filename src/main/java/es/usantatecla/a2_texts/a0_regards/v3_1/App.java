package es.usantatecla.a2_texts.a0_regards.v3_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        String name = console.readString("Como te llamas?");
        console.writeln("Hola, "+name+"!!! :-)");
    }
}

