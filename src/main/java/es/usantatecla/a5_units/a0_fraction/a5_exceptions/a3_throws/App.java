package es.usantatecla.a5_units.a0_fraction.a5_exceptions.a3_throws;

public class App {

  public static void main(String[] args) {
    Console.getInstance().writeln("Antes");
    new FractionView().writeln(new Fraction("2/a3"));
    Console.getInstance().writeln("Despues");
  }
  
}
