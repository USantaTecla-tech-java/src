package es.usantatecla.a0_itinerario.a2_estructurada.a2_iterativa;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int x = 3;
        while (x > 0)
            x--;
        console.writeln(x); // 0

        do {
            x++;
        } while (x < 3);
        console.writeln(x); // 3

        for (int i = 0, j = 9; i < j; i++, j--)
            console.writeln(i + " - " + j); // 0 - 9 / 1 - 8 / 2 - 7 / 3 - 6 / 4 - 5
    }
}
