package es.usantatecla.a1_space.a2_triangle.v0_2;

class App {

  public static void main(String[] args) {
    Console console = new Console();
    final double sideA = console.readDouble("Dame el 1º lado del triangulo: ");
    final double sideB = console.readDouble("Dame el 2º lado del triangulo: ");
    final double sideC = console.readDouble("Dame el 3º lado del triangulo: ");
    double greater;
    if (sideA >= sideB && sideA >= sideC) {
      greater = sideA;
    } else if (sideB >= sideA && sideB >= sideC) {
      greater = sideB;
    } else {
      greater = sideC;
    }
    String msg = "Los lados " + sideA + ", " + sideB + " y " + sideC + " ";
    final boolean isTriangle = greater < (sideA + sideB + sideC) - greater;
    if (!isTriangle) {
      msg += "NO ";
    }
    msg += "forman un triangulo";
    if (isTriangle) {
      msg += " de tipo";
      if (sideA == sideB && sideB == sideC) {
        msg += " equilatero";
      } else if (sideA == sideB || sideB == sideC || sideC == sideA) {
        msg += " isosceles";
      } else {
        msg += " escaleno";
      }
    }
    console.writeln(msg);
  }
}
