package es.usantatecla.a3_numbers.a2_percentage.v1_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int percentage = console.readInt("Dame el tanto por ciento (sin %): ");
        console.writeln(percentage + "% = " + percentage + " x 1 / 100 = " 
                + percentage + " x 0.01 = " + percentage / 100);
        int amount;
        do {
          amount = console.readInt("Dame la cantidad (0 para terminar): ");
          if (amount != 0){
            console.writeln(percentage + "% x " + amount + " = " + amount * percentage / 100);
          }
        } while (amount != 0);
        
    }
}

