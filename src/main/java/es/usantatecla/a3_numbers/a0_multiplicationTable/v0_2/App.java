package es.usantatecla.a3_numbers.a0_multiplicationTable.v0_2;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Dame un número: ");
        int times = 0;
        while (times < 10) {
          console.writeln(number+" * "+times+" = "+(number * times));
          times++;
        }
    }
}

