package es.usantatecla.a0_itinerario.a2_estructurada.a4_tablas.a4_modificacion;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int[] array = new int[] { 1, 2, 3, 4, 5 };
    console.writeln(array + " con " + array.length); // 1,2,3,4,5 con 5 items

    int[][] bidimensional = new int[][] {
        { 1, 2, 3 },
        { 0 },
        { 9, 8, 7 }
    };
    int[] temp = bidimensional[0];
    bidimensional[0] = bidimensional[1];
    bidimensional[1] = bidimensional[2];
    bidimensional[2] = temp;
    for(int[] unidimensional : bidimensional){
      for(int atom : unidimensional){
        console.writeln(atom);
      }
    }
  }
}