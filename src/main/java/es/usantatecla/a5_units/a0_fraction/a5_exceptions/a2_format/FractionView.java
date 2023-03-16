package es.usantatecla.a5_units.a0_fraction.a5_exceptions.a2_format;

public class FractionView {
  
  public Fraction read() {
    Console console = new Console();
    int numerator = console.readInt("Dame el numerador: ");
    int denominator;
    boolean ok;
    do {
      denominator = console.readInt("Dame el denominador: ");
      ok = denominator != 0;
    } while (!ok);
    return new Fraction(numerator, denominator);
  }

  
  public void write(Fraction fraction) {
    assert fraction != null;

    new Console().writeln(this.toString());
  }

  public void writeln(Fraction fraction) {
    assert fraction != null;
    
    this.write(fraction);
    new Console().writeln();
  }

}
