package es.usantatecla.a1_space.a0_square.v0_2;

import es.usantatecla.utils.Console;

public class App {

	public static void main(String[] args) {
		Console console = new Console();
        final float side = console.readFloat("Dame el lado del cuadrado: ");
        console.writeln("Perímetro: "+getPerimeter(side)+"\nArea: "+getArea(side));
    }

    static float getPerimeter(float side){
      final int SIDES = 4;
      return side * SIDES;
    }
    
    static float getArea(float side){
      return side * side;
    }
    
}

