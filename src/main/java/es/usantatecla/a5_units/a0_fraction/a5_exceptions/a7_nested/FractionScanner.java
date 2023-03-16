package es.usantatecla.a5_units.a0_fraction.a5_exceptions.a7_nested;

import java.util.Scanner;
import java.util.regex.Pattern;

class FractionScanner {
  
  private final Scanner scanner;

  FractionScanner(String string) throws NumberFormatException {
    if (!Pattern.matches(" *(\\d+) */ *(\\d+) *", string))
        throw new NumberFormatException("Formato incorrecto");
    this.scanner = new Scanner(string);
  }

  int getNumerator(){
    int numerator = scanner.nextInt();
    scanner.close();
    return numerator;
  }

  int getDenominator(){
    scanner.nextInt();
    scanner.next();
    int denominator = scanner.nextInt();
    scanner.close();
    return denominator;
  }
}
