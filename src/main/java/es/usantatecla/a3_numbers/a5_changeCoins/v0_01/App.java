package es.usantatecla.a3_numbers.a5_changeCoins.v0_01;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int amount = console.readInt("Dame la cantidad de céntimos: ");

        int coins50 = amount / 50;
        amount = amount - coins50 * 50;

        int coins20 = amount / 20;
        amount = amount - coins20 * 20;

        int coins10 = amount / 10;
        amount = amount - coins10 * 10;

        int coins5 = amount / 5;
        amount = amount - coins5 * 5;

        int coins2 = amount / 2;
        amount = amount - coins2 * 2;

        console.writeln(coins50 + " moneda(s) de 50\n" +
                coins20 + " moneda(s) de 20\n" +
                coins10 + " moneda(s) de 10\n" +
                coins5 + " moneda(s) de 5\n" +
                coins2 + " moneda(s) de 2\n" +
                amount + " moneda(s) de 1\n");

    }
}
