package es.usantatecla.a0_itinerario.a2_estructurada.a4_tablas.a5_null;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int[][] array = new int[][] { { 1, 666, 3 }, null, { 0 } };
    for (int[] row : array) {
      if (row != null) {
        for (int value : row) {
          console.writeln(value + ", "); // 1, 666, 3, 0
        }
      }
    }
    array[2] = null;
    array[1] = array[0];
    for (int[] row : array) {
      if (row != null) {
        for (int value : row) {
          console.writeln(value + ", "); // 1, 666, 3, 1, 666, 3,  
        }
      }
    }
  }
}
