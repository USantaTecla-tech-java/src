package es.usantatecla.a0_time.a2_sibilings.v0_2;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int age = console.readInt("Dame tu edad: ");
        int previous = age - 1;
        int next = age + 1;
        String preffix = "E";
        if (age == 0){
          preffix = preffix + "l año pasado tenías " + previous + " año" + (previous != 1 ? "s" : "") + "y e";
        }  
        console.writeln(preffix + "l año que viene tendrás " + next + " año" + (next != 1 ? "s" : ""));
    }
}

