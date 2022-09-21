package es.usantatecla.a1_space.a3_circle.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final double radio = console.readInt("Dame el radio del círculo: ");
        final double PI = (float) 3.141592;
        console.writeln("Perímetro: " + (2 * PI * radio) + "\nÁrea: " + (PI * radio * radio));
    }
}
