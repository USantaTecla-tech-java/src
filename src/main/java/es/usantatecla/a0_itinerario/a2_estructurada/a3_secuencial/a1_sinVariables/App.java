package es.usantatecla.a0_itinerario.a2_estructurada.a3_secuencial.a1_sinVariables;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    {
      console.writeln("- Inicio secuencial");
      {
        console.writeln("  - Inicio secuencial interno");
        {
          console.writeln("    - Hasta el infinito");
          console.writeln("    - y más allá ... no!");
        }
        console.writeln("  - Fin secuencial interno");
      }
      console.writeln("- Fin secuencial");
    }

    console.writeln("- Inicio secuencial");
    console.writeln("  - Inicio secuencial interno");
    console.writeln("    - Hasta el infinito");
    console.writeln("    - y más allá ... no!");
    console.writeln("  - Fin secuencial interno");
    console.writeln("- Fin secuencial");
  }
}
