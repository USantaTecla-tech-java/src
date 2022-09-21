package es.usantatecla.a0_time.a2_sibilings.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int age = console.readInt("Dame tu edad: ");
        console.writeln('E' 
            + (age == 0 ? "" : "l año pasado tenías " + (age - 1) + " año" + (age - 1 != 1 ? "s" : "") + "y e") 
            + "l año que viene tendrás " + (age + 1) + " año" + (age + 1 != 1 ? "s" : ""));
    }
}
