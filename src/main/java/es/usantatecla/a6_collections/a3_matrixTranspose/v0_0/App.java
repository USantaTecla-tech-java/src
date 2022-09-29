package es.usantatecla.a6_collections.a3_matrixTranspose.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int[][] matrix = new int[][] {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 },
    };

    int[][] transposed = new int[matrix.length][];
    for (int i = 0; i < matrix.length; i++) {
      transposed[i] = new int[matrix[i].length];
      for (int j = 0; j < matrix[i].length; j++) {
        transposed[i][j] = matrix[j][i];
      }
    }
    console.writeln("Matriz original: ");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        console.write(matrix[j][i] + ", ");
      }
      console.writeln();
    }
    console.writeln("Matriz original: ");
    for (int i = 0; i < transposed.length; i++) {
      for (int j = 0; j < transposed[i].length; j++) {
        console.write(matrix[j][i] + ", ");
      }
      console.writeln();
    }
  }
}
