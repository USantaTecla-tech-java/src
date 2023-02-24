package es.usantatecla.a1_space.a0_square.v0_1;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        final double side = console.readDouble("Dame el lado del cuadrado: ");
        final int SIDES = 4;
        console.writeln("Perímetro: " + (side * SIDES) + "\nArea: " + (side * side));
    }
}
