package es.usantatecla.a1_space.a3_circle.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final double radio = console.readInt("Dame el radio del círculo: ");
        final double PI = (float) 3.141592;
        final double perimeter = 2 * PI * radio;
        final double area = PI * radio * radio;
        console.writeln("Perímetro: " + perimeter + "\nÁrea: " + area);
    }
}
