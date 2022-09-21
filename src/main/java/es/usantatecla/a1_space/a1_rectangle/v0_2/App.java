package es.usantatecla.a1_space.a1_rectangle.v0_2;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int width = console.readInt("Dame el ancho del rectangulo: ");
        final int height = console.readInt("Dame el alto del rectangulo: ");
        console.writeln("Perímetro: " + getPerimeter(width, height) + "\nÁrea: " + getPerimeter(width, height));
    }

    static int getPerimeter(int width, int height){
      return 2 * (width + height);
    }
    
    static int getArea(int width, int height){
      return width * height;
    }
}


  