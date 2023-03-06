package es.usantatecla.a5_units.a0_fraction.a3_values;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    console.writeln(new Fraction(1,2).getValue());
    console.writeln(new Fraction(-1,2).getValue());
    console.writeln(new Fraction(-1,-2).getValue());
    console.writeln(new Fraction(1,-2).getValue());
    //console.writeln(new Fraction(1,0).getValue());
    console.writeln(new Fraction(0,1).getValue());
    // console.writeln(new Fraction(0,0).getValue());
    console.writeln(new Fraction().getValue());
    console.writeln(new Fraction(1).getValue());

    final int SIZE = 3;
    Fraction[] fractions = new Fraction[SIZE];
    FractionView fractionView = new FractionView();
    for (int i = 0; i < fractions.length; i++) {
      fractions[i] = fractionView.read();
    }
    for (int i = 0; i < fractions.length; i++) {
      console.writeln("Fracción: " + fractions[i] + " e inversa: " + fractions[i].reverse());
    }
    Fraction sum = new Fraction(0);
    Fraction product = new Fraction(1);
    for (int i = 0; i < fractions.length; i++) {
      sum = sum.add(fractions[i]);
      product = product.multiply(fractions[i]);
    }
    console.writeln("Suma: " + sum);
    console.writeln("Producto: " + product);
    for (int i = 0; i < fractions.length; i++) {
      console.writeln("Suma sin " + fractions[i] + ": " + sum.subtract(fractions[i]));
      console.writeln("Producto sin " + fractions[i] + ": " + sum.subtract(fractions[i]));
    }
  }
}
