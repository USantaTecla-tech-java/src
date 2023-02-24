package es.usantatecla.a1_space.a2_triangle.v0_5;

class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int SIDES = 3;
    double[] sides = new double[SIDES];
    for (int i = 0; i < SIDES; i++) {
      sides[i] = console.readDouble("Dame el " + i + "º lado del triangulo: ");
    }

    String msg = "Los lados ";
    for (int i = 0; i < SIDES; i++) {
      msg += sides[i] + new String[] { ", ", " y ", " " }[i];
    }

    if (!isTriangle(sides)) {
      msg += "NO ";
    }
    msg += "forman un triangulo ";
    if (isTriangle(sides)) {
      msg += "de tipo " + getTriangleType(sides);
    }
    console.writeln(msg);
  }

  static boolean isTriangle(double[] sides) {
    return getGreater(sides) < getSum(sides) - getGreater(sides);
  }

  static double getGreater(double[] sides) {
    double greater = sides[0];
    for (int i = 1; i < sides.length; i++) {
      if (sides[i] > greater) {
        greater = sides[i];
      }
    }
    return greater;
  }

  static double getSum(double[] sides) {
    double sum = 0;
    for (int i = 0; i < sides.length; i++) {
      sum += sides[i];
    }
    return sum;
  }

  static String getTriangleType(double[] sides) {
    return new String[] { "escaleno", "isosceles", null, "equilatero" }[getPairs(sides)];
  }

  static int getPairs(double[] sides) {
    int pairs = 0;
    for (int i = 0; i < sides.length; i++) {
      for (int j = i + 1; j < sides.length; j++) {
        if (sides[i] == sides[j]) {
          pairs++;
        }
      }
    }
    return pairs;
  }

}
