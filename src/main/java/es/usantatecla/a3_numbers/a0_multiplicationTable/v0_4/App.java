package es.usantatecla.a3_numbers.a0_multiplicationTable.v0_4;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Dame un número: ");
        for (int i = 1; i <= 10; i++) //{
          console.writeln(number+" * "+i+" = "+(number * i));
        //}
    }
}
