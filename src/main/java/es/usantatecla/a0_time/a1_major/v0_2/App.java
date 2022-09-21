package es.usantatecla.a0_time.a1_major.v0_2;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int age = console.readInt("Qué años tienes? ");
        console.writeln((isAdult(age) ? "Sí" : "No") + " eres mayor de edad");
    }

    static private boolean isAdult(int age){
      final int AGE_MAJORITY = 18;
      return age > AGE_MAJORITY;
    }

}
