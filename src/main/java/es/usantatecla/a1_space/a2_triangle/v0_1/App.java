package es.usantatecla.a1_space.a2_triangle.v0_1;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final float sideA = console.readFloat("Dame el 1º lado del triangulo: ");
    final float sideB = console.readFloat("Dame el 2º lado del triangulo: ");
    final float sideC = console.readFloat("Dame el 3º lado del triangulo: ");
    float greater;
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
      if (sideA == sideB) {
        if (sideA == sideC) {
          msg += " equilatero";
        } else {
          msg += " isosceles";
        }
      } else {
        if (sideB == sideC) {
          msg += " isosceles";
        } else {
          msg += " escaleno";
        }
      }
    }
    console.writeln(msg);
  }
}
