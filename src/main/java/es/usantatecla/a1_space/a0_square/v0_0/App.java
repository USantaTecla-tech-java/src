package es.usantatecla.a1_space.a0_square.v0_0;

import es.usantatecla.utils.Console;

public class App {

	public static void main(String[] args) {
		Console console = new Console();
        final float side = console.readFloat("Dame el lado del cuadrado: ");
        final int SIDES = 4;
        final float perimeter = side * SIDES;
        final float area = side * side;
        console.writeln("Perímetro: "+perimeter+"\nArea: "+area);
    }
}

