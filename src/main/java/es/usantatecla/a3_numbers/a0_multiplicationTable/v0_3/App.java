package es.usantatecla.a3_numbers.a0_multiplicationTable.v0_3;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Dame un número: ");
        int times = 0;
        do {
          times++;
          console.writeln(number+" * "+times+" = "+(number * times));
        } while (times < 10);
    }
}
