package es.usantatecla.a5_units.a0_fraction.a5_exceptions.a5_catchsFirst;

public class App {

  public static void main(String[] args) {
    Console.getInstance().writeln("Inicio");
    try {
      Console.getInstance().writeln("Antes");
      new FractionView().writeln(new Fraction("3/0"));
      Console.getInstance().writeln("Después");
    } catch (ArithmeticException ex) {
      Console.getInstance().writeln("Error aritmetico");
      ex.printStackTrace();
    } catch (NumberFormatException ex) {
      Console.getInstance().writeln("Error de formato");
      ex.printStackTrace();
    }
    Console.getInstance().writeln("Fin");
  }

}
