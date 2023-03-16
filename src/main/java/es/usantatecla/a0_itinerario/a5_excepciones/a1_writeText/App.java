package es.usantatecla.a0_itinerario.a5_excepciones.a1_writeText;

import java.io.IOException;
import java.io.PrintWriter;

class App {

  public static void main(String[] args) {
    PrintWriter out = null;
    try {
      out = new PrintWriter("./src/main/resources/fichero.txt");
      out.print(1);
      out.print(':');
      out.print(" juan = ");
      out.println(5.5);
      out.println(2 + ": jose = " + 7.2);
      Console.getInstance().writeln("Fichero generado");
    } catch (IOException ex) {
      Console.getInstance().writeln("IOException al escribir:" + ex.getMessage());
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }
}
