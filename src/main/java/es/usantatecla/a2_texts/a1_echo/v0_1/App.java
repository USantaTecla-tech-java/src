package es.usantatecla.a2_texts.a1_echo.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        String msg = console.readString("Hay eco!!! Escribe algo: ");
        console.writeln(msg+"!!!");
    }
}

