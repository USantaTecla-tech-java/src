package es.usantatecla.a1_space.a1_rectangle.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int width = console.readInt("Dame el ancho del rectangulo: ");
        final int height = console.readInt("Dame el alto del rectangulo: ");
        final int perimeter = 2 * (width + height);
        final int area = width * height;
        console.writeln("Perímetro: " + perimeter + "\nÁrea: " + area);
    }
}
