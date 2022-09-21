package es.usantatecla.a3_numbers.a3_even.v0_2;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Escribe un número? ");
        if (number % 2 == 0) //{
          console.writeln("El numero "+number+" es par");
        /*}*/ else //{
          console.writeln("El numero "+number+" es impar");
        //}
    }
}



