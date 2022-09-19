package es.usantatecla.a2_texts.a1_echo.v0_2;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final String msg = console.readString("Hay eco!!! Escribe algo: ");
        console.writeln(msg+"!!!");
    }
}

