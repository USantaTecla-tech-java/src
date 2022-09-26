package es.usantatecla.a0_itinerario.a2_estructurada.a4_tablas.a2_1_null;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int primitive1 = 1;
    int primitive2 = primitive1;
    console.writeln(primitive1); // 1
    console.writeln(primitive2); // 1
    primitive2 = 2;
    console.writeln(primitive1); // 1
    console.writeln(primitive2); // 2
    primitive1 = 555;

    int[] array1 = new int[] { 1, 2, 3 };
    console.writeln(array1); // 1,2,3
    int[] array2 = array1;
    console.writeln(array2); // 1,2,3
    array1[1] = 666;
    console.writeln(array1); // 1,666,3
    console.writeln(array2); // 1,666,3
    console.writeln(array1 == array2); // true
    array1 = new int[] { 1, 666, 3 };
    console.writeln(array1); // 1,666,3
    console.writeln(array2); // 1,666,3
    console.writeln(array1 == array2); // false
    array2[1] = 0;
    console.writeln(array1); // 1,666,3
    console.writeln(array2); // 1,0,3

    array1 = null;
    console.writeln(array1); //
    console.writeln(array2); // 1,0,3
    array1 = new int[] {};
    for (int i = 0; i < array2.length; i++) {
      array1[i] = array2[i];
    }
    console.writeln(array1); // 1,0,3
    console.writeln(array2); // 1,0,3
    console.writeln(array1 == array2); // false
    array2 = null;
    console.writeln(array1); // 1,0,3
    console.writeln(array2); //
  }
}
