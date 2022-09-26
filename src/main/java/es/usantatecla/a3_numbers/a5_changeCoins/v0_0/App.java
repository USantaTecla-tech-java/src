package es.usantatecla.a3_numbers.a5_changeCoins.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int amount = console.readInt("Dame la cantidad de céntimos: ");

        int remainder50 = amount % 50;
        int amount50 = amount - remainder50;
        int coins50 = amount50 / 50;
        
        amount = amount - amount50;
        int remainder20 = amount % 20;
        int amount20 = amount - remainder20;
        int coins20 = amount20 / 20;
        
        amount = amount - amount20;
        int remainder10 = amount % 10;
        int amount10 = amount - remainder10;
        int coins10 = amount10 / 10;
        
        amount = amount - amount10;
        int remainder5 = amount % 5;
        int amount5 = amount - remainder5;
        int coins5 = amount5 / 5;
        
        amount = amount - amount5;
        int remainder2 = amount % 2;
        int amount2 = amount - remainder2;
        int coins2 = amount2 / 2;
        
        amount = amount - amount2;
        console.writeln(coins50+" moneda(s) de 50"+
        coins20+" moneda(s) de 20"+ 
        coins10+" moneda(s) de 10"+ 
        coins5+" moneda(s) de 5"+
        coins2+" moneda(s) de 2"+
        amount+" moneda(s) de 1");
        
    }
}


