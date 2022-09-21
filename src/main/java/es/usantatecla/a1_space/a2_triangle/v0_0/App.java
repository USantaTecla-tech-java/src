package es.usantatecla.a1_space.a2_triangle.v0_0;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int sideA = console.readInt("Dame el 1º lado del triangulo: ");
        int total = sideA;
        int greater = sideA;
        final int sideB = console.readInt("Dame el 2º lado del triangulo: ");
        total += sideB;
        greater = greater > sideB ? greater : sideB;
        final int sideC = console.readInt("Dame el 3º lado del triangulo: ");
        total += sideC;
        greater = greater > sideC ? greater : sideC;
        final String equilateral = sideA == sideB && sideB == sideC ? "equilateralo" : "";
        final String isosceles = sideA == sideB || sideB == sideC ? "isosceles" : "";
        String msgType = equilateral != "" ? equilateral : isosceles;
        final String scalene = sideA != sideB && sideB != sideC && sideC != sideA ? "escaleno" : "";
        msgType = scalene != "" ? scalene : msgType;
        console.writeln("Los lados " + sideA + ", " + sideB + " y " + sideC 
                + (total - greater > greater ? "" : " NO")
                + " forman un triangulo " + msgType == "" ? "" : "de tipo " + msgType);

    }
}
