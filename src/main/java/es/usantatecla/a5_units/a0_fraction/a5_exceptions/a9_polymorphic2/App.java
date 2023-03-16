package es.usantatecla.a5_units.a0_fraction.a5_exceptions.a9_polymorphic2;

public class App {

  public static void main(String[] args) {
    Console.getInstance().writeln("Inicio");
    try {
      Console.getInstance().writeln("Antes");
      new FractionView().writeln(App.createFraction("3/a2"));
      Console.getInstance().writeln("Después");
    } catch (ArithmeticException ex) {
      Console.getInstance().writeln("Error aritmetico");
      ex.printStackTrace();
    } catch (Exception ex) {
      Console.getInstance().writeln("Error");
      ex.printStackTrace();
    }
    Console.getInstance().writeln("Fin");
  }

  public static Fraction createFraction(String string) throws ArithmeticException, NumberFormatException {
    return new Fraction(string);
  }

}
