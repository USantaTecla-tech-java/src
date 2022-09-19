package es.usantatecla.a2_texts.a1_echo.v1_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final String msg = console.readString("Hay triple eco!!! Escribe algo: ");
        console.writeln(msg+", "+msg+", "+msg+"!!!");
        console.writeln(msg+", "+msg+"!!!");
        console.writeln(msg+"!!!");
    }
}

