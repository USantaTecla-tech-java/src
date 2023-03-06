package es.usantatecla.a5_units.a0_fraction.a3_asserts;

class Fraction {

  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    assert denominator != 0;

    this.simplified(numerator, denominator);
  }

  private void simplified(int numerator, int denominator) {
    if (denominator < 0) {
      numerator *= -1;
      denominator *= -1;
    }
    boolean negative = numerator < 0;
    if (negative) {
      numerator *= -1;
    }
    if (numerator == 0) {
      this.numerator = numerator;
      this.denominator = denominator;
    } else {
      int gcd = this.gcd(numerator, denominator);
      this.numerator = numerator / gcd;
      this.denominator = denominator / gcd;
    }
    if (negative){
      this.numerator *= -1;
    }
  }

  private int gcd(int x, int y) {
    assert x > 0;
    assert y > 0;

    if (x == y)
      return x;
    if (x > y)
      return gcd(x - y, y);
    return gcd(x, y - x);
  }

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction() {
    this(0);
  }

  public Fraction add(Fraction fraction) {
    assert fraction != null;

    return new Fraction(
        this.numerator * fraction.denominator + fraction.numerator * this.denominator,
        this.denominator * fraction.denominator);
  }

  public Fraction subtract(Fraction fraction) {
    assert fraction != null;

    return this.add(fraction.opposite());
  }

  public Fraction opposite() {
    return new Fraction(-this.numerator, this.denominator);
  }

  public Fraction multiply(Fraction fraction) {
    assert fraction != null;

    return new Fraction(
        this.numerator * fraction.numerator,
        this.denominator * fraction.denominator);
  }

  public Fraction divide(Fraction fraction) {
    assert fraction != null;

    return this.multiply(fraction.reverse());
  }

  public Fraction reverse() {
    return new Fraction(this.denominator, this.numerator);
  }

  public Fraction power(int exponent) {
    assert exponent >= 0;

    Fraction power = new Fraction(1);
    for (int i = 0; i < exponent; i++) {
      power = power.multiply(this);
    }
    return power;
  }

  public double getValue() {
    return (double) this.numerator / this.denominator;
  }

  public Fraction clone() {
    return new Fraction(this.numerator, this.denominator);
  }

  public void read() {
    Console console = new Console();
    int numerator = console.readInt("Dame el numerador: ");
    int denominator;
    boolean ok;
    do {
      denominator = console.readInt("Dame el denominador: ");
      ok = denominator == 0;
    } while (!ok);
    this.simplified(numerator, denominator);
  }

  public void write() {
    new Console().writeln(this.toString());
  }

  public String toString() {
    return this.numerator + "/" + this.denominator;
  }

  public void writeln() {
    this.write();
    new Console().writeln();
  }

}
