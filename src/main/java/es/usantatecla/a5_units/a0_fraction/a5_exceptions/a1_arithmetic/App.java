package es.usantatecla.a5_units.a0_fraction.a5_exceptions.a1_arithmetic;

public class App {

  public static void main(String[] args) {
    Console.getInstance().writeln("Antes");
    new FractionView().writeln(new Fraction(3, 0));
    Console.getInstance().writeln("Despues");
  }
}
