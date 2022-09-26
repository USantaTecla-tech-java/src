package es.usantatecla.a0_itinerario.a2_estructurada.a3_secuencial.a4_agrupacion;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int x = 3;
    while (x > 0) {
      console.write(x + ", "); // 3, 2, 1,
      x--;
    }
    console.writeln(x + "."); // 0.
    
    do {
      console.write(x + ", "); // 0, 1, 2,
      x++;
    } while (x < 3);
    console.writeln(x + "."); // 3.
    
    for (int i = 0; i < x; i++){
      console.write(i + ": "); 
      console.write(x + ", "); 
    }
    console.writeln(); // 0: 3, 1: 3, 2: 3,
    
    for (int i = x; 0 < i; i--){
      console.write(i + ": "); 
      console.write(x + ", "); 
    }
    console.writeln(); // 3: 3, 2: 3, 1: 3,
  }
}




