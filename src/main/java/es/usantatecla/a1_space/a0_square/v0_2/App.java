package es.usantatecla.a1_space.a0_square.v0_2;

class App {

  public static void main(String[] args) {
    Console console = new Console();
    final double side = console.readDouble("Dame el lado del cuadrado: ");
    console.writeln("Perímetro: " + getPerimeter(side) + "\nArea: " + getArea(side));
  }

  static double getPerimeter(double side) {
    final int SIDES = 4;
    return side * SIDES;
  }

  static double getArea(double side) {
    return side * side;
  }

}
