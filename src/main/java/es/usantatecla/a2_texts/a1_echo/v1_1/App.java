package es.usantatecla.a2_texts.a1_echo.v1_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final String msg = console.readString("Hay triple eco!!! Escribe algo:");
        String echo = msg + ", " + msg + ", " + msg + "!!!\n";
        echo = msg + ", " + msg + "!!!\n";
        echo = msg + "!!!\n";
        console.writeln(echo);
    }
}
