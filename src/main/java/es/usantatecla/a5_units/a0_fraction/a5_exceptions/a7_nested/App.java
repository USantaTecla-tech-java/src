package es.usantatecla.a5_units.a0_fraction.a5_exceptions.a7_nested;

public class App {

  public static void main(String[] args) {
    Console.getInstance().writeln("Inicio");
    try {
      Console.getInstance().writeln("Antes");
      new FractionView().writeln(App.createFraction(3, 0));
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

  public static Fraction createFraction(int numerator, int denominator) throws ArithmeticException {
    return new Fraction(numerator, denominator);
  }

}
