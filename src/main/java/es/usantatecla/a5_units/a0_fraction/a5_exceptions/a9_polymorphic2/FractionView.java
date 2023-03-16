package es.usantatecla.a5_units.a0_fraction.a5_exceptions.a9_polymorphic2;

public class FractionView {
  
  public Fraction read() {
    int numerator = Console.getInstance().readInt("Dame el numerador: ");
    int denominator;
    boolean ok;
    do {
      denominator = Console.getInstance().readInt("Dame el denominador: ");
      ok = denominator != 0;
    } while (!ok);
    return new Fraction(numerator, denominator);
  }

  
  public void write(Fraction fraction) {
    assert fraction != null;

    Console.getInstance().writeln(fraction.toString());
  }

  public void writeln(Fraction fraction) {
    assert fraction != null;
    
    this.write(fraction);
    Console.getInstance().writeln();
  }

}
