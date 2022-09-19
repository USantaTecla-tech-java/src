package es.usantatecla.a0_time.a1_major.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int age = console.readInt("Qué años tienes? ");
        console.writeln((age >= 18 ? "Sí" : "No") + " eres mayor de edad");
    }

}
