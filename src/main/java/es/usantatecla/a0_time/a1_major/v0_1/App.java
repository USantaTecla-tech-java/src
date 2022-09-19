package es.usantatecla.a0_time.a1_major.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int age = console.readInt("Qué años tienes? ");
        final int AGE_MAJORITY = 18;
        final boolean isAdult = age >= AGE_MAJORITY;
        console.writeln((isAdult ? "Sí" : "No") + " eres mayor de edad");
    }

}
