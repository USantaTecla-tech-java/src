package es.usantatecla.a0_itinerario.a7_parametrized.a1_multimap;

class Fraction {

  private final int numerator;
  private final int denominator;

  public Fraction(int numerator, int denominator) {
    assert denominator != 0;

    if (denominator < 0) {
      numerator *= -1;
      denominator *= -1;
    }
    if (numerator != 0) {
      int gcd = this.gcd(numerator > 0 ? numerator : -numerator, denominator);
      numerator = numerator / gcd;
      denominator = denominator / gcd;
    }
    this.numerator = numerator;
    this.denominator = denominator;
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

  public int getNumerator() {
    return this.numerator;
  }

  public int getDenominator() {
    return this.denominator;
  }

  public double getValue() {
    return (double) this.numerator / this.denominator;
  }

  public Fraction clone() {
    return new Fraction(this.numerator, this.denominator);
  }

  public String toString() {
    return this.numerator + "/" + this.denominator;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + numerator;
    result = prime * result + denominator;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fraction other = (Fraction) obj;
    if (numerator != other.numerator)
      return false;
    if (denominator != other.denominator)
      return false;
    return true;
  }

}
