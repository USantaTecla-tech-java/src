package es.usantatecla.a5_units.a0_fraction.a1_classes;

class Fraction {

  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    int gcd = this.gcd(numerator, denominator);
    this.numerator = numerator / gcd;
    this.denominator = denominator / gcd;
    if (this.denominator < 0) {
      this.numerator *= -1;
      this.denominator *= -1;
    }
  }

  private int gcd(int x, int y) {
    if (x == y)
      return x;
    if (x > y)
      return this.gcd(x - y, y);
    return this.gcd(x, y - x);
  }

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction() {
    this(0);
  }

  public Fraction add(Fraction fraction) {
    return new Fraction(
        this.numerator * fraction.denominator + fraction.numerator * this.denominator,
        this.denominator * fraction.denominator);
  }

  public Fraction subtract(Fraction fraction) {
    return this.add(fraction.opposite());
  }

  public Fraction opposite() {
    return new Fraction(-this.numerator, this.denominator);
  }

  public Fraction multiply(Fraction fraction) {
    return new Fraction(
        this.numerator * fraction.numerator,
        this.denominator * fraction.denominator);
  }

  public Fraction divide(Fraction fraction) {
    return this.multiply(fraction.reverse());
  }

  public Fraction reverse() {
    return new Fraction(this.denominator, this.numerator);
  }

  public Fraction power(int exponent) {
    Fraction power = new Fraction(1);
    for (int i = 0; i < exponent; i++) {
      power = power.multiply(this);
    }
    return power;
  }

  public Fraction clone() {
    return new Fraction(this.numerator, this.denominator);
  }

  public void read() {
    Console console = new Console();
    this.numerator = console.readInt("Dame el numerador");
    this.denominator = console.readInt("Dame el denominador");
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
