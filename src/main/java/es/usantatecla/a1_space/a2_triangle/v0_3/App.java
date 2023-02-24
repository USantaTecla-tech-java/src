package es.usantatecla.a1_space.a2_triangle.v0_3;

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
    double greater = sides[0];
    double sum = sides[0];
    for (int i = 1; i < SIDES; i++) {
      sum += sides[i];
      if (sides[i] > greater) {
        greater = sides[i];
      }
    }
    final boolean isTriangle = greater < sum - greater;
    if (!isTriangle) {
      msg += "NO ";
    }
    msg += "forman un triangulo ";
    if (isTriangle) {
      msg += "de tipo ";
      int pairs = 0;
      for (int i = 0; i < SIDES; i++) {
        for (int j = i + 1; j < SIDES; j++) {
          if (sides[i] == sides[j]) {
            pairs++;
          }
        }
      }
      msg += new String[] { "escaleno", "isosceles", "", "equilatero" }[pairs];
    }
    console.writeln(msg);
  }
}
