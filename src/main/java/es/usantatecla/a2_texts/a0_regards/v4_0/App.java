package es.usantatecla.a2_texts.a0_regards.v4_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        String name = console.readString("Como te llamas?");
        console.writeln("Hola, "+name+"!!! :-)");
        console.writeln("Adios, "+name+"!!! :-)");
    }
}

