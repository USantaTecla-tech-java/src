package es.usantatecla.a3_numbers.a5_changeCoins.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int amount = console.readInt("Dame la cantidad de céntimos: ");

        final int remainder50 = amount % 50;
        final int amount50 = amount - remainder50;
        final int coins50 = amount50 / 50;

        amount = amount - amount50;
        final int remainder20 = amount % 20;
        final int amount20 = amount - remainder20;
        final int coins20 = amount20 / 20;

        amount = amount - amount20;
        final int remainder10 = amount % 10;
        final int amount10 = amount - remainder10;
        final int coins10 = amount10 / 10;

        amount = amount - amount10;
        final int remainder5 = amount % 5;
        final int amount5 = amount - remainder5;
        final int coins5 = amount5 / 5;

        amount = amount - amount5;
        final int remainder2 = amount % 2;
        final int amount2 = amount - remainder2;
        final int coins2 = amount2 / 2;

        amount = amount - amount2;
        console.writeln(coins50 + " moneda(s) de 50" +
                coins20 + " moneda(s) de 20" +
                coins10 + " moneda(s) de 10" +
                coins5 + " moneda(s) de 5" +
                coins2 + " moneda(s) de 2" +
                amount + " moneda(s) de 1");

    }
}
