package es.usantatecla.a3_numbers.a0_multiplicationTable.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Dame un número: ");
        console.writeln(number+" * 1 = "+(number * 1));
        console.writeln(number+" * 2 = "+(number * 2));
        console.writeln(number+" * 3 = "+(number * 3));
        console.writeln(number+" * 4 = "+(number * 4));
        console.writeln(number+" * 5 = "+(number * 5));
        console.writeln(number+" * 6 = "+(number * 6));
        console.writeln(number+" * 7 = "+(number * 7));
        console.writeln(number+" * 8 = "+(number * 8));
        console.writeln(number+" * 9 = "+(number * 9));
        console.writeln(number+" * 10 = "+(number * 10));
    }
}

